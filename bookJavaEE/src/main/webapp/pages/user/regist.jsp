<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>尚硅谷会员注册页面</title>
    <%-- 静态引入头部的css jQuery base 标签 信息--%>
    <%@include file="/pages/common/head.jsp"%>
    <style type="text/css">
        .login_form {
            height: 420px;
            margin-top: 25px;
        }
    </style>
    <script type="text/javascript">

        // 页面加载完成之后
        $(function () {
            // 給注册绑定单击事件
            $("#sub_btn").click(function () {
                // 验证用户名：必须由字母，数字下划线组成，并且长度为 5 到 12 位
                var username = $("#username").val();
                var usernamePattern = /^\w{5,12}$/;

                if (!usernamePattern.test(username)) {
                    $(".errorMsg").jsp("用户名不合法！");

                    return false;
                }

                // 验证密码：必须由字母，数字下划线组成，并且长度为 5到 12 位

                var password = $("#password").val();
                var passwordPattern = /^\w{5,12}$/;

                if (!passwordPattern.test(password)) {
                    $(".errorMsg").jsp("密码不合法！");

                    return false;
                }
                // 验证确认密码：和密码相同

                var repeatPassword = $("#repwd").val();
                if (repeatPassword != password) {
                    $(".errorMsg").jsp("重复密码与密码不一致！");

                    return false;
                }

                // 邮箱验证：xxxxx@xxx.com
                var email = $("#email").val();
                var reg = /^[0-9a-zA-Z_.-]+[@][0-9a-zA-Z_.-]+([.][a-zA-Z]+){1,2}$/;

                if (!reg.test(email)) {
                    $(".errorMsg").jsp("邮箱不合法！");

                    return false;
                }

                // 验证码：现在只需要验证用户已输入。（没有服务器，验证码生成）

                var code = $("#code").val();
                code = $.trim(code);
                if (code == null || code == '') {
                    $(".errorMsg").jsp("验证码不匹配！");

                    return false;
                }

                $(".errorMsg").jsp("");
            })
        })

    </script>
</head>
<body>
<div id="login_header">
    <img class="logo_img" alt="" src="static/img/logo.gif">
</div>

<div class="login_banner">

    <div id="l_content">
        <span class="login_word">欢迎注册</span>
    </div>

    <div id="content">
        <div class="login_form">
            <div class="login_box">
                <div class="tit">
                    <h1>注册尚硅谷会员</h1>
                    <span class="errorMsg">
<%--                        <%=request.getAttribute("msg")==null?"":request.getAttribute("msg")%>--%>
                        ${requestScope.msg}
                    </span>
                </div>
                <div class="form">
                    <form action="http://localhost:8080/bookJavaEE/userServlet" method="post">
                        <input type="hidden" name="action" value="register">
                        <label>用户名称：</label>
                        <input class="itxt" type="text" placeholder="请输入用户名" autocomplete="off" tabindex="1"
                               name="username" id="username"
                        value="${requestScope.username}"/>
                        <br/>
                        <br/>
                        <label>用户密码：</label>
                        <input class="itxt" type="password" placeholder="请输入密码" autocomplete="off" tabindex="1"
                               name="password" id="password"/>
                        <br/>
                        <br/>
                        <label>确认密码：</label>
                        <input class="itxt" type="password" placeholder="确认密码" autocomplete="off" tabindex="1"
                               name="repwd" id="repwd"/>
                        <br/>
                        <br/>
                        <label>电子邮件：</label>
                        <input class="itxt" type="text" placeholder="请输入邮箱地址" autocomplete="off" tabindex="1"
                               name="email" id="email"
                        value="${requestScope.email}"/>
                        <br/>
                        <br/>
                        <label>验证码：</label>
                        <input class="itxt" type="text" style="width: 150px;" name="code" id="code"/>
                        <img alt="" src="static/img/code.bmp" style="float: right; margin-right: 40px">
                        <br/>
                        <br/>
                        <input type="submit" value="注册" id="sub_btn"/>
                    </form>
                </div>

            </div>
        </div>
    </div>
</div>
<%-- 静态引入页脚信息 --%>
<%@include file="/pages/common/footer.jsp"%>
</body>
</html>