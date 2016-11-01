<%-- 
    Document   : login
    Created on : Oct 31, 2016, 8:22:38 PM
    Author     : jpriv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <c:import url="/includes/header.html"/>
        
        <section>
            <form method="post" action="login">
            <label>Username:</label><br>
            <input type="text" name="userName" required><br>
            <label>Password:</label>
            <input type="text" name="password" required><br>
                        
            
             <input type="submit" value="Log In">
            
            </form>
            <a href="new_customer.jsp"><p>New Customer Sign Up</p></a>
            <a href="password_reset.jsp"><p>Reset Password</p></a>
        </section>
        
        <c:import url="/includes/footer.jsp"/>
