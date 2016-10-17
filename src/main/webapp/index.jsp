<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %>
<html>
<body>
<h2>Hello World!</h2>
<form action="${pageContext.request.contextPath}/user" method="post">
    用户名:<input type="text" name="userName"><br/>
    密码:<input type="password" name="userPassword"></br>
    <button type="submit">提交</button>
</form>
</body>
</html>
