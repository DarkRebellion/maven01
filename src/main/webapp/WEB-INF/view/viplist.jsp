<%--
  Created by IntelliJ IDEA.
  User: li
  Date: 2018/11/20
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>vip信息</title>
    <link rel="stylesheet" type="text/css" href="/css/font-awesome.css">
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="/css/style.css">

    <script type="text/javascript" language="JavaScript" src="/js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="/js/popper.min.js"></script>
    <script type="text/javascript" src="/js/bootstrap.js"></script>

</head>
<body>
<table class="table table-condensed">
    <c:forEach items="${viplist}" var="vip">
        <tr>
            <td>${vip.unum}</td>
            <td>${vip.uname}</td>
            <td>${vip.upwd}</td>
            <td>
                <div class="dropdown">
                    <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
                        <i class="fa fa-cogs"></i>
                    </button>
                    <div class="dropdown-menu">
                        <a class="dropdown-item" href="delete/${vip.unum}/d">冻结</a>
                        <a class="dropdown-item" href="find/${vip.unum}/d">修改</a>
                    </div>
                </div>
            </td>
        </tr>

    </c:forEach>
</table>
<a class="dropdown-item" href="add">添加</a>
</body>
</html>
