<%--
  Created by IntelliJ IDEA.
  User: Mr.W
  Date: 2022/10/10
  Time: 9:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setAttribute("key", "值");
%>
jsp 表达式脚本在页面输出：<%=request.getAttribute("key1")%><br />
EL 表达式脚本在页面输出：${key1}
</body>
</html>
