<%--
  Created by IntelliJ IDEA.
  User: li
  Date: 2018/11/2
  Time: 18:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>添加商品</title>
    <link rel="stylesheet" type="text/css" href="/css/font-awesome.css">
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="/css/style.css">

    <script type="text/javascript" language="JavaScript" src="/js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="/js/popper.min.js"></script>
    <script type="text/javascript" src="/js/bootstrap.js"></script>
</head>
<body>
<form action="/goods/addcommit" method="post" enctype="multipart/form-data">
    <table class="table-striped">

        <div class="form-group">

        <label for="gname" class="col-sm-2 control-label">商品名</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="gname" id="gname"
                   placeholder="商品名" >
            </div>
        </div>

        <div class="form-group">
            <label for="gprice" class="col-sm-2 control-label">价格</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="gprice" id="gprice"
                   placeholder="价格" >
            </div>
        </div>

    <div class="form-group">
        <label for="grepertory" class="col-sm-2 control-label">库存</label>
        <div class="col-sm-10">
            <input type="number" class="form-control" name="grepertory" id="grepertory"
                   placeholder="库存" >
        </div>
    </div>
    <div class="form-group">
        <label for="gsalesvolume" class="col-sm-2 control-label">销售量</label>
        <div class="col-sm-10">
            <input type="number" class="form-control" name="gsalesvolume" id="gsalesvolume"
                   placeholder="销售量" >
        </div>
    </div>

    <div class="form-group">
        <label for="gremarks" class="col-sm-2 control-label">规格</label>
        <div class="col-sm-10">
            <textarea class="form-control" id="gremarks" name="gremarks" rows="4"></textarea>
        </div>
    </div>
    <div class="form-group">
        <label for="gphoto" class="col-sm-2 control-label">图片</label>
        <div class="col-sm-10">
            <input type="file" class="form-control-file" name="gphoto" id="gphoto"
                   placeholder="图片" >
        </div>
    </div>
    <div class="form-group">
        <label for="tid" class="col-sm-2 control-label">分类</label>
        <div class="col-sm-10">
            <select type="file" class="form-control" name="tid" id="tid">
                <c:forEach  items="${type}" var="type">
                    <option value="${type.tid}">${type.tname}</option>
                </c:forEach>
            </select>
        </div>
    </div>
    <div class="form-group" colspan="2">
        <div class="col-sm-10">
            <%--colspan="2"  合并两列--%>
            <input type="submit"  class="btn btn-default" value="提交">
        </div>
    </div>

    </table>
</form>
<script>
    // $(function () {
    //     $.ajax({
    //         url:"listall.type",
    //         dataType:"json",
    //         success:function (result) {
    //             console.log(result);
    //             var str="";
    //             $(result).each(function () {
    //                 str+="<option value='"+this.tid+"'>"+this.tname+"</option>"
    //             })
    //             $("select[name='tid']").html(str);
    //         }
    //     })
    // })


</script>
</body>
</html>
