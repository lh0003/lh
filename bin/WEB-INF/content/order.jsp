<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<!-- 引入 Bootstrap -->
      <link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
 
      <!-- HTML5 Shim 和 Respond.js 用于让 IE8 支持 HTML5元素和媒体查询 -->
      <!-- 注意： 如果通过 file://  引入 Respond.js 文件，则该文件无法起效果 -->
      <!--[if lt IE 9]>
         <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
         <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
      <![endif]-->
	<meta charset="utf-8">	
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>我的订单</title>

    <meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
    
</head>
<body>
<a href="main">返回主页</a>
<div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
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
		</div>
	</div>
</div>

</body>
</html>