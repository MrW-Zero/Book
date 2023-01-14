<%@ page import="com.wztcode.pojo.Person" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Mr.W
  Date: 2022/10/10
  Time: 19:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Person person = new Person();
    person.setName("张三");
    person.setPhones(new String[]{"15231038719", "15324363362", "13730023716"});
    List<String> cites = new ArrayList<>();
    cites.add("河北");
    cites.add("北京");
    cites.add("成都");
    cites.add("天津");
    person.setCities(cites);
    HashMap<String, Object> map = new HashMap<>();
    map.put("key1", "value1");
    map.put("key2", "value2");
    map.put("key3", "value3");
    map.put("key4", "value4");
    person.setMap(map);

    pageContext.setAttribute("person", person);
%>

输出 Person: ${person} <br/>
输出 Person 的 name 属性值：${person.name}<br />
输出 Person 的 phones 属性：${person.phones}<br />
输出 Person 的 phones 属性的第一个值：${person.phones[0]}<br />
输出 Person 的 cities 集合中的元素值：${person.cities}<br />
输出 Person 的 cities list 集合中的第一个元素值：${person.cities[0]}<br />
输出 Person 的 Map 集合：${person.map}<br />
输出 Person 的 Map 集合中某个 key 对应的值：${person.map.key1}<br />
输出 Person 的 age 属性：${person.age}<br />
</body>
</html>
