<%-- 
    Document   : transfer_funds
    Created on : Nov 19, 2016, 6:27:27 PM
    Author     : jpriv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <c:import url="/includes/header.html"/>
        <section>
            
			<form method="post" action="transaction">
                            <label>Account</label><br>
                            <label>Checking</label><br>
                            <label>${checkingBalance}</label><br>
                            <label>Savings</label><br>
                            <label>${savingsBalance}</label><br>
                            
			<label>Transfer from: </label>
                        <input type="text" name="fromAcct"><br>
			<label>Transfer to: </label>
                        <input type="text" name="toAcct"><br>
			<label>Amount: </label>
                        <input type="text" name="transferAmt"><br>                      
                        
                        <input type="submit" value="Transfer Funds">
			</form>
	</section>

            <c:import url="/includes/footer.jsp"/>
