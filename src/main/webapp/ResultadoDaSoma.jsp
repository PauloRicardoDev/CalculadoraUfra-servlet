<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado da Soma</title>
<link rel="stylesheet" href="/src/main/webapp/css/reset.css">
<link rel="stylesheet" href="css/styleIndex.css">
<script src="https://kit.fontawesome.com/4c221199e8.js" crossorigin="anonymous"></script>
</head>
<body>
	<div class="caixa">
		<h1 class="caixa__titulo">Resultado da (Soma  <i class="fa-solid fa-plus"></i>)</h1>
		<h2 class="caixa__titulo__secundario">Vamos calcular</h2>
		<p class="caixa__info">"Aqui seu resultado"</p>
		<p class="caixa__resultado" ><%= request.getAttribute("valorVar") %>+<%= request.getAttribute("const") %>=<%= request.getAttribute("total") %></p>
		<br>
		<button onclick="history.back()">Voltar</button>
	</div>
</body>
</html>