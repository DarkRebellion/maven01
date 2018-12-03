<%--
  Created by IntelliJ IDEA.
  User: li
  Date: 2018/11/21
  Time: 9:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加的页面</title>
    <link rel="stylesheet" type="text/css" href="/css/font-awesome.css">
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="/css/style.css">

    <script type="text/javascript" language="JavaScript" src="/js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="/js/popper.min.js"></script>
    <script type="text/javascript" src="/js/bootstrap.js"></script>

</head>
<body>
<form action="/user/add/addvip" method="post"
      class="form-horizontal" role="form">
    <div class="form-group">
        <label for="uname" class="col-sm-2 control-label">昵称</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="uname" id="uname"
                   placeholder="昵称" value="">
        </div>
    </div>

    <div class="form-group">
        <label for="upwd" class="col-sm-2 control-label">密码</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="upwd" id="upwd"
                   placeholder="密码" value="">
        </div>
    </div>
    <div class="form-group">
        <label for="upwd2" class="col-sm-2 control-label">确认密码</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="upwd2" id="upwd2"
                   placeholder="密码">
        </div>
    </div>
    <div class="form-group" colspan="2">
        <div class="col-sm-10">
            <%--colspan="2"  合并两列--%>
            <input type="hidden" name="unum" value="">
            <input type="submit"  class="btn btn-default" value="提交">
        </div>
    </div>
</form>
</body>
</html>
