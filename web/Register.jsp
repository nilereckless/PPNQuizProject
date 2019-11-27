<%-- 
    Document   : Register
    Created on : Nov 11, 2019, 11:03:09 PM
    Author     : theeradonjaroonchon
--%>

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
                background-color: #adfca5;
                font-family: 'Alatsi', sans-serif;
                color: #4b0c3b;
            }
            div.form-group{
                margin-left: 555px;
                margin-right : 555px;
            }
            div.body{


                margin-top: 95px;

            }
        </style>

    </head>
    <center><body>
            <nav class="navbar navbar-expand-sm bg-secondary navbar-dark fixed-top">
                <a class="navbar-brand" href="Welcome.jsp">
                    <img src= "./Picture/Logo.svg" alt="logo" style="width:40px; padding-top: 10px ; margin-left:  10px ">
                </a>
                <span class="navbar-text" style="padding-top: 10px ; margin-left:5px; font-family: 'Alatsi', sans-serif;  font-size:22px ; color: whitesmoke;">
                    PPNQuiz
                </span>
            </nav> 
            <div class="body">
            <h1>Register PPN Quiz</h1>    
            <h2>${message}</h2>          
            <form action="Register" method="post">
                StudentID : <input type="number" name="id" minlength="13" maxlength="13" required><br><br>
                Yourname : <input type="text" name="fullname" required><br><br>
                <%--<Lastname : <input type="text" name="lastname" required><br><br>--%>
                Password : <input type="password" name="password" required><br><br>
                Confirm Password : <input type="password" name="confrimpass" required><br><br>
                G-mail : <input type="text" name="email" required><br><br>
                Student Year : <input type="number" name="year" required><br><br>
                Department  <div class="form-group"><br>
                    <select class="form-control" name="department" >
                    <option value="Information Technology">Information Technology</option>
                    <option value="Computer Science">Computer Science</option>
                    <option value="Digital Service Innovation">Digital Service Innovation    </option>
                </select>
                   <br><br>
                   <input type="submit"><br><br>
                <a href="Login.jsp">Back to Login</a>
            </form>
            </div>
        </body></center>
</html>
