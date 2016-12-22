<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>
<head>
	<title>MenuView</title>
</head>
<body>
<h1>
	Vista de Provincias
</h1>
<a>${enlace }</a>
	<table> 
		<tr> 
		<th> Provincias </th> 
			
		</tr> 
	<c:forEach items="${listaProvincia}" var="provincia"> 
		<tr> 
		<td> <c:out value="${provincia.nombre}"/></td> 
		
		
		</tr> 
	</c:forEach> 
	</table>
	
<a href="/spring/menu">volver a menu </a>
<br>
<a href="/spring/pruebas">volver a pruebas </a> 
</body>
</html>
