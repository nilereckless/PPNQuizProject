<%-- 
    Document   : DiscreteMath
    Created on : Nov 27, 2019, 11:27:54 PM
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
            1.) What's the output of (T ^ F) v T = ?     <br>
             <br>
            <label> <input type="radio" name="p" required="required"> a.) F     </label> <br>
            <label> <input type="radio" name="p"> b.) possible T and F  </label> <br>
            <label> <input type="radio" name="p" value="correct"> c.) T   </label> <br>
            <hr>
            2.) How much are the credit you can get from this subject?        <br>
            <label> <input type="radio" name="q" required="required"> a.) 6 credit  </label> <br>
          <label> <input type="radio" name="q"> b.) 2 credit  </label> <br>
          <label> <input type="radio" name="q"> c.) 1 credit  </label> <br>
          <label> <input type="radio" name="q" value="correct"> d.) 3 credit  </label>  <br> 
         <hr>
           3.) What's the output of (F ^ F) ^ F = ?       <br>
           <label> <input type="radio" name="r" required="required"> a.) Maybe not both  </label> <br>
           <label> <input type="radio" name="r"> b.) possible T and F  </label> <br>
           <label> <input type="radio" name="r"> c.) T </label> <br>
           <label> <input type="radio" name="r" value="correct"> d.) F  </label> <br> 
         <hr>
           4.) What's the code of this subject?        <br>
           <br>
           <label> <input type="radio" name="s" required="required"> a.) INT110    </label> <br>
           <label> <input type="radio" name="s" value="correct"> b.) INT104  </label> <br>
           <label> <input type="radio" name="s"> c.) INT112  </label> <br>
           <label> <input type="radio" name="s"> d.) INT108  </label><br> 
         <hr>
           5.) If p = T, So what's about ~p?         <br>
           <label> <input type="radio" name="t" required="required"> a.) possible to be T or F   </label> <br>
           <label> <input type="radio" name="t"> b.) T     </label> <br>
           <label> <input type="radio" name="t" value="correct"> c.) F   </label> <br>
           <label> <input type="radio" name="t"> d.) Not both      </label> <br>
            <hr>
            <input type="submit" value="Submit">
        </form>
    </body>
</html>
