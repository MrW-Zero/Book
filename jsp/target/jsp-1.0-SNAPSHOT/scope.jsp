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
    <title>scope.jsp 页面</title>
</head>
<body>
    <%
        pageContext.setAttribute("key", "pageContext");
        request.setAttribute("key", "request");
        session.setAttribute("key", "session");
        application.setAttribute("key", "application");
    %>
    pageContext的域是否有值：<%=pageContext.getAttribute("key")%><br />
    request的域是否有值：<%=request.getAttribute("key")%><br />
    session的域是否有值：<%=session.getAttribute("key")%><br />
    application的域是否有值：<%=application.getAttribute("key")%>
<%
//    request.getRequestDispatcher("/scope2.jsp").forward(request, response);
%>

<%--
    <jsp:forward page=""></jsp:forward> 是请求转发标签, 它的功能就是请求转发
    page 属性设置请求转发的路径
--%>
<jsp:forward page="/scope2.jsp"></jsp:forward>
</body>
</html>
