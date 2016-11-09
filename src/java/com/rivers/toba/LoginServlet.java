/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rivers.toba;

import com.rivers.toba.user.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jpriv
 */
public class LoginServlet extends HttpServlet {

  
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
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        
        HttpSession session = request.getSession();           
        User user = (User)session.getAttribute("user");
        
        
        
      
        
        if (userName.equals(user.getUsername()) && password.equals(user.getPassword())){
            url = "/account_activity.jsp";
            
            getServletContext()
                    .getRequestDispatcher(url)
                    .forward(request, response);
        }else{
            url = "/login_failure.html";
            
            getServletContext()
                    .getRequestDispatcher(url)
                    .forward(request, response);
        }
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
