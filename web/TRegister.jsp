<%-- 
    Document   : TRegister
    Created on : Nov 12, 2019, 9:54:43 PM
    Author     : theeradonjaroonchon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Register to PPN Quiz For Teacher</h1>
        <h2>${message}</h2>
        <hr>
        <form action="TRegister" method="post">
            TeacherID : <input type="text" name="id"><br><br>
            Firstname : <input type="text" name="username"><br><br>
            Lastname  : <input type="text" name="lastname"><br><br>
            Password  : <input type="password" name="password"><br><br>
            Owner Subject : <input type="text" name="ownerSubject"><br><br>
            Department : 
            <input type="radio" name="department" value="Information Technology">Information Technology<br><br> 
            <input type="radio" name="department" value="Computer Science">Computer Science<br><br>
            <input type="radio" name="department" value="Digital Service Innovation">Digital Service Innovation          
            <br><br>
            <input type="submit">
            <a href="Login.jsp">Back to Login</a>
        </form>
    </body>
</html>
