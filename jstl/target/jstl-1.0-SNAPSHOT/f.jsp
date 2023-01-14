<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Mr.W
  Date: 2022/10/11
  Time: 19:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>三元运算符和.运算</title>
</head>
<body>
    ${ 12 != 12 ? "wztcode" : "wzt"} <br />
    <hr>
    <%
        HashMap<String, Object> map = new HashMap<>();
        map.put("a*a*a", "aaaValue");
        map.put("b-b-b", "bbbValue");
        map.put("c/c/c", "cccValue");
        request.setAttribute("map", map);
    %>
${map}<br>
${map['a*a*a']}<br>
${map['b-b-b']}<br>
${map['c/c/c']}
</body>
</html>
