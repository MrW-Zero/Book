<%--
  Created by IntelliJ IDEA.
  User: Mr.W
  Date: 2022/10/11
  Time: 21:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
    request.getScheme() 获取协议
    request.getServerName() 获取服务器 ip
    request.getServerPort() 获取服务器端口
    request.getContextPath() 获取工程路径
    request.getMethod() 获取请求方法 (GET/POST)
    request.getRemoteHost() 获取客户端 ip 地址
    session.getId() 获取会话的 ip 编号
--%>
<%=session.getId()%>
<%
    pageContext.setAttribute("req", request);
%>
<br/>
<%=pageContext%>
1. 协议：${req.scheme} <br/>
2. 服务器 ip: ${req.serverName}<br/>
3. 服务器端口: ${pageContext.request.serverPort}<br/>
4. 获取工程路径: ${pageContext.request.contextPath}<br/>
5. 获取请求方法: ${pageContext.request.method}<br/>
6. 获取客户端 ip 地址: ${pageContext.request.remoteHost}<br/>
7. 获取会话的 id 编号: ${pageContext.session.id}<br/>
<hr>
<%--param--%>
<%--paramValues--%>
获取请求的参数：${param}<br>
获取请求参数 username 的值：${param.username} <br>
获取请求参数 password 的值：${param.password} <br>
获取多个请求参数：${paramValues} <br>
获取多个请求参数中 hobby 的值：${paramValues.hobby[0]} <br>
获取多个请求参数中 hobby 的值：${paramValues.hobby[1]} <br>
获取多个请求参数中 hobby 的值：${paramValues.hobby[2]} <br>
<hr>
<%--header --%>
<%--headerValues--%>
获取 header 的信息：${header}<br>
获取 header 中的 [User-Agent] 的值：${header['User-Agent']}<br>
获取 header 中的 [Connection] 的值：${header.Connection}<br>
<hr>
<%--cookie--%>
获取 cookie 的名称：${cookie.JSESSIONID.name}<br>
获取 cookie 的值：${cookie.JSESSIONID.value}<br>
<hr>
<%--initParam--%>
${initParam} <br>
获取 initParam 的 username 值：${initParam.username}<br>
获取 initParam 的 url 值：${initParam.url} <br>
</body>
</html>
