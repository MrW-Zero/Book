<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="com.wztcode.pojo.Student" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Mr.W
  Date: 2022/10/15
  Time: 7:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>forEach</title>
</head>
<body>
    输出 1 - 10
    <c:forEach begin="1" end="10" var="i">
        ${i}
    </c:forEach>

    <br>
    <%
        request.setAttribute("arr", new String[]{"110", "120", "119"});
    %>

    <c:forEach items="${requestScope.arr}" var="item">
        ${item}
    </c:forEach>

    <hr>
<%--    遍历 List 集合 --- list 中存放 Person 类，有属性：编号，用户名，密码，年龄，电话信息--%>
    <%
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            students.add(new Student(i + 1, "username" + i, "password" + i, 18 + i, "phone" + i));
        }
    %>
</body>
</html>
