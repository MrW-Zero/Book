<%--
  Created by IntelliJ IDEA.
  User: Mr.W
  Date: 2022/10/9
  Time: 17:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页面</title>
</head>
<body>
    头部信息<br />
    主体信息<br />
<%--    <%@include file="/include/footer.jsp"%>--%>
    <jsp:include page="/include/footer.jsp">
        <jsp:param name="username" value="wztcode"/>
        <jsp:param name="password" value="123456"/>
    </jsp:include>
</body>
</html>
