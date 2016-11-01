<%-- 
    Document   : password_reset
    Created on : Oct 31, 2016, 3:28:09 PM
    Author     : jpriv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <c:import url="/includes/header.html"/>
        
        <form method="post" action="passwordReset">
            <label>Current Password: </label>
            <label>${user.password}</label><br>
            
            <label>New Password: </label>
            <input type="text" name="newPassword" value=""><br> 
            
            <input type="submit" value="Submit">
        </form>
    
            <c:import url="/includes/footer.jsp"/>
