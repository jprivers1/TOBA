<%-- 
    Document   : new_customer1
    Created on : Oct 23, 2016, 10:48:22 AM
    Author     : jpriv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Titan Online Banking Application::Register</title>
    </head>
    
    <body>
        <header>
            <h1>Titan Online Banking Application</h1>
        </header>
        <nav>
            <ul>
                <li><a href="index.html">Home</a></li>
                <li><a href="login.html">Log In</a></li>
                <li><a href="new_customer.jsp">Register</a></li>
                <li><a href="account_activity.html">Account Activity</a></li>
            </ul>
        </nav>
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

    </body>
</html>
