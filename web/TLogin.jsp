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
    <body>
        <h1>PPN Quiz For Teacher</h1>
        <h2>${message}</h2>
        <hr>
        <form action="TLogin" method="post">
            TeacherID : <input type="text" name="id">
            <br><br>
            Password  : <input type="password" name="password">
            <br><br>
            <input type="submit">
            <a href="TRegister.jsp">Register</a>
            
        </form>
    </body>
</html>
