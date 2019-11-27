<%-- 
    Document   : Login
    Created on : Nov 11, 2019, 10:32:35 PM
    Author     : theeradonjaroonchon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PPN Quiz </title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <link href="https://fonts.googleapis.com/css?family=Alatsi&display=swap" rel="stylesheet">
        <style>
            body{
                background-color: #adfca5;
                font-family: 'Alatsi', sans-serif;
                color: #4b0c3b;
            }
            nav{
                background-color: honeydew;
                margin: -10px;
                padding: 10px
            }
        </style>

    </head>  
    <center><body>
            <body style="height:1500px">
        <nav class="navbar navbar-expand-sm bg-secondary navbar-dark fixed-top">
            <a class="navbar-brand" href="Welcome.jsp">
                <img src= "./Picture/Logo.svg" alt="logo" style="width:40px; padding-top: 10px ; margin-left:  10px ">
            </a>
            <span class="navbar-text" style="padding-top: 10px ; margin-left:5px; font-family: 'Alatsi', sans-serif;  font-size:22px ; color: whitesmoke;">
                PPNQuiz
            </span>
        </nav>
                 <br><br><br><br>
                 <img src="Picture/Logo.svg"alt="logo" style="width:120px; "><br><br>
            <h1>PPN Quiz for SIT Student</h1>
            <h2><a href="TLogin.jsp">PPN Quiz For Teacher</a></h2>
            <h2>${message}</h2>
            <hr>
            <form action="Login" method="post">
                StudentID : <input type="text" name="id" maxlength="13"> 
                <br><br>
                Password : <input type="password" name="password">
                <br><br>
                <input type="submit"> 
                <br><br>

            </form>
            <a href="ForgotPassword.jsp" style="color:#6c757d">Forgot Password ?</a>
            <a href="Register.jsp" style="color: #6c757d" >Register</a>
        </body></center>
</html>
