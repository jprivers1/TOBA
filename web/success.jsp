<%-- 
    Document   : success
    Created on : Oct 31, 2016, 2:31:25 PM
    Author     : jpriv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <c:import url="/includes/header.html"/>
       
        <p>Account has been successfully created.</p>
        
        <table>
            <tr>
                <td>Username: </td>
                <td>${user.username}</td>
            </tr>
            <tr>
                <td>Password: </td>
                <td>${user.password}</td>
            </tr>
            <tr>
                <td>First Name: </td>
                <td>${user.firstName}</td>
            </tr>
            <tr>
                <td>Last Name: </td>
                <td>${user.lastName}</td>
            </tr>
            <tr>
                <td>Phone: </td>
                <td>${user.phone}</td>
            </tr>
            <tr>
                <td>Address: </td>
                <td>${user.address}</td>
            </tr>
            <tr>
                <td>City: </td>
                <td>${user.city}</td>
            </tr>
            <tr>
                <td>State: </td>
                <td>${user.state}</td>
            </tr>
            <tr>
                <td>Zip Code: </td>
                <td>${user.zipCode}</td>
            </tr>
            <tr>
                <td>Email: </td>
                <td>${user.email}</td>
            </tr>
        </table>
  
                <c:import url="/includes/footer.jsp"/>
