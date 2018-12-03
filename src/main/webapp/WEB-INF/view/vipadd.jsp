<%--
  Created by IntelliJ IDEA.
  User: li
  Date: 2018/11/21
  Time: 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>添加一位员工</title>
    <link rel="stylesheet" type="text/css" href="/css/font-awesome.css">
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="/css/style.css">

    <script type="text/javascript" language="JavaScript" src="/js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="/js/popper.min.js"></script>
    <script type="text/javascript" src="/js/bootstrap.js"></script>

</head>
<body>
<form action="/user/vip/addvip" method="post"
      class="form-horizontal" role="form" >

    <div class="form-group">
        <label for="unum" class="col-sm-2 control-label">账号</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="unum" id="unum"
                   placeholder="账号" value="">
        </div>
    </div>

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
            <label class="col-sm-2 control-label">性别</label>
            <div class="col-sm-10">
                    <label class="radio-inline">
                        <input type="radio" name="usex" value="1" checked />男
                    </label>

                    <label class="radio-inline">
                        <input type="radio" name="usex" value="0" />女
                    </label>


            </div>
        </div>

        <div class="form-group">
            <label for="ubirthday" class="col-sm-2 control-label">生日</label>
            <div class="col-sm-10">
                <input type="date" name="ubirthday" id="ubirthday"
                       value="">
            </div>
        </div>




        <div class="form-group" colspan="2">
            <div class="col-sm-10">
                    <%--colspan="2"  合并两列--%>
                <%--<input type="hidden" name="unum" value="">--%>
                <input type="submit"  class="btn btn-default" value="提交">
            </div>
        </div>
</form>


</body>
</html>
