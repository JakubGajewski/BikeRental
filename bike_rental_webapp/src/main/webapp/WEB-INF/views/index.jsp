<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
    <title>Bike Rental</title>
</head>
<body>
    Welcome to our bike rental!<br>
    If you wish to rent a bike in Cracow,
    you are in the right place!<br>
    <br>We have the following bikes to rent:
    <br>
    <c:forEach items="${bikes}" var="bike">
        <br>
        ${bike.toString()}<br>
        <a href="/deleteBike/${bike.id}">remove</a>
        <c:if test="${bike.rented}"><a href="/changeRent/${bike.id}">return</a></c:if>
        <c:if test="${!bike.rented}"><a href="/changeRent/${bike.id}">rent out</a></c:if>
        </br>
    </c:forEach>
    </br>
    <a href="/addBike">Add a new bike</a>
</body>
</html>
