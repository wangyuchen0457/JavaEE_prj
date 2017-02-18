<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form action="product_modify.action?id=${product.id}" method="post">
			<fieldset>
				<legend>Modify a product:${product.id}</legend>
				<label for="name">Product Name:</label>
				<input type="text" id="name" name="name" value="${product.name}" tabindex="1"/>
				
				<label for="descripton">Description:</label>
				<input type="text" id="description" name="description" value="${product.description}" tabindex="2"/>
				
				<label for="price">Price:</label>
				<input type="text" id="price" name="price" value="${product.price}" tabindex="3"/>
				
				<label for="color">Color:</label>
				<input type="text" id="color" name="color" value="${product.color}" tabindex="4"/>
				
				<label for="number">Number:</label>
				<input type="text" id="number" name="number" value="${product.number}" tabindex="5"/>
				<div id="buttons">
				<label for="dummy"></label>
				<input id="reset" type="reset" tabindex="6"/>
				<input id="submit" type="submit" tabindex="7" value="Modify Product"/>
				</div>
			</fieldset>
		</form>
	</div>
</body>
</html>