<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>酒水乳饮</title>
 <link href="css/bootstrap.min.css" rel="stylesheet">
 <link href="css/style.css" rel="stylesheet">


<link href="css/css.css" type="text/css" rel="stylesheet">

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
<SCRIPT src="js/lib.js" type=text/javascript></SCRIPT>
<SCRIPT src="js/163css.js" type=text/javascript></SCRIPT>

</head>
<body style="text-align:center;">
<br>
<a href="main.jap">返回主页</a>

当前在线人数为：${applicationScope.count}人

<table border="1">
	<tr>
		<th>图片</th><th>商品编号</th><th>商品名</th><th>库存量</th><th>生产厂家</th><th>价格</th><th>生产日期</th><th>店铺id</th><th>加入购物车</th><th>收藏</th><th>评价</th>
	</tr>
	<c:forEach items="${requestScope.book_list }" var="book">
	<form action="addcart" method="get">
				<input type="hidden" name="image" value="${book.image}" />
	        	<input type="hidden" name="book_id" value="${book.book_id}" />
	        	<input type="hidden" name="name" value="${book.name}" />
	        	<input type="hidden" name="store" value="${book.store}" />
	        	<input type="hidden" name="price" value="${book.price}" />
	        	<input type="hidden" name="sellerid" value="${book.sellerid}" />
		<tr>
			</div> 
			<td><img src="image/${book.image }" width=100 height="100"></td>
	        <td>${book.book_id }</td>
			<td>${book.name }</td>
			<td>${book.store }</td>
			<td>${book.production}</td>
			<td>${book.price}</td>
			<td>${book.productiondate}</td>
			<td>${book.sellerid}</td> 
			<td>
			<input type="submit" value="加入购物车">
			</td>
			<td>
			<a href="collect?image=${book.image}&book_id=${book.book_id}&name=${book.name}&store=${book.store}&price=${book.price}&sellerid=${book.sellerid}">收藏</a></td>
		</tr>
	</form>	
	</c:forEach>
</table>

</body>
</html>