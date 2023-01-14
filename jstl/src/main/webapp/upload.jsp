<%--
  Created by IntelliJ IDEA.
  User: Mr.W
  Date: 2022/10/18
  Time: 19:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传文件</title>
</head>
<body>
    <form action="http://localhost:8080/jstl/uploadServlet" method="post" enctype="multipart/form-data">
        用户名：<input type="text" name="username" ><br>
        头像：<input type="file" name="img"> <br>
        <input type="submit" value="上传">
    </form>
</body>
</html>
