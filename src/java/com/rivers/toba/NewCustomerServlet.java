/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rivers.toba;

import com.rivers.toba.user.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jpriv
 */
public class NewCustomerServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   
        String url;
        
        //Pull data from form
        String action = request.getParameter("action");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String zipCode = request.getParameter("zip_code");
        String email = request.getParameter("email");
        
        String message;
        
        //Create username and temporary password
        String username = lastName + zipCode;    
        String password = "welcome1";
        
        
        //Check if all fields on form are filled out
        if(firstName == null || lastName == null || phone == null || address == null || city == null || state == null || zipCode == null || email == null
                || firstName.isEmpty() || lastName.isEmpty() || phone.isEmpty() || address.isEmpty() || city.isEmpty() || state.isEmpty() || zipCode.isEmpty() || email.isEmpty()){
                
                message = "***Please fill out all fields***";
                url = "/new_customer.jsp";
            
        }else{
            //Create user object with data from form
            User user = new User(firstName, lastName, phone, address, city, state, zipCode, email, username, password);
        
            //Request session and add user to it
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
           
            message = "";
            url = "/success.jsp";
        }  
        
        request.setAttribute("message", message);
         
        //Send user to appropriate page
        getServletContext()
                    .getRequestDispatcher(url)
                    .forward(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
