<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>修改密码</title>
</head>
<body>
<form class="form-horizontal" role="form" action="update" method="post">
				<div class="form-group">
					 
					<label for="loginname" class="col-sm-2 control-label">
						登陆名
					</label>
					<div class="col-sm-10">
						<input type="text" placeholder="请输入登陆名" class="form-control" id="loginname" name="loginname">
					</div>
				</div>
				<div class="form-group">
					 
					<label for="password" class="col-sm-2 control-label">
					   密码
					</label>
					<div class="col-sm-10">
						<input type="text" placeholder="请输入新密码" class="form-control" id="password" name="password">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						 
						<button type="submit" class="btn btn-default" value="alter" >
							修改密码
						</button>
						
					</div>
				</div>
</form>
 <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
</body>
</html>