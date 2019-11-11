<%-- 
    Document   : Home
    Created on : Nov 11, 2019, 10:34:30 PM
    Author     : theeradonjaroonchon
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome PPN Quiz</h1>
        <br>
        <h2>Welcome : ${user.username}</h2>
        <%-- ถ้าเป็นนักเรียนจะขึ้นคณะ  --%>
            <c:if test="${who=='student'}">
                Faculty : ${user.department}
            </c:if>
        <hr>
        <a href="Network">Network Quiz</a>
        <br><br>
        <a href="Database">Database Quiz</a>
        <br><br>
        <a href="GEN241">GEN241 Quiz</a>
        <br><br>
        <a href="Logout">Logout</a>
    </body>
</html>
