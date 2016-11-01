<%-- 
    Document   : new_customer1
    Created on : Oct 23, 2016, 10:48:22 AM
    Author     : jpriv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <c:import url="/includes/header.html"/>
        <section>
            <p>${message}</p>
			<form method="post" action="newCustomer">
			<label>First Name:</label>
                        <input type="text" name="firstName"><br>
			<label>Last Name:</label>
                        <input type="text" name="lastName"><br>
			<label>Phone:</label>
                        <input type="tel" name="phone"><br>
                        <label>Address:</label>
                        <input type="text" name="address"><br>
                        <label>City:</label>
                        <input type="text" name="city"><br>
                        <label>State:</label>
                        <input type="text" name="state"><br>
                        <label>Zip Code:</label><br>
                        <input type="text" name="zip_code"><br>
                        <label>E-mail:</label>
                        <input type="email" name="email"><br>
                        
                        <input type="submit" value="Submit">
			</form>
	</section>

            <c:import url="/includes/footer.jsp"/>
