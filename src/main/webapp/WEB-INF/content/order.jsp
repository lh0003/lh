<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订单详情</title>
</head>
<body>
<a href="main">返回主页</a>
<table border="1">
	<tr>
		<th>图片</th><th>商品编号</th><th>商品名</th><th>用户名</th><th>价格</th><th>店铺id</th><th>数量</th><th>订单状态</th><th>确认收货</th>
	</tr>
	<c:forEach items="${requestScope.order_list }" var="order">
	<form action="ensure" method="get">
<tr>
			<input type="hidden" value="${order.book_id}" name="book_id"/>
			<input type="hidden" value="${order.user_id}" name="user_id"/>
			<td><img src="image/${order.image }" width=100 height="100"></td>
			<td>${order.book_id}</td>
			<td>${order.name }</td>
			<td>${order.user_id }</td>
			<td>${order.price }</td>
			<td>${order.sellerid }</td>
			<td>${order.count }</td>
			<td>${order.state }</td>
			<td><input type="submit" value="确认收货"></button></td>
			
		</tr>
		</form>
	</c:forEach>
	
</table>
	
</body>
</html>