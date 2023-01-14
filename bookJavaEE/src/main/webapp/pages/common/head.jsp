<%--
  Created by IntelliJ IDEA.
  User: Mr.W
  Date: 2022/10/23
  Time: 21:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme()
            + "://"
            + request.getServerName()
            + ":"
            + request.getServerPort()
            + request.getContextPath()
            + "/";
%>
<%--<%=basePath%>--%>
<%--动态的获取请求的URL地址--%>
<base href="<%=basePath%>"/>
<link type="text/css" rel="stylesheet" href="static/css/style.css" >
