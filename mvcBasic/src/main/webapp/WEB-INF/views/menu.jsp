<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Paises</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" >

</head>
<body>
<ol class="breadcrumb">
  <li><a href="/spring/pruebas">Home</a></li>
  <li><a href="/spring/menu">Paises</a></li>
  
  <li class="active">Pruebas</li>
</ol>

	<div class="panel panel-default">
	  <!-- Default panel contents -->
	  <div class="panel-heading">Paises</div>
	  

  <!-- Table -->
  <table class="table"> 
	 
			
		
		<c:forEach items="${listaPais}" var="pais"> 
		<tr> 
			<td> 
				<a href="menuview?pais=<c:out value="${pais.nombre}"/>">
				<c:out value="${pais.nombre}"/>
				</a> 
			</td> 		
		</tr> 
		</c:forEach> 
	</table> 
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" ></script>
 <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>

</body>
</html>
