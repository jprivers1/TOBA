<%-- 
    Document   : account_activity
    Created on : Oct 31, 2016, 4:36:41 PM
    Author     : jpriv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <c:import url="/includes/header.html"/>
        
        <c:if test="${sessionScope.user != null}">
            <p>Welcome: ${user.firstName} ${user.lastName}</p>
        </c:if>
        <c:if test="${sessionScope.user == null}">
            <p>Not Logged In</p>
        </c:if>
        
            <p>Account Activity</p>
            
            <c:forEach var="item" items="${trans}">
                <tr>
                    <td>${transactions.transactionId}</td>
                    <td>${transactions.accountId}</td>
                    <td>${transactions.amount}</td>
                </tr>
            </c:forEach>
                <c:forEach var="item" items="${trans2}">
                <tr>
                    <td>${transactions.transactionId}</td>
                    <td>${transactions.accountId}</td>
                    <td>${transactions.amount}</td>
                </tr>
            </c:forEach>
        
            <c:import url="/includes/footer.jsp"/>
