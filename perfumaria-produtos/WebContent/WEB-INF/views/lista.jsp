<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="novoProduto">Adicionar novo produto</a> 
	
  <br /> <br />        

  <table>
  	<tr>
    <th>Id</th>
    <th>Nome</th>
    <th>Marca</th>
    <th>Genero</th>
    <!--<th>Valor de Custo</th>
    <th>Valor de Venda</th>
    <th>Data de Fabricação</th>
    <th>Validade</th>
    <th>Categoria</th>
    <th>Quantida</th>
    <th>Quantidade de Mililitros</th>-->
    
  </tr>
<c:forEach items="${produtos}" var="produto">
    <tr>
      	<td>${produto.id}</td>
      	<td>${produto.nome_produto}</td>
      	<td>${produto.marca_produto}</td>
      	<td>${produto.genero_produto}</td>
      	<!--<td>${produto.valorDeCusto_produto}</td>
      	<td>${produto.valorDeVenda_produto}</td>
      	<td>${dataDeFabricacao_produto}</td>
        <td>${validade_produto}</td>     	
     	<td>${categoria_produto}</td>
     	<td>${quantidade_produto}</td>
      	<td>${quantidaDeMililitros_produto}</td>
     <td>
       <!--<fmt:formatDate 
          	value="${dataDeFabricacao_produto.time}" 
          	pattern="dd/MM/yyyy"/>
		<fmt:formatDate 
          	value="${validade_produto.time}" 
          	pattern="dd/MM/yyyy"/> 
     </td>-->
     <td><a href="mostraProduto?id=${produto.id}">Alterar</a></td>
     <td><a href="removeProduto?id=${produto.id}">Remover</a></td>
    </tr>
  </c:forEach>
  </table>
</body>
</html>