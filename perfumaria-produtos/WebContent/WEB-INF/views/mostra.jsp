<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Alterar produto - ${produto.id}</h3>
  <form action="alteraProduto" method="post">

    <input type="hidden" name="id" value="${produto.id}" />
  
    Nome:<br />
    <input type="text" name="nome_produto">
      	${produto.nome_produto}
    </ input><br />  
    <input type="submit" value="Alterar"/>
  </form>
</body>
</html>