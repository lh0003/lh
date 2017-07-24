<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>注册界面</title>

    <meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">

  </head>
  <body>
    <div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<form class="form-horizontal" role="form" action="save" method="post">
				<div class="form-group">
					 
					<label for="loginname" class="col-sm-2 control-label">
						登陆名
					</label>
					<div class="col-sm-10">
						<input type="text" placeholder="请输入登陆名" class="form-control" id="loginname" name="loginname">
					</div>
				</div>
				<div class="form-group">
					 
					<label for="username" class="col-sm-2 control-label">
						用户名
					</label>
					<div class="col-sm-10">
						<input type="text" placeholder="请输入用户名" class="form-control" id="username" name="username">
					</div>
				</div>
				<div class="form-group">
					 
					<label for="password" class="col-sm-2 control-label">
						密码
					</label>
					<div class="col-sm-10">
						<input type="text" placeholder="请输入密码" class="form-control" id="password" name="password">
					</div>
				</div>
				<div class="form-group">
					 
					<label for="phone" class="col-sm-2 control-label">
						电话号码
					</label>
					<div class="col-sm-10">
						<input type="text" placeholder="请输入电话号码" class="form-control" id="phone" name="phone">
					</div>
				</div>
					</div>
				</div>
				<div class="form-group">
					 
					<label for="address" class="col-sm-2 control-label">
						地址
					</label>
					<div class="col-sm-10">
						<input type="text" placeholder="请输入地址" class="form-control" id="address" name="address">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						 
						<button type="submit" class="btn btn-default" value="save" >
							注册
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