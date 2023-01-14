<%@ page import="java.util.ArrayList" %>
<%@ page import="com.wztcode.pojo.Student" %><%--
  Created by IntelliJ IDEA.
  User: Mr.W
  Date: 2022/10/9
  Time: 20:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生信息表</title>
</head>
<style type="text/css">
    table {
        border: 1px solid blue;
        border-collapse: collapse;
    }
    th, td {
        border: 1px solid blue;
    }
</style>
<body>
<%
    ArrayList<Student> students = (ArrayList<Student>) request.getAttribute("stuList");
%>

<table>
    <tr>
        <th>学号</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>电话</th>
    </tr>
    <%
        for (Student student : students) {
    %>
    <tr>
        <td><%=student.getId()%>
        </td>
        <td><%=student.getName()%>
        </td>
        <td><%=student.getAge()%>
        </td>
        <td><%=student.getPhone()%>
        </td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
