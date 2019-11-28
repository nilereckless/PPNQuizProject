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
    <body>
    <center>
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
                            <a href="EditProfile"class="dropdown-item" href="EditProfile.jsp">Edit Profile</a>
                            <a href="Welcome.jsp" class="dropdown-item">Logout</a></div>

                    </li>
                </ul>
            </div>            
        </nav>



       

        <%-- ถ้าเป็นนักเรียนจะขึ้นคณะ  --%>
        <%-- <h2><c:if test="${who=='student'}">
                Department : ${user.department}<br><br>
                Year : ${user.syear}<br><br>
                <h4><a href="Logout">Logout</a></h4>
            </c:if></h2>
        <h2><c:if test="${who=='teacher'}">
                Owner Subject : ${user.ownerSubject}<br><br>
                Department : ${user.department}<br><br>
                <h4><a href="TLogin.jsp">Logout</a></h4>
            </c:if>
        </h2>--%>


        <div class="container">
        <%-- ถ้าเป็นนักเรียนจะขึ้นคณะ  --%>
        <h1>Welcome to PPN Quizzz </h1>
        <h2>Welcome : ${user.fullname}</h2>
        <br>
        
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
        <%--<a href="FilterDepartment"> List all Quizs to do</a> <br>--%>

        <hr> <a href="SearchQuiz"><button type="button" class="btn btn-outline-success"> Let's get Search Quiz</button></a>
        <br><br>
        <c:if test="${who=='teacher'}">
            <a href="CreateQuiz">Create Quiz</a>
        </c:if>
        <c:if test="${who=='student'}">
            <a href="FilterDepartment"><button type="button" class="btn-outline-success">Your Quiz</button></a><br><br>
        </c:if>
        <a href="EditProfile"><button type="button" class="btn btn-outline-dark">Go to My Account</button></a>





        
        <%-- ถ้าเป็นนักเรียนจะขึ้นคณะ--%>
        <%--<h2><c:if test="${who=='student'}">
                Department : ${user.department}<br><br>
                Year : ${user.syear}<br><br>
                <h4><a href="Logout">Logout</a></h4>
            </c:if></h2>
        <h2><c:if test="${who=='teacher'}">
                Owner Subject : ${user.ownerSubject}<br><br>
                Department : ${user.department}<br><br>
                <h4><a href="TLogin.jsp">Logout</a></h4>
            </c:if></h2>--%>

        




        <%--<a href="EditProfile">My Account</a>

        <br><br>
        <a href="SearchQuiz">Search Quiz</a>
        <br><br>
        <c:if test="${who=='teacher'}">
            <a href="CreateQuiz">Create Quiz</a>
        </c:if>
        <br><br>--%>

        </div>

    </body>
</html>
