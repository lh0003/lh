<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>购物车</title>
</head>
<body>
<h1>我的购物车：</h1>
<a href="main.jap">再逛一逛</a>

<table border="1">
	<tr>
		<th>图片</th><th>商品编号</th><th>商品名</th><th>用户名</th><th>价格</th><th>商品库存</th><th>店铺id</th><th>数量/修改数目</th><th>修改数目</th><th>删除商品</th><th>立即购买</th>
	</tr>
	<c:forEach items="${cart_list }" var="cart">
	<form action="revamp" method="get">
		<tr>
			<td><input type="hidden" value="${cart.image}" name="image"/><img src="image/${cart.image }" width=100 height="100"></td>
			<td><input type="hidden" value="${cart.book_id }" name="book_id"/>${cart.book_id}</td>
			<td><input type="hidden" value="${cart.name }" name="name"/>${cart.name }</td>
			<td><input type="hidden" value="${cart.user_id }" name="user_id"/>${cart.user_id }</td>
			<td><input type="hidden" value="${cart.price }" name="price"/>${cart.price }</td>
			<td><input type="hidden" value="${cart.store }" name="store"/>${cart.store }</td>
			<td><input type="hidden" value="${cart.sellerid }" name="sellerid"/>${cart.sellerid }</td>
			<td><input type="text" value="${cart.count}" name="booknumber"/></td>
			<td><input type="submit" value="修改数量"/></td>
			<td><a  href="delete?book_id=${cart.book_id}&user_id=${cart.user_id}">删除商品</a></td>
			<td><a  href="order?image=${cart.image}&user_id=${cart.user_id}&book_id=${cart.book_id}&name=${cart.name}&price=${cart.price}&store=${cart.store}&sellerid=${cart.sellerid}&count=${cart.count}">购买</a>
		</tr>
	</form>	
	</c:forEach>
	
</table>
	
</body>
</html>