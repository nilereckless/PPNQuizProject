<%-- 
    Document   : DatabaseManagement
    Created on : Nov 27, 2019, 11:23:36 PM
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
            1.) Match the "SELECT * FROM students"   <br>
            <label> <input type="radio" name="f" required="required"> a.) Can get only 1 row of student  </label> <br>
            <label> <input type="radio" name="f" value="correct"> b.) Can get all of the rows in student  </label> <br>
            <label> <input type="radio" name="f"> c.) Can get 2 rows of student  </label> <br>
            <label> <input type="radio" name="f"> d.) Can get 3-5 rows of student </label>   <br>
            <hr>
            2.) "SELECT FROM * LOVE" What wrong with this statement     <br>
           <br>
          <label> <input type="radio" name="g" required="required"> a.) Don't know  </label> <br>
          <label> <input type="radio" name="g"> b.) SPACE </label> <br>
          <label> <input type="radio" name="g"> c.) No answer </label> <br>
          <label> <input type="radio" name="g" value="correct"> d.) Statement should be SELECT*FROM LOVE</label>  <br> 
         <hr>
           3.) What is "SQL" stands for?            <br>
           <label> <input type="radio" name="a" required="required"> a.) Statement Query Language  </label> <br>
           <label> <input type="radio" name="a" value="correct"> b.) Structured Query Language  </label> <br>
           <label> <input type="radio" name="a"> c.) String Query Language  </label> <br>
           <label> <input type="radio" name="a"> d.) Static-statement Query Language  </label> <br> 
         <hr>
           4.) What is "ER" stands for?         <br>
           <label> <input type="radio" name="b" required="required" value="correct"> a.) Entity-Relationship model </label> <br>
           <label> <input type="radio" name="b" > b.) Entry Relational model   </label> <br>
           <label> <input type="radio" name="b"> c.) Environment-Related model  </label> <br>
           <label> <input type="radio" name="b"> d.) Entrance-  </label><br> 
         <hr>
           5.) What is the fullname of ORCL?       <br>
           <label> <input type="radio" name="c" required="required"> a.) Oreo Relation Coin Love  </label>
           <label> <input type="radio" name="c"> b.) One Relation Corrective List /> ></label>
           <label> <input type="radio" name="c" value="correct"> c.) Oracle  /> </label>
           <label> <input type="radio" name="c"> d.) Onreal /> </label>
            <hr>
            <input type="submit" value="Submit">
        </form>
    </body>
</html>
