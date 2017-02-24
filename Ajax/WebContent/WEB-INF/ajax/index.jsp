<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>

<script src="http://libs.baidu.com/jquery/1.9.0/jquery.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="bookmodel" method="post"> 	
		书名：<form:input path="bookName"/><br/>
		重量：<form:input path="bookSize"/><br/>
		价格：<form:input path="bookPrice"/><br/>
		页码：<form:input path="bookPages"/><br/>
		<input type="button" id="submit" value="Submit" />
	</form:form> 
	
	<script type="text/javascript">
		$(function() { 
			$("#submit").click(function() {   
	            var postdata = '{"bookPrice":"' + $('#bookPrice').val() + '","bookPages":"' + $('#bookPages').val() + '","bookName":"' + $('#bookName').val() + '","bookSize":"' + $('#bookSize').val() + '"}';   
			    $.ajax({  
			        type : 'POST',  
			        contentType : 'application/json',  
			        url : 'http://localhost:8080/Ajax/test/ajax',  
			        processData : false,  
			        dataType : 'json',  
			        data : postdata,  
			        success : function(data) {  
			            alert('OK!');  
			        },  
			        error : function() {  
			            alert('error...');  
			        }  
			    }); 
			});
	    });
	</script> 
</body>
</html>