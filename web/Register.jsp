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
    </head>
    <center><body>
            <h1>Register PPN Quiz</h1>    
            <h2>${message}</h2>
            
    
            <form action="Register" method="post">
                StudentID : <input type="number" name="id" minlength="13" maxlength="13" required><br><br>
                Yourname : <input type="text" name="fullname" required><br><br>
                <%--<Lastname : <input type="text" name="lastname" required><br><br>--%>
                Password : <input type="password" name="password" required><br><br>
                Confirm Password : <input type="password" name="confrimpass" required><br><br>
                G-mail : <input type="text" name="email"><br><br>
                Student Year : <input type="number" name="year" required><br><br>
                Department : <br><br>
                <input type="radio" name="department" value="Information Technology">Information Technology<br><br> 
                <input type="radio" name="department" value="Computer Science">Computer Science<br><br>
                <input type="radio" name="department" value="Digital Service Innovation">Digital Service Innovation          
                <br><br>
                <input type="submit">
                <a href="Login.jsp">Back to Login</a>
            </form>
        </body></center>
</html>
