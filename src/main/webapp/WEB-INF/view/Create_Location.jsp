<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
        <%@ include file="menu.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Location | Create</title>
</head>
<body>
<h2>Location | Controller</h2>
<form action="savelocation" method="post">
<pre>
ID<input type="text" name="id"/>
name<input type="text" name="name"/>
code<input type="text" name="code"/>
Type:
   Urban<input type="radio" value="urban" name="type"/>
   rural<input type="radio" value="rural" name="type"/>
   <input type="submit" value="save"/>
   
</pre>
</form>
${msg }
</body>
</html>