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
    </head>
    <body>
            ${msg}
        <form action="ForgotPassword" method="post">
            Fill your E-mail/ID:<input type="text" name="who" autocomplete="off"><br>            
        <input type="submit"><br>
        </form>
    </body>
</html>
