<%-- 
    Document   : SearchQuiz
    Created on : Nov 16, 2019, 7:40:42 PM
    Author     : theeradonjaroonchon
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
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
              div.nav{
                padding-top: 8px;
                padding-left: 1170px;
            }
              body{
                background-color: #FCD6A5;
                font-family: 'Alatsi', sans-serif;
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
                                <a class="dropdown-item" href="EditProfile.jsp">Edit Profile</a>
                                <a class="dropdown-item" href="Welcome.jsp">Logout</a></div>
                        </li>
                    </ul>
                </div>            
            </nav>
                            <div class="container" style="padding-top: 120px;">
      
        ${message}
        
        <form action="SearchQuiz" method="post">
            <p style="font-size: 30px;">Search Quiz</p>  <br>
            <input type="text" style="height: 35px; margin-top: 0px;margin-right: 15px;" name="sid">
            <input type="submit" value="Search">

        </form>
        <%--${subject}--%>
        <c:forEach items="${quiz}" var="q">
            <div class="card border-primary mb-3" style="max-width: 18rem;">
                <div class="card-header">${q.quizName}</div>
                <div class="card-body text-primary">
                    <h5 class="card-title">${q.quizDetails}</h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                </div>
            </div>
        </c:forEach>
        
        





    </body>
</html>
