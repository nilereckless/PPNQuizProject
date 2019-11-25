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
        <title>PPN Quiz </title>
        <script>
            var currentDate = new Date(),
                    day = currentDate.getDate(),
                    month = currentDate.getMonth() + 1,
                    year = currentDate.getFullYear();
            document.write(day + "/" + month + "/" + year)
            
            var currentTime = new Date(),
                    hours = currentTime.getHours(),
                    minutes = currentTime.getMinutes();

            if (minutes < 10) {
                minutes = "0" + minutes;
            }

            document.write(hours + ":" + minutes)
        </script>
    </head>  
    <center><body>
            <h1>PPN Quiz for SIT</h1>
            <h2><a href="TLogin.jsp">PPN Quiz For Teacher</a></h2>
            <h2>${message}</h2>
            <hr>
            <form action="Login" method="post">
                StudentID : <input type="text" name="id" maxlength="13"> 
                <br><br>
                Password : <input type="password" name="password">
                <br><br>
                <input type="submit"> 
                <br><br>

            </form>
            <a href="Register.jsp">Register</a>
        </body></center>
</html>
