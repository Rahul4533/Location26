<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Location | update</title>
</head>
<body>
<h2>Location | Update</h2>
<form action="updateData" method="post">
<pre>
ID<input type="text" name="id" value="${location.id }"/>
name<input type="text" name="name" value="${location.name }"/>
code<input type="text" name="code" value="${location.code }"/>
Type:
   Urban<input type="radio" value="urban" name="type" value="${location.type }"/>
   rural<input type="radio" value="rural" name="type"  value="${location.type }"/>
   <input type="submit" value="update"/>
   
</pre>
</form>
${msg }
</body>
</html>