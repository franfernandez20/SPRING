<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" >

</head>
<body>
<ol class="breadcrumb">
  <li><a href="/spring/pruebas">Home</a></li>
  <li><a href="/spring/menu">Paises</a></li>
  
  <li class="active">Pruebas</li>
</ol>
<div class="jumbotron">
  <h1>Formulario</h1>
  
<form action="menuview">
	 <div class="form-group"> <!-- Full Name -->
        <label for="id_pais" class="control-label">Pais</label>
        <input type="text" class="form-control" id="id_pais" name="pais" placeholder="Spain">
        <br>
    	<button type="submit" class="btn btn-primary" >Enviar</button> 
    </div> 

</form>
 <br/>
 <form action="recibir" method="post">
 	<div class="form-group">
 		<label for="id_nombre" class="control-label"> Nombre</label>
 		<input type="text" class="form-control" name="name" id="id_nombre">
 	</div>
 	<div class="form-group">
 		<label for="id_option" class="control-label"> Opciones</label>
 		 <select class="form-control" id="id_option" name="opcion">
 			<option value="Opc1">Opc1</option>
            <option value="Opc2">Opc2</option>
            <option value="Opc3">Opc3</option>
            <option value="Opc4">Opc4</option>
          </select> 
 	</div>
 	 <div class="form-group"> <!-- Submit Button -->
        <button type="submit" class="btn btn-primary">Enviar</button>
    </div>     
 	
 	
 </form>
 

 <!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" ></script>
 <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>

</body>
</html>