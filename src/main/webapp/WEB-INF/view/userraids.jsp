<%--
  Created by IntelliJ IDEA.
  User: li
  Date: 2018/11/29
  Time: 13:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>权限表</title>

    <link rel="stylesheet" type="text/css" href="/css/font-awesome.css">
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="/css/style.css">

    <script type="text/javascript" language="JavaScript" src="/js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="/js/popper.min.js"></script>
    <script type="text/javascript" src="/js/bootstrap.js"></script>
</head>
<body>
<table class="table table-condensed">
<thead>
<tr>
    <th>用户编号</th>
    <th>用户姓名</th>
    <th>用户权限</th>
    <th>权限操作</th>
</tr>
</thead>
<tbody id="data-content">
<c:forEach items="${userlist}" var="user">
    <%--<div  href="findraids/${user.unum}/d">--%>
    <tr>
        <th>${user.unum}</th>
        <th>${user.uname}</th>
        <th>${user.uauthority}</th>
        <th><a class="dropdown-item" href="findraids/${user.unum}/d">修改</a></th>
    </tr>
</c:forEach>
</tbody>
</table>


</body>
</html>
