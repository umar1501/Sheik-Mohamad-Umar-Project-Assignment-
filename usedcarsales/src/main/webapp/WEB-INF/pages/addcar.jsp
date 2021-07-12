<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Car</title>
</head>
<body>
<p>RowAdded</p><c:out value="${rowAdded}" />

<form:form method="post" action="cars">
<br />
<form:label path="brand">Car Brand</form:label>
<form:input path="brand"/>
<br />
<form:label path="model">Car Model</form:label>
<form:input path="model"/>
<br />
<form:label path="yom">Year Of Manufacture</form:label>
<form:input path="yom"/>
<br />
<form:label path="kms_traveled">Kilometers Traveled</form:label>
<form:input path="kms_traveled"/>
<br />
<form:label path="status">Car Status</form:label>
<form:input path="status"/>
<br />
<input type="submit" value ="Add">

</form:form>
</body>
</html>