<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Mr.W
  Date: 2022/9/27
  Time: 20:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--练习：--%>
<%--1. 输出整型--%>
<%=12%><br/>
<%--2. 输出浮点型--%>
<%=12.2%><br/>
<%--&lt;%&ndash;3. 输出字符串&ndash;%&gt;--%>
<%--<%="我是最帅的"%><br/>--%>
<%--&lt;%&ndash;4. 输出对象&ndash;%&gt;--%>
<%--<%=new HashMap<String, Object>()%><br/>--%>
<%--<%=request.getParameter("username")%><br/>--%>


<%--1. 代码脚本 —— if 语句--%>
<%
    int i = 12;
    if (i == 12) {
        System.out.println("我是最帅的");
    } else {
        System.out.println("帅");
    }
%>
<br/>
<%--2. 代码脚本 —— for 循环语句--%>
<table border="1px" cellspacing="0">
    <%
        for (int j = 0; j < 10; j++) {
    %>
    <tr>
        <td>第<%=j + 1%>行</td>
    </tr>
    <%
        }
    %>
</table>
<%--这是 html 注释--%>
<br/>
<%--3. 翻译后 java 文件中 _jspService() 方法内的代码都可以写--%>
<%--<%--%>
<%--    //    这是 java 单行煮熟--%>
<%--    /*--%>
<%--    这是java多行注释--%>
<%--     */--%>
<%--    String username = request.getParameter("username");--%>
<%--    System.out.println("用户名：" + username);--%>
<%--%>--%>

<%--1. 代码脚本翻译之后都在 _jspService() 方法中--%>
<%--2. 代码脚本由于翻译到 _jspService() 方法中，所以在 _jspService() 方法中的现有对象都可以直接使用--%>
<%--3. 还可以由多个代码脚本块组合完成一个完整的 java 语句--%>
<%--4. 代码脚本还可以和表达式脚本一起组合使用。在 jsp 页面输出数据--%>
</body>
</html>
