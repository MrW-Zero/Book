<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Mr.W
  Date: 2022/9/27
  Time: 20:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试</title>
</head>
<body>
<%!
    private String name = "wzt";
    private int age = 20;
    private static Map<String, String> map;
%>
<%--2. 声明 static 静态代码块--%>
<%!
    static {
        map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
    }
%>
<%--3. 声明类方法--%>
<%!
    public int test() {
        return 123;
    }
%>
<%--4. 声明内部类--%>
<%!
    public class A {

    }
%>
</body>
</html>
