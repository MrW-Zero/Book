<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>尚硅谷会员注册页面</title>
    <%-- 静态引入头部的css jQuery base 标签 信息--%>
    <%@include file="/pages/common/head.jsp"%>
    <style type="text/css">
        h1 {
            text-align: center;
            margin-top: 200px;
        }

        h1 a {
            color: red;
        }
    </style>
</head>
<body>
<div id="header">
    <img class="logo_img" alt="" src="pages/static/img/logo.gif">
    <%-- 静态引入登录成功进入欢迎页面的信息--%>
    <%@include file="/pages/common/login_success_menu.jsp"%>
</div>

<div id="main">

    <h1>欢迎回来 <a href="index.jsp">转到主页</a></h1>

</div>
<%-- 静态引入页脚信息 --%>
<%@include file="/pages/common/footer.jsp"%>
</body>
</html>