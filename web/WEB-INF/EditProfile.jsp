<%-- 
    Document   : EditProfile
    Created on : Nov 19, 2019, 4:11:11 PM
    Author     : theeradonjaroonchon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PPN Quiz</title>
    </head>
    <body>
        <h1>Edit your Information</h1>
        <h2>${message}</h2>
        <hr>
        <form action="EditProfile" method="post">
            Old Password : <input type="password" name="opassword"><br><br>
            New Password : <input type="password" name="npassword"><br><br>
            Confirm Password : <input type="password" name="cpassword"><br><br>         


            <input type="submit" value="Update Password">
        </form>
        <br><br><br>
        <form action="EditName" method="post">
            Old Name : <input type="text" name="ofirstname"><br><br>
            Old Lastname : <input type="text" name="olastname"><br><br>
            New Name : <input type="text" name="nfirstname"><br><br>
            New Lastname : <input type="text" name="nlastname"><br><br>
            Confirm Name : <input type="text" name="cfirstname"><br><br>
            Confirm Lastname : <input type="text"name="clastname"><br><br>
            
            <input type="submit" value="Update Name">
        </form>
        <br>
        <a href="Home">Back to Home</a>
    </body>
</html>
