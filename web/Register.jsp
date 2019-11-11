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
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Register PPN Quiz</h1>
        <h2>${message}</h2>
        <hr>
        <form action="Register" method="post">
            Id : <input type="text" name="id"><br><br>
            Username : <input type="text" name="username"><br><br>
            Password : <input type="password" name="password"><br><br>
            Lastname : <input type="text" name="lastname"><br><br>
            Department : <input type="text" name="department"><br><br>
            <input type="submit">
        </form>
    </body>
</html>
