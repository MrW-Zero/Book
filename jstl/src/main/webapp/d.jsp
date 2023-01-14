<%--
  Created by IntelliJ IDEA.
  User: Mr.W
  Date: 2022/10/10
  Time: 21:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>关系运算符</title>
</head>
<body>
  ${5 == 5} 或 ${5 eq 5} <br />
  ${5 != 5} 或 ${5 ne 5} <br />
  ${5 < 5} 或 ${5 lt 5} <br />
  ${5 > 5} 或 ${5 gt 5} <br />
  ${5 <= 5} 或 ${5 le 5} <br />
  ${5 >= 5} 或 ${5 ge 5} <br />
  <hr>
  ${5 == 5 && 6 == 6} 或 ${5 == 5 and 6 == 6}<br />
  ${5 == 5 || 6 == 6} 或 ${5 == 5 or 6 == 6}<br>
  ${!true} 或 ${not true}
</body>
</html>
