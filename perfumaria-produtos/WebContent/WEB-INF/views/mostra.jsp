<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang='pt-BR'>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="listaProdutos">Lista de Produtos</a>
	<h3>Alterar produto - ${produto.id}</h3>
	
	<form action="alteraProduto" method="post">
	
    	<input type="hidden" name="id" value="${produto.id}" />
  
    		Nome:<br />
    		<input type="text" name="nome_produto" value="${produto.nome_produto}">
      			${produto.nome_produto}
    		</ input><br />  
    		Marca:<br />
    		<input type="text" name="marca_produto" value="${produto.marca_produto}">
      			${produto.marca_produto}
   	 		</ input><br />  
    		Genero:<br />
    		<input type="text" name="genero_produto" value="${produto.genero_produto}">
      			${produto.genero_produto}
    		</ input><br />  
    	<input type="submit" value="Alterar"/>
  </form>
</body>
</html>