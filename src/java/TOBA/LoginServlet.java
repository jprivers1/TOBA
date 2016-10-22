/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TOBA;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
        
        if (userName.equals("jsmith@toba.com") && password.equals("letmein")){
            url = "/account_activity.html";
            
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
