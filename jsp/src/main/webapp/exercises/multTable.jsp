<%--
  Created by IntelliJ IDEA.
  User: Mr.W
  Date: 2022/10/9
  Time: 20:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>九九乘法表</title>
</head>
<body>
  <%
      for(int i=1;i<=9;i++){
          for(int j=1;j<=i;j++){
  %>
<%--              System.out.print(j+"*"+i+"="+i*j+'\t');--%>
  <%=j + "*" + i + "=" + j * i + "&nbsp;"%>
  <%
          }
  %>
          <br />
  <%
      }
  %>
</body>
</html>
