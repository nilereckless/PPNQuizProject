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

        <title>Home PPN Quiz</title>
    </head>
    <body>
        


        <h1>Welcome to PPN Quizzz </h1>
        <br>
        <h2>Welcome : ${user.fullname}</h2>
        <%-- ถ้าเป็นนักเรียนจะขึ้นคณะ  --%>
        <h2><c:if test="${who=='student'}">
                Department : ${user.department}<br><br>
                Year : ${user.syear}<br><br>
                <h4><a href="Logout">Logout</a></h4>
            </c:if></h2>
        <h2><c:if test="${who=='teacher'}">
                Owner Subject : ${user.ownerSubject}<br><br>
                Department : ${user.department}<br><br>
                <h4><a href="TLogin.jsp">Logout</a></h4>
            </c:if></h2>
       
        <hr>

        <a href="SearchQuiz">Search Quiz</a>
        <br><br>
        <a href="CreateQuiz">Create Quiz</a>
        <a href="/PPNQuizProject/SearchQuiz">Search Quiz</a>
        <br><br>
        <a href="/PPNQuizProject/CreateQuiz">Create Quiz</a>


    </body>
</html>
