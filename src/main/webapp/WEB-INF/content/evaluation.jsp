<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>评论页面</title>
 <meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">

    <link href="http://www.jq22.com/jquery/bootstrap-3.3.4.css" rel="stylesheet">

    <script src="http://www.jq22.com/jquery/1.11.1/jquery.min.js"></script>

    <link href="css/star-rating.css" media="all" rel="stylesheet" type="text/css"/>

    <script src="js/star-rating.js" type="text/javascript"></script>

</head>
<body>
<div class="container-fluid">
	<div class="row">
		<div class="col-md-6">
			<h3>
				${sessionScope.user.username }
			</h3><img alt="Bootstrap Image Preview" src="image/ev.gif">
		</div>
		<div class="col-md-6">
			 <span class="label label-default">您对商品的评价是：</span><br/><br><br>
物流服务打分：<input id="input-21a" value="0" type="number" class="rating" min=0 max=5 step=0.5 data-size="xl" >
	<br>
卖家服务打分：<input id="input-21a" value="0" type="number" class="rating" min=0 max=5 step=0.5 data-size="xl" >
	<br>
商品质量打分：<input id="input-21a" value="0" type="number" class="rating" min=0 max=5 step=0.5 data-size="xl" >
	<br>			
<form action="evaluation" method="get">
<input type="text" name="remarks" id="remarks" maxlength="100" style=" width:350px; height:80px"/>
<input type=file name="image" id="image" onchange="javascript:setImagePreview();"> 
<p><div id="localImag"><img id="preview" width=-1 height=-1 style="diplay:none" /></div></p>
<p><div id="localImag"><img id="preview" width=-1 height=-1 style="diplay:none" /></div></p>
<input type="hidden" value="${goods.getId() }" id="goodsid" name="goodsid "/>
<input type="hidden" value="${sessionScope.user.id }" id="userid" name="userid"/>
<button>提交评价</button>
</form>
		</div>
	</div>
	
</div>

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
 
</body>
</html>