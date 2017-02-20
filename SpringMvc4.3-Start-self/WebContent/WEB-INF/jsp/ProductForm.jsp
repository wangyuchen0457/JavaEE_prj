<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request['contextPath']}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form action="product_save.action" method="post">
			<fieldset>
				<legend>Add a product</legend>
				<label for="name">Product Name:</label>
				<input type="text" id="name" name="name" value="" tabindex="1"/>
				<span id="message" ></span>
				<br/>
				<label for="descripton">Description:</label>
				<input type="text" id="description" name="description" value="" tabindex="2"/>
				<br/>
				<label for="price">Price:</label>
				<input type="text" id="price" name="price" value="" tabindex="3"/>
				<br/>
				<label for="color">Color:</label>
				<input type="text" id="color" name="color" value="" tabindex="4"/>
				<br/>
				<label for="number">Number:</label>
				<input type="text" id="number" name="number" value="" tabindex="5"/>
				<br/>
				<div id="buttons">
				<label for="dummy"></label>
				<input id="reset" type="reset" tabindex="6"/>
				<input id="submit" type="submit" tabindex="7" value="Add Product"/>
				</div>
			</fieldset>
		</form>
	<script type="text/javascript" src="${ctx}/js/jquery.min.js"></script>
	<script type="text/javascript" src="${ctx}/js/validator.js"></script>
	<script type="text/javascript">
		//<![CDATA[
		$(document).ready(function() {

			$("#name").attr("datatype", "Require").attr("msg", "请填写产品名称！");
			$("#description").attr("datatype", "Require").attr("msg", "请填写产品描述！");
			$("#price").attr("datatype", "Require").attr("msg", "请填写产品价格！");
			$("#color").attr("datatype", "Require").attr("msg", "请填写产品颜色！");
			$("#number").attr("datatype", "Require").attr("msg", "请填写产品数量！");
			$(document.forms[0]).submit(function() {
				return Validator.Validate(this, 4);
			});
		});
		//]]>
	</script>
	</div>
</body>
</html>