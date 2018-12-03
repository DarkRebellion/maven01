<%--
  Created by IntelliJ IDEA.
  User: li
  Date: 2018/11/2
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>商品列表</title>

    <link rel="stylesheet" type="text/css" href="/css/font-awesome.css">
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="/css/style.css">

    <script type="text/javascript" language="JavaScript" src="/js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="/js/popper.min.js"></script>
    <script type="text/javascript" src="/js/bootstrap.js"></script>
</head>
<body>
<%--<table class="table table-condensed">
    <thead>
    <tr>
        <th>商品名</th>
        <th>商品价格</th>
        <th>库存</th>
        <th>销售量</th>
        <th>规格</th>
        <th>图片</th>
        <th>分类</th>
    </tr>
    </thead>
    <tbody id="data-content">
        <c:forEach items="${goodslist}" var="goods">
    <tr>
        <td>${goods.gname}</td>
        <td>${goods.gprice}</td>
        <td>${goods.grepertory}</td>
        <td>${goods.gsalesvolume}</td>
        <td>${goods.gremarks}</td>
        <td>图片</td>
        <th><img src='upload/"${goods.gphotopath}"' width='20px' height='20px'></th>
        <th><img src='upload/${goods.gphotopath}' width='20px' height='20px'></th>
        <td>${goods.tname}</td>
    </tr>
        </c:forEach>

        D:\maven01\target\maven01\upload\
    </tbody>
</table>--%>
<div style="flex-flow: row ;display:flex;flex-wrap: wrap">
<c:forEach items="${goodslist}" var="goods">
    <div style='display:flex; height: 300px;margin:10px 10px 10px 10px;width: 200px ;flex-flow: column;background-image:url("upload/${goods.gphotopath}") ;
            background-repeat:no-repeat; background-size: cover ;-moz-background-size:cover;'>
        <div style='flex:1;width: 200px ; '></div>
        <div style="background-color:rgba(181,248,255,0.6);align-self: flex-end;width:100%;height: 50px; ">${goods.gname}</div>
    </div>
</c:forEach>
</div>
<div class="btn btn-default"><a href="add">添加</a></div>
</body>
</html>
<%--<script>
    $(function () {
        $.ajax({
            url:"list.goods",
            dataType:"json",
            success:function (re) {
                // console.log(re);
                var  str="";
                $(re).each(function () {
                    // console.log(this.tname);
                    str+=" <tr>\n" +
                        "        <th>"+this.gname+"</th>\n" +
                        "        <th>"+this.gprice+"</th>\n" +
                        "        <th>"+this.grepertory+"</th>\n" +
                        "        <th>"+this.gsalasvolume+"</th>\n" +
                        "        <th>"+this.gremarks+"</th>\n" +
                        "        <th><img src='onload/"+this.ghoto+"' width='20px' height='20px'></th>\n" +
                        "        <th>"+this.tname+"</th>\n" +
                        "    </tr>"
                })
                $("#data-content").html(str);
            }
        })
    })
</script>--%>
