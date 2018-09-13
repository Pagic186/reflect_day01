<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户注册</title>
</head>
<body>
	<form action="registerServlet" method="post">
		用户名：<input name="username" /><br/>
		密码：<input type="password" name="password" /><br/><br/><br/>
		爱好：<input type="checkbox" name="hobby" value="爱边城" />爱边城
			<input type="checkbox" name="hobby" value="爱睡觉" />爱睡觉
			<input type="checkbox" name="hobby" value="爱奇艺" />爱奇艺<br/>
			<input type="submit" value="注册" />
	</form>
	<!-- 带文件上传的表单 -->
	<form action="registerServlet" method="post" enctype="multipart/form-data">
		用户名：<input name="username" /><br/>
		密码：<input type="password" name="password" /><br/><br/><br/>
		爱好：<input type="checkbox" name="hobby" value="爱边城" />爱边城
			<input type="checkbox" name="hobby" value="爱睡觉" />爱睡觉
			<input type="checkbox" name="hobby" value="爱奇艺" />爱奇艺<br/>
			<input type="submit" value="注册" />
	</form>
</body>
</html>