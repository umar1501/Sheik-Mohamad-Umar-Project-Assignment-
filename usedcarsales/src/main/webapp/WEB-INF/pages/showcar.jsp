<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Cars</title>
</head>
<body>

<c:out value="${list}"/>
<table>
<tr>
  <th>Brand</th>
  <th>Model</th>
  <th>YOM</th>
  <th>KMS_Traveled</th>
  <th>Status</th>
</tr>
<c:forEach items="${list}" var="eachItem">
 <tr>
  <td><c:out value="${eachItem.brand}"/></td>
  <td><c:out value="${eachItem.model}"/></td>
  <td><c:out value="${eachItem.yom}" /></td>
  <td><c:out value="${eachItem.kms_traveled}" /></td>
  <td><c:out value="${eachItem.status}" /></td>
</tr>
</c:forEach>
</table>
</body>
</html>