<%-- 
    Document   : TLogin
    Created on : Nov 12, 2019, 9:07:39 PM
    Author     : theeradonjaroonchon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <link href="https://fonts.googleapis.com/css?family=Alatsi&display=swap" rel="stylesheet">
        <style>
            body{
                background-color: #a5d2fc;
                font-family: 'Alatsi', sans-serif;
                color: #4b0c3b;
            }
            nav{
                background-color: honeydew;
                margin: -10px;
                padding: 10px
            }
            div.body{
                padding-top: 100px;
            }
        </style>

    </head>
    <center><body>
            <div class="body">
                <nav class="navbar navbar-expand-sm bg-secondary navbar-dark fixed-top">
                    <a class="navbar-brand" href="Welcome.jsp">
                        <img src= "./Picture/Logo.svg" alt="logo" style="width:40px; padding-top: 10px ; margin-left:  10px ">
                    </a>
                    <span class="navbar-text" style="padding-top: 10px ; margin-left:5px; font-family: 'Alatsi', sans-serif;  font-size:22px ; color: whitesmoke;">
                        PPNQuiz
                    </span>
                </nav>
                <img src="Picture/Logo.svg"alt="logo" style="width:120px; "><br><br>
                <h1>PPN Quiz For Teacher</h1>
                <h2>${message}</h2>
                <h4><a href="TRegister.jsp">Register</a></h4>
                <hr>
                <form action="TLogin" method="post">
                    TeacherID : <input type="text" name="id" maxlength="13">
                    <br><br>
                    Password  : <input type="password" name="password">
                    <br><br>
                    <input type="submit"><br><br>
                    <a href="ForgotPassword.jsp">Forgot Password ?</a>
                    <a href="Login.jsp">Back to Login Student</a>


                </form></center>
</body>
</html>
