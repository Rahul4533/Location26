<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All locations</title>
</head>
<body>
<h2>List of Locations</h2>
<table>
<tr>
  <th>Id</th>
  <th>name</th>
  <th>codes</th>
  <th>type</th>
  <th>delete</th>
  <th>Update</th>
</tr>
<c:forEach items="${locations }" var="location">
<tr>

<td>${location.id }</td>
<td>${location.name }</td>
<td>${location.code }</td>
<td>${location.type }</td>
<td><a href="delete?id=${location.id }">delete</a>
<td><a href="update?id=${location.id}">Update</a> 
</tr>


</c:forEach>

</table>

</body>
</html>