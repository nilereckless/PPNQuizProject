<%-- 
    Document   : ForgotPassword
    Created on : Nov 25, 2019, 11:03:24 PM
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
                background-color: #adfca5;
                 font-family: 'Alatsi', sans-serif;
                 color: #4b0c3b;
            }
                    nav{
                background-color: honeydew;
                margin: -10px;
                padding: 10px
            }
            div.body{
                padding-top:100px;
                
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
            <div class="body">
                     <h1>  Forget Your Password</h1><br>
            ${msg}
        <form action="ForgotPassword" method="post">
            Fill your E-mail/ID: <input type="text" name="who" autocomplete="off"><br><br>         
        <button type="button" class="btn btn-success">Submit</button><br>
        </form>
        </body></center>
</html>
