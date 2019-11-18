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
    
</script>
        <title>PPN Quiz</title>
        <script>
         
            
            </script>
    </head>
    <center><body>
        <h1>Register to PPN Quiz For Teacher</h1>
        <h2>${message}</h2>
        <hr>
        <form action="TRegister" method="post">
            TeacherID : <input type="text" name="id" maxlength="4" minlength="4" required><br><br>
            Firstname : <input type="text" name="username" required><br><br>
            Lastname  : <input type="text" name="lastname" required><br><br>
            Password  : <input type="password" name="password" required><br><br>
            Confirm Password : <input type="password" name="confirmpass" required><br><br>
            Owner Subject : <input type="text" name="ownerSubject" required><br><br>
            Department : 
            <input type="radio" name="department" value="Information Technology" >Information Technology<br><br> 
            <input type="radio" name="department" value="Computer Science">Computer Science<br><br>
            <input type="radio" name="department" value="Digital Service Innovation">Digital Service Innovation          
            <br><br>
            <input type="submit"><br><br>
            <a href="TLogin.jsp">Back to Login Teacher</a>
        </form>
        </body></center>
</html>
