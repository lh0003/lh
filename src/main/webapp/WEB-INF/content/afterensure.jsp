<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>去评价</title>
</head>
<body>
<div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
		订单已完成，去<a href="evaluation">评价</a>
		<input type="hidden" value="${request.book_id}" name="user_id"/>
	
		</div>
	</div>
</div>
</body>
</html>