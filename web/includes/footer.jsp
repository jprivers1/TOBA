<%-- 
    Document   : footer
    Created on : Oct 31, 2016, 7:59:38 PM
    Author     : jpriv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ page import="java.util.GregorianCalendar, java.util.Calendar" %>
<%
    GregorianCalendar currentDate = new GregorianCalendar();
    int currentYear = currentDate.get(Calendar.YEAR);
    int currentDay = currentDate.get(Calendar.DATE);
    int currentMonth = currentDate.get(Calendar.MONTH) + 1;
    %>
    <p>&copy; Copyright <%= currentMonth %>/<%= currentDay %>/<%= currentYear%> Titan Online Banking</p>
    </body>
</html>
