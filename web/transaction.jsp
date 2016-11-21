<%-- 
    Document   : transaction
    Created on : Oct 31, 2016, 8:59:31 PM
    Author     : jpriv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <c:import url="/includes/header.html"/>

        <h2>Transactions</h2>
        <section>
            
			<form method="post" action="transaction">
                            <label>Accounts</label><br>
                            <label>Checking:</label><br>
                            <label>${checking.balance}</label><br>
                            <label>Savings:</label><br>
                            <label>${savings.balance}</label><br>
                            
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
