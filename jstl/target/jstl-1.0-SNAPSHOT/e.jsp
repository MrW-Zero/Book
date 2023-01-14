<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Mr.W
  Date: 2022/10/11
  Time: 18:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>empty 方法</title>
</head>
<body>
<%
  // 1. 值为 null 值的时候，为空
  request.setAttribute("nullEmpty", null);
  // 2. 值为空串的时候，为空
  request.setAttribute("nullStr", "");
  // 3. 值是 Object 类型数组，长度为零的时候
  request.setAttribute("nullArr", new Object[]{});
  // 4. list 集合，元素个数为零
  request.setAttribute("nullList", new ArrayList());
  // 5. map 集合，元素个数为零
  request.setAttribute("nullMap", new HashMap<>());
%>
${empty nullEmpty}<br>
${empty nullStr}<br>
${empty nullArr}<br>
${empty nullList}<br>
${empty nullMap}<br>
</body>
</html>
