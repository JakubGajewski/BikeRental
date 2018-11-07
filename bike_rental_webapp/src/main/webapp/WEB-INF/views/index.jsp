<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Bike Rental</title>
</head>
<body>
    <br>Welcome to our bike rental!</br>If you wish to rent a bike in Cracow,
    you are in the right place!</h1>
    <br>We have the following bikes for rent out:
    <br>
    <c:forEach items="${bikes}" var="bike">
        ${bike.toString()}<br>
    </c:forEach>
</body>
</html>
