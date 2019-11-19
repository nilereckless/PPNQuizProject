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
    </head>
    <center><body>
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
            <a href="Login.jsp">Back to Login Student</a>
            
            
        </form></center>
    </body>
</html>
