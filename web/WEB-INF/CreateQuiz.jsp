<%-- 
    Document   : CreateQuiz
    Created on : Nov 16, 2019, 11:00:17 PM
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
        <h1>Create Quiz PPN</h1>
        <br>
        <h2>Welcome : ${user.fullname}</h2>
        <hr><h3>${message}</h3>
        <c:if test="${who=='teachet'}">
        <form action="CreateQuiz" method="post">
        Quiz name : <input type="text" name="quizname">
        <br><br>
        Quiz details : <input type="text" name="quizdetails">
        <br><br>
        <input type="submit">
        </form>
        </c:if>
        
        <a href="Home">Back to Home</a>
    </body>
</html>
