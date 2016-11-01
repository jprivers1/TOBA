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
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jpriv
 */public class PasswordResetServlet extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String url;
        
        String newPassword = request.getParameter("newPassword");
        
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        
        user.setPassword(newPassword);
        //session.removeAttribute("user");
       // session.setAttribute("user", user);
        
        url = "/account_activity.jsp";
        
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}


