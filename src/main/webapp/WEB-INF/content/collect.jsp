<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>我的收藏</title>
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
 <link href="css/style.css" rel="stylesheet"> 
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    
</head>
<body>
 <div style="width:60%;margin:auto auto;">
         <h1>我的收藏夹：</h1><a class="btn btn-primary" href="main" role="button">继续购物</a>
         <br>
         <table >  
                <tr>
                <th class="thtd">图片</th>
                <th class="thtd">商品编号</th>
                <th class="thtd">商品名</th>
                <th class="thtd">价格</th>
                <th class="thtd">库存</th>
     			<th class="thtd">店铺id</th>
                <th class="thtd">加入购物车</th>
                <th class="thtd">取消收藏</th>
		    </tr>
		    
           <c:forEach items="${collect_list }" var="collect">
			<tr>
				<td><input type="hidden" name="image" value="${collect.image}" /><img src="image/${collect.image }" width=100 height="100"></td>
	        <td>
	        	<input type="hidden" name="book_id" value="${collect.book_id}" />
	        	<input type="hidden" name="name" value="${collect.name}" />
	        	${collect.book_id}
	        </td>
			<td>${collect.name }</td>
			<td><input type="hidden" name="price" value="${collect.price}" />${collect.price}</td>
			<td>${collect.store }</td>
			<td><input type="hidden" name="sellerid" value="${collect.sellerid}" />${collect.sellerid}</td> 
			<td><a  href="addcart?image=${collect.image}&user_id=${collect.user_id}&book_id=${collect.book_id}&name=${collect.name}&price=${collect.price}&sellerid=${collect.sellerid}">加入购物车</a>
		    <td><a  href="removecollect?book_id=${collect.book_id}&user_id=${collect.user_id}">取消收藏</a></td>
		  </tr>
		</c:forEach>		
        </table>

 </div>
</body>
</html>