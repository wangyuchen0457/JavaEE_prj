<?xml version="1.0" encoding="utf-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table align="center" border="1" cellspacing="0" width="680">
	<tr>
		<th>序号</th>
		<th>ID</th>
		<th>名称</th>
		<th>描述</th>
		<th>价格</th>
		<th>颜色</th>
		<th>数量</th>
		
	</tr>
<c:forEach items="${pList}" var="product" varStatus="vs" >	
	<tr>
		<td>${vs.count}</td>
		<td>${product.id}</td>
		<td>${product.name}</td>
		<td>${product.description}</td>
		<td>${product.price}</td>
		<td>${product.color}</td>
		<td>${product.number}</td>
		<td width="120">
			<a href="product_modiform.action?id=${product.id}">修改</a>&nbsp;
			<a href="product_del.action?id=${product.id}">删除</a>
			
		</td>
	</tr>
	</c:forEach> 
</table>
<a href="http://localhost:8080/SpringMvc4.3-Start-self/">返回</a>
</body>
</html>