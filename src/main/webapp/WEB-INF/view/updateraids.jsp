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
    <title>用户信息</title>
    <link rel="stylesheet" type="text/css" href="/css/font-awesome.css">
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="/css/style.css">

    <script type="text/javascript" language="JavaScript" src="/js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="/js/popper.min.js"></script>
    <script type="text/javascript" src="/js/bootstrap.js"></script>

</head>
<body>
<form action="/user/updateraids">
    <table class="table table-condensed">
        <c:forEach items="${raids}" var="raids">
            <%--<tr>${raids.unum}</tr>--%>
            <%--<tr>${raids.uauthority}</tr>--%>


            <div class="form-group">
                <label class="col-sm-2 control-label">编号</label>
                <%--<div class="col-sm-10">--%>
                <label  class="ontrol-label">${raids.unum}</label>
                <%--</div>--%>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">昵称</label>
                    <%--<div class="col-sm-10">--%>
                <label  class="ontrol-label">${raids.uname}</label>
                    <%--</div>--%>
            </div>
            <%--<div class="form-group">--%>
                <%--<label for="uname" class="col-sm-2 control-label">昵称</label>--%>
                <%--<div class="col-sm-10">--%>
                    <%--<label  class="form-control" name="uname" id="uname"--%>
                            <%--placeholder="昵称" >${raids.uname}</label>--%>
                <%--</div>--%>
            <%--</div>--%>
            <div class="form-group">
                <label for="uauthority" class="col-sm-2 control-label">权限</label>
                <div class="col-sm-10">
                    <c:if test="${raids.uauthority==1}">
                    <select type="file" class="form-control" name="uauthority" id="uauthority">
                        <option value="1" selected >1</option>
                        <option value="2" >2</option>
                        <option value="3" >3</option>
                    </select>
                    </c:if>
                    <c:if test="${raids.uauthority ==2}">
                        <select type="file" class="form-control" name="uauthority" id="uauthority">
                            <option value="1"  >1</option>
                            <option value="2" selected >2</option>
                            <option value="3" >3</option>
                        </select>
                    </c:if>
                    <c:if test="${raids.uauthority ==3}">
                        <select type="file" class="form-control" name="uauthority" id="uauthority">
                            <option value="1"  >1</option>
                            <option value="2" >2</option>
                            <option value="3" selected >3</option>
                        </select>
                    </c:if>
                </div>
                <div class="form-group" colspan="2">
                    <div class="col-sm-10">
                            <%--colspan="2"  合并两列--%>
                        <input type="hidden" name="unum" value="${raids.unum}">
                        <input type="submit"  class="btn btn-default" value="提交">
                    </div>
                </div>
            </div>


        </c:forEach>
    </table>
</form>
</body>
</html>
