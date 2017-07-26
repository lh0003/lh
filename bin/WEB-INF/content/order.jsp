<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Bootstrap 3, from LayoutIt!</title>

    <meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
</head>
<body>
<a href="main">返回主页</a>
<div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
<table class="table">
<thead>
	
		<th>图片</th><th>商品编号</th><th>商品名</th><th>用户名</th><th>价格</th><th>店铺id</th><th>数量</th><th>订单状态</th><th>确认收货</th>
	</thead>
	<c:forEach items="${requestScope.order_list }" var="order">
	<form action="ensure" method="get">
<tr>
			<input type="hidden" value="${order.book_id}" name="book_id"/>
			<input type="hidden" value="${order.user_id}" name="user_id"/>
			<td><img src="image/${order.image }" width=100 height="100"></td>
			<td class="sucsess">${order.book_id}</td>
			<td>${order.name }</td>
			<td class="warning">${order.user_id }</td>
			<td>${order.price }</td>
			<td>${order.sellerid }</td>
			<td class="danger">${order.count }</td>
			<td class="active">${order.state }</td>
			<td><input type="submit" value="确认收货"></button></td>
			
		</tr>
		</form>
	</c:forEach>
	
</table>
		</div>
	</div>
</div>
<script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
</body>
</html>