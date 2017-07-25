<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>登录界面</title>

    <meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
   <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    
	<script src="js/jquery.cookie.js" type="text/javascript"></script>
	
  </head>
  <body>
    <div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<form class="form-horizontal" role="form" action="login" method="post">
				<div class="form-group">
					 
					<label for="loginname" class="col-sm-2 control-label">
						用户名
					</label>
					<div class="col-sm-10">
						<input type="text" placeholder="请输入用户名" class="form-control" id="loginname" name="loginname">
					</div>
				
				 
					<label for="password" class="col-sm-2 control-label">
						密码
					</label>
					<div class="col-sm-10">
						<input type="text" placeholder="请输入密码" class="form-control" id="password" name="password">
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
					<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<div class="checkbox">
							 
							<label>
								<input type="checkbox" id="checkbox"/> 记住我
							</label>
						</div>
					</div>
				</div>
						 
						<button type="submit" class="btn btn-default" value="login" onclick="Save()">
							登录
						</button>
						<button type="submit" class="btn btn-default">
							<a href="saveForm">没有账号？注册</a>
						</button>
						<button type="submit" class="btn btn-default">
							<a href="amendForm">修改密码</a>
						</button>
						<button type="submit" class="btn btn-default">
							<a href="forgetPassword">忘记密码？找回密码</a>
						</button>
					</div>
				</div>
			</form>
		</div>
	</div>
</div>



    
  </body>
</html>