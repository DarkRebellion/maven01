<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/26
  Time: 9:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="/css/font-awesome.css">
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="/css/style.css">

    <script type="text/javascript" language="JavaScript" src="/js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="/js/popper.min.js"></script>
    <script type="text/javascript" src="/js/bootstrap.js"></script>
</head>
<body>

     <div class="page-content">
         <div id="left" class="col-2">
               <div>
                  <i class="fa fa-user-secret fa-4x"></i> 欢迎${main}
                   <br>
                   <%--登录时间：2018-10-26--%>
               </div>
             <nav class="navbar bg-light" id="navbg">
                 <ul class="navbar-nav "name="items" >
                 <c:forEach items="${authorities}"  var="r">
                     <%--<div>${r.url}</div>--%>
                     <div name="item" style="border-radius: 20px">
                     <li class="nav-item radius" >
                         <a class="nav-link radius" href="${r.url}" target="content">
                             <i class="${r.tstyle}"></i>&nbsp;&nbsp;${r.acontent}
                         </a>
                     </li>
                     </div>
                 </c:forEach>
                 </ul>

                 <!-- Links -->
                 <%--
                 <ul class="navbar-nav " >
                     <li class="nav-item ">
                         <a class="nav-link" href="vip2.jsp" target="content"><i class="fa fa-users fa-2x"></i>&nbsp;&nbsp;vip管理</a>
                     </li>
                     <li class="nav-item ">
                         <a class="nav-link" href="user.jsp"  target="content"><i class="fa fa-user-circle fa-2x"></i>&nbsp;&nbsp;员工管理</a>
                     </li>
                     <li class="nav-item">
                         <a class="nav-link" href="#" target="content"><i class="fa fa-lock fa-3x"></i>&nbsp;&nbsp;权限管理</a>
                     </li>
                     <li class="nav-item">
                         <a class="nav-link" href="goodlist.jsp" target="content"><i class="fa fa-shopping-bag fa-2x"></i>&nbsp;&nbsp;商品管理</a>
                     </li>
                     <li class="nav-item">
                     <a class="nav-link" href="#" target="content"><i class="fa fa-book fa-2x"></i>&nbsp;&nbsp;订单管理</a>
                 </li>
                     <li class="nav-item">
                         <a class="nav-link" href="#" target="content"><i class="fa fa-pagelines fa-2x"></i>&nbsp;&nbsp;报表管理</a>
                     </li>
                 </ul>

                 --%>

             </nav>
         </div>
         <div class="col-10" style="flex-flow: column-reverse ;overflow: hidden ;padding: 0px;">
             <div class="col-12"style="height:9%;width:100%;border-width: 0px;">
                 <h1>Neuedu Shopping</h1>
                 <a href="login" style="position:absolute;right: 0px;top:10px;"><i class="fa fa-times"></i>退出</a>
             </div>
             <div style="padding-left: 20px">
                 <iframe name="content" class="framestyle" style="height:83%;width:100%;border-width: 0px;" src="/welcome">

                 </iframe>
             </div>
             <div class="foot" style="flex: 1 ;width:100%">
                 &copy; xxx制作，公司：
                 电话：

             </div>
         </div>
     </div>
     <script>
         $(document).ready(function(){
             $("div[name='item']").mouseover(function(){
                 $(this).addClass("item-foucs");
             });
             $("div[name='item']").mouseout(function(){
                 $(this).removeClass("item-foucs");
             });
             $("div[name='item']").click(function () {
                 $("div[name='item']").removeClass("item-click");
                 $(this).addClass("item-click")
             })
         });

     </script>
</body>
</html>
