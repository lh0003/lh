<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>商家登录界面</title>

    <meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">

  </head>
  <body>
    <div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<form class="form-horizontal" role="form" action="sellerlogin" method="post">
				<div class="form-group">
					 
					<label for="sellerloginname" class="col-sm-2 control-label">
						商家登录名
					</label>
					<div class="col-sm-10">
						<input type="text" placeholder="请输入商家登录名" class="form-control" id="sellerloginname" name="sellerloginname">
					</div>
				</div>
				 
					<label for="sellerpassword" class="col-sm-2 control-label">
						密码
					</label>
					<div class="col-sm-10">
						<input type="text" placeholder="请输入密码" class="form-control" id="sellerpassword" name="sellerpassword">
					</div>
				</div>
				
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<div class="checkbox">
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						 
						<button type="submit" class="btn btn-default" value="sellerlogin" >
							登录
						</button>
						<button type="submit" class="btn btn-default">
							<a href="sellersaveForm">没有账号？注册</a>
						</button>
						<button type="submit" class="btn btn-default">
							<a href="selleramendForm">修改密码</a>
						</button>
					</div>
				</div>
			</form>
		</div>
	</div>
</div>

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
  </body>
</html>