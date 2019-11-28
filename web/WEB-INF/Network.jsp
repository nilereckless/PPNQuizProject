<%-- 
    Document   : Network
    Created on : Nov 27, 2019, 11:32:17 PM
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
   <form method="post" action="Check">
            1.) What's the name of Device when you need to used Internet<br>
             <br>
            <label> <input type="radio" name="k" required="required"> a.) Controller  </label> <br>
            <label> <input type="radio" name="k"> b.) Compiler </label> <br>
            <label> <input type="radio" name="k"> c.) Sender </label> <br>
            <label> <input type="radio" name="k" value="correct"> d.) Router </label>   <br>
            <label> <input type="radio" name="k"> e.) Adapter      </label> <br>
            <hr>
            2.) What's the program that we should to config?         <br>
            <label> <input type="radio" name="l" required="required" value="correct"> a.) Putty </label> <br>
          <label> <input type="radio" name="l"> b.) Monkey </label> <br>
          <label> <input type="radio" name="l"> c.) Donkey </label> <br>
          <label> <input type="radio" name="l"> d.) Jerry </label>  <br> 
         <hr>
           3.) What's the name of program to Analyze the information?   <br>
            <br>
           <label> <input type="radio" name="m" required="required"> a.) Sandwhale  </label> <br>
           <label> <input type="radio" name="m"> b.) Dolphin  </label> <br>
           <label> <input type="radio" name="m"> c.) Jellyfish  </label> <br>
           <label> <input type="radio" name="m" value="correct"> d.) Wireshark </label> <br> 
         <hr>
           4.) What's the code subject of this class?        <br>
           <label> <input type="radio" name="n" required="required" value="correct"> a.) INT201</label> <br>
           <label> <input type="radio" name="n" > b.)INT202 </label> <br>
           <label> <input type="radio" name="n"> c.) INT203   </label> <br>
           <label> <input type="radio" name="n"> d.) INT204  </label><br> 
         <hr>
           5.) Who is your ownerSubject        <br>
           <br>
           <label> <input type="radio" name="o" required="required"> a.) Mr.Sanit </label>
           <label> <input type="radio" name="o"> b.) Mr.Pichet </label>
           <label> <input type="radio" name="o" value="correct"> c.) Mr.Kittiphan </label>
           <label> <input type="radio" name="o"> d.) Ms.Pat </label>
            <hr>
            <input type="submit" value="Submit">
        </form>
    </body>
</html>
