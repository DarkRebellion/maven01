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
    <title>修改的页面</title>
    <link rel="stylesheet" type="text/css" href="/css/font-awesome.css">
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="/css/style.css">

    <script type="text/javascript" language="JavaScript" src="/js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="/js/popper.min.js"></script>
    <script type="text/javascript" src="/js/bootstrap.js"></script>

</head>
<body>
<form action="/user/update" method="post"
      class="form-horizontal" role="form" >

    <c:forEach items="${user}" var="user">
    <div class="form-group">
        <label for="uname" class="col-sm-2 control-label">昵称</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="uname" id="uname"
                   placeholder="昵称" value="${user.uname}">
        </div>
    </div>

    <div class="form-group">
        <label for="upwd" class="col-sm-2 control-label">密码</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="upwd" id="upwd"
                   placeholder="密码" value="${user.upwd}">
        </div>
    </div>

    <div class="form-group">
        <label class="col-sm-2 control-label">性别</label>
        <div class="col-sm-10">
            <c:if test="${user.usex}">
                <label class="radio-inline">
                    <input type="radio" name="usex" value="1" checked />男
                </label>

                <label class="radio-inline">
                    <input type="radio" name="usex" value="0" />女
                </label>
            </c:if>
            <c:if test="${user.usex == false }">
                <label class="radio-inline">
                    <input type="radio" name="usex" value="1" />男
                </label>

                <label class="radio-inline">
                    <input type="radio" name="usex" value="0"  checked  />女
                </label>
            </c:if>
        </div>
    </div>

        <div class="form-group">
            <label for="ubirthday" class="col-sm-2 control-label">生日</label>
            <div class="col-sm-10">
                <input type="date" name="ubirthday" id="ubirthday"
                       value="${user.ubirthday}">
            </div>
        </div>


    <div class="form-group">
        <label for="receiver" class="col-sm-2 control-label">收货人</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="receiver" name="receiver"
                   placeholder="这是收货人" value="${user.receiver}">
        </div>
    </div>

    <div class="form-group">
        <label for="rtelephone" class="col-sm-2 control-label">电话</label>
        <div class="col-sm-10">

            <input type="text" class="form-control" id="rtelephone" name="rtelephone"
                   placeholder="这是收货电话" value="${user.rtelephone}">
        </div>

    </div>

    <div class="form-group">
        <label for="radders" class="col-sm-2 control-label">地址</label>
        <div class="col-sm-10">
            <textarea class="form-control" id="radders" name="radders" rows="3">${user.radders}</textarea>

        </div>
    </div>

    <div class="form-group" colspan="2">
        <div class="col-sm-10">
            <%--colspan="2"  合并两列--%>
            <input type="hidden" name="unum" value="${user.unum}">
            <input type="submit"  class="btn btn-default" value="提交">
        </div>
    </div>
    </c:forEach>
</form>


</body>
</html>
