<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>
<c:out value="${heading}"/><br>

<a href = "cars">Add Car</a><br>
<a href = "cars/all">View Cars</a><br>
<a href = "cars/carsforsale">Cars For Sale</a><br></h1>
 Available brands:Mahindra,Toyota,Honda
 <br><h1>
 Select Brand:<br>
 <a href = "cars/mahindrabrand">Mahindra</a><br>
<a href = "cars/toyotabrand">Toyota</a><br>
<a href = "cars/hondabrand">Honda</a><br>
</h1>

</body>
</html>