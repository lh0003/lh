<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
   <head>
      <title>欢迎来到糖果屋</title>
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <!-- 引入 Bootstrap -->
      <link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
 
      <!-- HTML5 Shim 和 Respond.js 用于让 IE8 支持 HTML5元素和媒体查询 -->
      <!-- 注意： 如果通过 file://  引入 Respond.js 文件，则该文件无法起效果 -->
      <!--[if lt IE 9]>
         <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
         <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
      <![endif]-->
   </head>
   <body>
      <div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<nav class="navbar navbar-default" role="navigation">
				<div class="navbar-header">
					 <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button> <a class="navbar-brand" href="#">欢迎来到糖果屋![${sessionScope.user.username }]</a>
				</div>
				
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active">
							 <a href="main.jsp">首页</a>
						</li>
						<li class="dropdown">
							 <a href="#" class="dropdown-toggle" data-toggle="dropdown">分类<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
								<li>
									 <a href="snacksForm">休闲零食</a>
								</li>
								<li>
									 <a href="instantForm">粮油速食</a>
								</li>
								<li>
									 <a href="milkForm">酒水乳饮</a>
								</li>
								
							</ul>
						</li>
					</ul>
					<form class="navbar-form navbar-left" role="search">
						<div class="form-group">
							<input type="text" class="form-control" />
						</div> <button type="submit" class="btn btn-default">搜索</button>
					</form>
					<ul class="nav navbar-nav navbar-right">
						<li>
							 <a href="loginForm">登录/注册</a>
						</li>
						<li class="dropdown">
							 <a href="#" class="dropdown-toggle" data-toggle="dropdown">我的<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
								<li>
									 <a href="cart">购物车</a>
								</li>
								<li>
									 <a href="order">我的订单</a>
								</li>
							</ul>
						</li>
					</ul>
				</div>
		<div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<div class="carousel slide" id="carousel-598623">
				<ol class="carousel-indicators">
					<li class="active" data-slide-to="0" data-target="#carousel-598623">
					</li>
					<li data-slide-to="1" data-target="#carousel-598623">
					</li>
					<li data-slide-to="2" data-target="#carousel-598623">
					</li>
				</ol>
				<div class="carousel-inner">
					<div class="item active">
						<img alt="Carousel Bootstrap First" src="image/4.jpg" />
						<div class="carousel-caption">
							<h4>
								欢迎来到糖果屋！
							</h4>
							<p>
								总有一款零食适合你。
							</p>
						</div>
					</div>
					<div class="item">
						<img alt="Carousel Bootstrap Second" src="image/5.jpg" />
						<div class="carousel-caption">
							<h4>
								糖果屋——
							</h4>
							<p>
								专属于您的吃货大本营
							</p>
						</div>
					</div>
					<div class="item">
						<img alt="Carousel Bootstrap Third" src="image/6.jpg" />
						<div class="carousel-caption">
							<h4>
								好吃到尖叫
							</h4>
							<p>
								糖 糖 糖 糖果屋~
							</p>
						</div>
					</div>
				</div> <a class="left carousel-control" href="#carousel-598623" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a> <a class="right carousel-control" href="#carousel-598623" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
			</div>
		</div>
	</div>
</div>				
			</nav>
			<div class="row">
				<div class="col-md-4">
					<div class="thumbnail">
						<img alt="300x200" src="image/1.jpg" />
						<div class="caption">
							<h3>
								休闲零食
							</h3>
							<p>
								只要你想，这里应有尽有
							</p>
							<p>
								 <a class="btn btn-primary" href="snacksForm">更多</a> 
							</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="thumbnail">
						<img alt="300x200" src="image/2.jpg" />
						<div class="caption">
							<h3>
								粮油速食
							</h3>
							<p>
								方便！美味，让你停不下来
							<p>
								 <a class="btn btn-primary" href="instantForm">更多</a> 
							</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="thumbnail">
						<img alt="300x200" src="image/3.jpg" />
						<div class="caption">
							<h3>
								酒水乳饮
							</h3>
							<p>
							营养生活每e天
							</p>
							<p>
								 <a class="btn btn-primary" href="milkForm">更多</a> 
							</p>
						</div>
					</div>
				</div>
			</div>
	</div>
		</div>
	</div>
      <!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
      <script src="https://code.jquery.com/jquery.js"></script>
      <!-- 包括所有已编译的插件 -->
      <script src="js/bootstrap.min.js"></script>
   </body>
</html>