<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resultado da Multiplicacao</title>
<link rel="stylesheet" href="/src/main/webapp/css/reset.css">
<link rel="stylesheet" href="css/styleIndex.css">
<script src="https://kit.fontawesome.com/4c221199e8.js" crossorigin="anonymous"></script>
</head>
<body>
    <div class="caixa">
		<h1 class="caixa__titulo">Resultado da (Multiplicacao<i class="fa-solid fa-xmark"></i>)</h1>
		<h2 class="caixa__titulo__secundario">Vamos calcular</h2>
		<p class="caixa__info">"Seu Resultado"</p>
	    <p class="caixa__resultado"><%= request.getAttribute("valor1") %> X <%= request.getAttribute("valor2") %> = <%= request.getAttribute("total") %></p>
        <a class="caixa__voltar" href="index.html"><i id="caixa__icon" class="fa-solid fa-arrow-rotate-left"></i></a>
    </div>
</body>
</html>