<%--
  Created by IntelliJ IDEA.
  User: li
  Date: 2018/11/27
  Time: 8:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>订单列表</title>

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
        <th>订单编号</th>
        <th>订单号</th>
        <th>用户id</th>
        <th>商品id</th>
        <th>订单生成日期</th>
        <th>订单状态</th>
        <th>发货</th>
        <%--1未付款；4已取消；2未发货；3完成；5退货；6退款--%>
    </tr>
    </thead>
    <tbody id="data-content">
    <c:forEach items="${ugorderslist}" var="ugorders">
        <tr>
            <td>${ugorders.oid}</td>
            <td>${ugorders.oNum}</td>
            <td>${ugorders.uid}</td>
            <td>${ugorders.gid}</td>
            <td>${ugorders.gnum}</td>
            <td>${ugorders.ocreatedate}</td>
            <td>${ugorders.condition}</td>
            <td>发货</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
