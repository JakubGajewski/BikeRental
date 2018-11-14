<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
    <title>Bike Rental</title>
</head>
<body>
    <table>
        <form:form action="/addRent" modelAttribute="rentForm" method="post">
            Rent start:
            <form:input path="from" id="from"/></br>
            Rent end:
            <form:input path="to" id="to"/></br>
            <button>Submit</button>
        </form:form>
    </table>
</body>
</html>
