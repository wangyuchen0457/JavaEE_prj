<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="global">
		<h4>The product has been saved!</h4>
		<h5>Details:</h5>
		Tips${message}<br/>
		Product ID:${product.id}<br/>
		Product Name:${product.name}<br/>
		Description:${product.description}<br/>
		Price:￥${product.price}<br/>
		Color:${product.color}<br/>
		Number:${product.number}<br/>
	</div>
	<a href="/SpringMvc4.3-Start-self/index.html">返回</a>
</body>
</html>