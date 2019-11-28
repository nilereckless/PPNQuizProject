<%-- 
    Document   : ShowPoint
    Created on : Nov 27, 2019, 11:33:24 PM
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
        <form action="Check" method="post">
            <h2>
                
                Your Total Point is : ${count} /100 <br><br>
                Distribution : Remember ${remember} points <br><br>
                Understand :${understand}  points</h2>
        </form>
        <a href="Home">Back to Home</a>
    </body>
</html>
