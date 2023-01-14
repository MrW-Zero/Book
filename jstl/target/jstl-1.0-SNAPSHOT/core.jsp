<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Mr.W
  Date: 2022/10/12
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSTL标签库</title>
</head>
<body>
    <c:set scope="request" var="abc" value="value"/>
    ${requestScope.abc} <br>
    <hr>
    <c:if test="${12 == 12}">
        <h1>12 等于 12</h1>
    </c:if>
    <c:if test="${12 != 12}">
        <h1>12 不等于 12</h1>
    </c:if>
</body>
</html>
