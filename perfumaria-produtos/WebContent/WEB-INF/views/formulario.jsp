<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Adicionar Produtos</h3>
<form:errors path="nome_produto"/>
<form:errors path="nome_produto" cssStyle="color:red"/>
<form action="adicionaProduto" method="post">
	<table>
		<tr>
			<td>
				Nome:
			</td>
		</tr>
		<tr>
			<td>
				<input type="text" name="nome_produto"></input>											
			</td>			
		</tr>
		<tr>
			<td>
				Marca:
			</td>
		</tr>
		<tr>
			<td>	
				<input type="text" name="marca_produto"></input>
			</td>
		</tr>
		<tr>
			<td>
				Genero:
			</td>
		</tr>
		<tr>
			<td>
				<input type="text" name="genero_produto"></input>
			</td>
		</tr>
		<!--<tr>
			<td>
				Valor de Custo:
			</td>
		</tr>
		<tr>
			<td>	
				<input type="text" name="valorDeCusto_produto"></input>
			</td>
		</tr>
		<tr>
			<td>
				Valor de Venda:
			</td>
		</tr>
		<tr>
			<td>
				<input type="text" name="valorDeVenda_produto"></input>
			</td>
		</tr>
		<tr>
			<td>
				Categoria:
			</td>
		</tr>
		<tr>
			<td>
				<input type="text" name="categoria_produto"></input>
			</td>
		</tr>
		<tr>
			<td>
				Quantidade de Unidades:
			</td>
		</tr>
		<tr>
			<td>
				<input type="text" name="quantidade_produto"></input><br />
			</td>
		</tr>
		<tr>
			<td>
				Quantidade de Mililitros:
			</td>
		</tr>
		<tr>
			<td>
				<input type="text" name="quantidade_produto"></input>
			</td>
		</tr> -->
		<tr>
			<td>
				<input type="submit" value="Incluir">
			</td>
		</tr>
	</table>
</form>
</body>
</html> 