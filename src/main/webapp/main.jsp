<%--
  Created by IntelliJ IDEA.
  User: destroyer
  Date: 2019/3/30
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>系统主页</title>
</head>
<body>
当前用户：${USER_SESSION.username}
<a href="/logout">退出</a>
</body>
</html>
