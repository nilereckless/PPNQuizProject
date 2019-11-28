<%-- 
    Document   : ITFundamental
    Created on : Nov 27, 2019, 11:28:55 PM
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
            1.) Which choice doesn't have in Flow Chart       <br>
            <br>
            <label> <input type="radio" name="d" required="required"> a.) Decision   </label> <br>
            <label> <input type="radio" name="d"> b.) Process  </label> <br>
            <label> <input type="radio" name="d" value="correct"> c.) Picture </label> <br>
            <label> <input type="radio" name="d"> d.) Start/End  </label>   <br>
            <hr>
            2.) How much are the credit you can get from this subject?        <br>
          <label> <input type="radio" name="e" required="required" value="correct"> a.) 3 credit  </label> <br>
          <label> <input type="radio" name="e"> b.) 1 credit  </label> <br>
          <label> <input type="radio" name="e"> c.) 2 credit  </label> <br>
          <label> <input type="radio" name="e"> d.) 6 credit  </label>  <br> 
         <hr>
           3.) What's the code of this subject ?        <br>
            <br>
           <label> <input type="radio" name="h" required="required"> a.) INT104  </label> <br>
           <label> <input type="radio" name="h" value="correct"> b.) INT101  </label> <br>
           <label> <input type="radio" name="h"> c.) INT105  </label> <br>
           <label> <input type="radio" name="h"> d.) INT107 </label> <br> 
         <hr>
           4.) What's the layer5 in OSI Model?          <br>
           <label> <input type="radio" name="i" required="required" > a.) Application Layer  </label>
           <label> <input type="radio" name="i" value="correct"> b.) Session Layer  </label> <br>
           <label> <input type="radio" name="i"> c.) Transport Layer   </label> 
           <label> <input type="radio" name="i"> d.) Network Layer   </label><br> 
         <hr>
           5.) What is your Teacher name of this subject?         <br>
            <br>
           <label> <input type="radio" name="j" required="required"> a.) Mr.Prayuth   </label>
           <label> <input type="radio" name="j"> b.) Ms.Yingluk  </label>
           <label> <input type="radio" name="j"> c.) Ms.Donut  </label>
           <label> <input type="radio" name="j" value="correct"> d.) Mr.Siam </label>
            <hr>
            <input type="submit" value="Submit">
        </form>
    </body>
</html>
