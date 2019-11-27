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
        <title>PPN Quiz</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <link href="https://fonts.googleapis.com/css?family=Alatsi&display=swap" rel="stylesheet">
        <style>
            nav{
                background-color: honeydew;
                margin: -10px;
                padding: 10px
            }
            body{
                background-color: #FCD6A5;
                font-family: 'Alatsi', sans-serif;
            }

            div.container{
                padding-top: 80px ;
            }
            div.nav{
                padding-top: 8px;
                padding-left: 1170px;
            }
        </style>
    </head>
    
    <body><center>
        <nav class="navbar navbar-expand-sm bg-secondary navbar-dark fixed-top">
                <a class="navbar-brand" href="Home">
                    <img src= "./Picture/Logo.svg" alt="logo" style="width:40px; padding-top: 10px ; margin-left:  10px ">
                </a>
                <span class="navbar-text" style="padding-top: 15px ; margin-left:5px; font-family: 'Alatsi', sans-serif;float: left;  font-size:22px ; color: whitesmoke;">
                    PPNQuiz  
                </span>
                <div class="nav">
                    <ul class="nav nav-tabs">

                        <li class="nav-item dropdown">
                            <a class="nav-link active dropdown-toggle" data-toggle="dropdown" href="#">I'm ${user.fullname} </a>
                            <div class="dropdown-menu">
                                <a class="dropdown-item" href="#">My account</a>
                                <a class="dropdown-item" href="EditProfile.jsp">Edit Profile</a>
                                <a class="dropdown-item" href="Welcome.jsp">Logout</a></div>
                        </li>
                    </ul>
                </div>            
        </nav><div class="container">
        <h1>Create Quiz PPN</h1>
        <br>
        <h2>Welcome : ${user.fullname}</h2>
        <h2><c:if test="${who=='student'}">
            Department : ${user.department}<br><br>
            Year : ${user.syear}<br><br>
            </c:if></h2>
        <h2><c:if test="${who=='teacher'}">
            Owner Subject : ${user.ownerSubject}<br><br>
            Department : ${user.department}<br><br>
            </c:if></h2>
        <br><br>
        <hr><h3>${message}</h3>
        <c:if test="${who=='teacher'}">          
            <form action="CreateQuiz" method="post">
                Quiz name : <input type="text" name="quizname">
                <br><br>
                Quiz details : <input type="text" name="quizdetails">
                <br><br>
                <input type="submit">
            </form>
        </c:if>
        <br><br>
        <a href="Home">Back to Home</a>
        </div>
    </center></body>
</html>
