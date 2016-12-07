<%-- 
    Document   : reports
    Created on : Dec 7, 2016, 1:02:20 PM
    Author     : jpriv
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reports</title>
    </head>
    <body>
        <h1>Reports</h1>
        <table>
            <tr>
                <th>Users</t>
            </tr>
            <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
            <c:forEach var="item" items="${users.username}">
                <tr>
                    <td>
                        ${users.username}
                    </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
