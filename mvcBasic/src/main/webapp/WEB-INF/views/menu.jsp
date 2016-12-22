<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>
<head>
	<title>Menu</title>
</head>
<body>
<h1>
	Seleccion de Pais  
</h1>

	<table> 
		<tr> 
		<th> Paises </th> 
			
		</tr> 
	<c:forEach items="${listaPais}" var="pais"> 
		<tr> 
		<td> <a href="menuview?pais=<c:out value="${pais.nombre}"/>"><c:out value="${pais.nombre}"/></a> </td> 
		
		
		</tr> 
	</c:forEach> 
	</table> 
</body>
</html>
