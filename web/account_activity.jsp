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
        <section>
            <p>Account Activity</p>
        </section>
            <c:import url="/includes/footer.jsp"/>
