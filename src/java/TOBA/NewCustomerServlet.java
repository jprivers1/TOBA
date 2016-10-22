/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TOBA;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
        
        String action = request.getParameter("action");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String zip_code = request.getParameter("zip_code");
        String email = request.getParameter("email");
        
        String message;
        
        if(firstName == null || lastName == null || phone == null || address == null || city == null || state == null || zip_code == null || email == null){
                //|| firstName.isEmpty() || lastName.isEmpty() || phone.isEmpty() || address.isEmpty() || city.isEmpty() || state.isEmpty() || zip_code.isEmpty() || email.isEmpty()){
                
                message = "Please fill out all fields";
                url = "/new_customer";
            
        }else{
            message = "";
            url = "/success.html";
        }
//May need to convert to .jsp    
        
            getServletContext()
                    .getRequestDispatcher(url)
                    .forward(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
