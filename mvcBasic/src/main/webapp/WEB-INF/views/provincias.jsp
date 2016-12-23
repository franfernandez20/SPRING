<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Provincias</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" >

</head>
<body>
<ol class="breadcrumb">
  <li><a href="/spring/pruebas">Home</a></li>
  <li><a href="/spring/menu">Paises</a></li>
  
  <li class="active">Pruebas</li>
</ol>
<h1>
	Vista de Provincias
</h1>
	
	<div class="panel panel-default">
	  <!-- Default panel contents -->
	  <div class="panel-heading">Provincias</div>
	  

  <!-- Table -->
  <table class="table">
	   
		<c:forEach items="${listaProvincia}" var="provincia"> 
		<tr> 
			<td> 
				<c:out value="${provincia.nombre}"/>
			</td>
			<td>
				<c:out value="${provincia.pais}">NULL </c:out> 
		
		</tr> 
		</c:forEach> 
  </table>
</div>
	
<br>
<a>${enlace }</a>
	
	


<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" ></script>
 <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>

</body>
</html>
