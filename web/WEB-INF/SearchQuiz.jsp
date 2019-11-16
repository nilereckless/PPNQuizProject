<%-- 
    Document   : SearchQuiz
    Created on : Nov 16, 2019, 7:40:42 PM
    Author     : theeradonjaroonchon
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        ${message}
        <form action="SearchQuiz" method="post">
            Search Quiz : <input type="text" name="sid">
            <input type="submit" value="Search">

        </form>
        <%--${subject}--%>
        <c:forEach items="${quiz}" var="q">
            <div class="card border-primary mb-3" style="max-width: 18rem;">
                <div class="card-header">${q.quizName}</div>
                <div class="card-body text-primary">
                    <h5 class="card-title">${q.quizDetails}</h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                </div>
            </div>
        </c:forEach>





    </body>
</html>
