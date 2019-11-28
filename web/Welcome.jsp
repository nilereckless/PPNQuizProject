<%-- 
    Document   : Welcome
    Created on : Nov 27, 2019, 10:43:40 PM
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
                background-color: #FCD6A5;
                font-family:  'Righteous';
            }
            nav{
                background-color: honeydew;
                margin: -10px;
                padding: 10px
            }
            p.who{
                padding-top: 25px;
                padding-left: 90px;
            }
            div.who{
                position: absolute;
                width: 400px;
                height: 112px;
                left: 570px;
                top: 188px;
                font-family: 'Alatsi', sans-serif;
                font-style: normal;
                font-weight: normal;
                font-size: 48px;
                line-height: 60px;
                color: #FAECFF;
                background: #124076;
                border-radius: 20px;
            }
            div.container{
                position: absolute;
                width: 242px;
                height: 90px;
                left: 288px;
                top: 435px;
                font-family: 'Alatsi', sans-serif;
                
            }   
            div.container2{
                position: absolute;
                width: 242px;
                height: 90px;
                left: 1120px;
                top: 435px;
                font-family: 'Alatsi', sans-serif;
             
            }
        </style>
    </head>
    <body style="height:1500px">
        <nav class="navbar navbar-expand-sm bg-secondary navbar-dark fixed-top">
            <a class="navbar-brand" href="Welcome.jsp">
                <img src= "./Picture/Logo.svg" alt="logo" style="width:40px; padding-top: 10px ; margin-left:  10px ">
            </a>
            <span class="navbar-text" style="padding-top: 10px ; margin-left:5px; font-family: 'Alatsi', sans-serif;  font-size:22px ; color: whitesmoke;">
                PPNQuiz
            </span>
        </nav>    
        <div class="who">
            <p class="who"> You are ???</p>
        </div>

        <a href="Login.jsp"><div class="container">
            <button type="button" class="btn btn-outline-success btn-lg ">I'm Student</button>
            </div></a>
        <a href="TLogin.jsp"><div class="container2">
            <button type="button" class="btn btn-outline-info btn-lg ">I'm Teacher</button>
            </div></a>
</html>
