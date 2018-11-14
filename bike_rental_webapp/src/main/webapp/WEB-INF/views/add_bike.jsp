<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
    <title>Bike Rental</title>
</head>
<body>
    <table>
        <form:form action="/addBike" modelAttribute="bikeForm" method="post">
            Bike model:
            <form:input path="model" id="model"/></br>
            Bike type:
            MTB<form:radiobutton path="bikeType" value="MTB"></form:radiobutton>
            ROAD <form:radiobutton path="bikeType" value="ROAD"></form:radiobutton>
            CITY <form:radiobutton path="bikeType" value="CITY"></form:radiobutton>
            CX <form:radiobutton path="bikeType" value="CX"></form:radiobutton>
            TREKKING <form:radiobutton path="bikeType" value="TREKKING"></form:radiobutton></br>
            Bike size:
            XS <form:radiobutton path="bikeSize" value="XS"></form:radiobutton>
            S <form:radiobutton path="bikeSize" value="S"></form:radiobutton>
            M <form:radiobutton path="bikeSize" value="M"></form:radiobutton>
            L <form:radiobutton path="bikeSize" value="L"></form:radiobutton>
            XL <form:radiobutton path="bikeSize" value="XL"></form:radiobutton></br>
            Dupa:
            <form:input path="dupa" id="dupa"/></br>
            <button>Submit</button>
        </form:form>
    </table>
</body>
</html>
