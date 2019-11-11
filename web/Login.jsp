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
        <title>JSP Page</title>
    </head>
    <body>
        <h1>PPN Quiz</h1>
        <h2>${message}</h2>
        <hr>
        <form action="Login" method="post">
            Id : <input type="text" name="id"> 
            <br><br>
            Password : <input type="password" name="password">
            <br><br>
            <input type="submit"> 
            <br><br>
          
        </form>
         <a href="Register.jsp">Register</a>
    </body>
</html>
