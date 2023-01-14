<%--
  Created by IntelliJ IDEA.
  User: Mr.W
  Date: 2022/9/29
  Time: 22:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>scope2.jsp 页面</title>
</head>
<body>
    pageContext的域是否有值：<%=pageContext.getAttribute("key")%><br />
    request的域是否有值：<%=request.getAttribute("key")%><br />
    session的域是否有值：<%=session.getAttribute("key")%><br />
    application的域是否有值：<%=application.getAttribute("key")%>
</body>
</html>
