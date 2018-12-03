<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/26
  Time: 9:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
  <head>
    <title>登录页面</title>


      <link rel="stylesheet" type="text/css" href="css/font-awesome.css">
      <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
      <link rel="stylesheet" type="text/css" href="css/style.css">

      <script type="text/javascript" language="JavaScript" src="js/jquery-3.3.1.min.js"></script>
      <script type="text/javascript" src="js/popper.min.js"></script>
      <script type="text/javascript" src="js/bootstrap.js"></script>
  </head>
  <body>
       <div class="login-content">
           <div class="logo-style">
             <h1>Progect Shopping</h1>
           </div>
         <div>
           <form action="/main"method="post">
               <%--这里错了应该去main  main判断返回  或者是设置main--%>
               <div class="input-group">
                   <div class="input-group-prepend">
                       <span class="input-group-text">
                           <i class="fa fa-volume-control-phone"></i>
                       </span>
                   </div>
                   <input type="text" name="unum" class="form-control" placeholder="Telephone">
               </div>

               <div class="input-group">
                   <div class="input-group-prepend">
                       <span class="input-group-text">
                           <i class="fa fa-key"></i>
                       </span>
                   </div>
                   <input type="password" name="upwd" class="form-control" placeholder="password">
               </div>

                    <div class="form-check">
                        <label class="form-check-label">
                            <%--<input type="checkbox" class="form-check-input" value="">记住密码--%>
                        </label>
                    </div>



               <div class="but-style">
               <button type="submit" class="btn btn-success">登录</button>
                   &nbsp; &nbsp; &nbsp; &nbsp;
               <button type="button" href="user/add" class="btn btn-info">注册</button>
               </div>
           </form>
         </div>
       </div>
  </body>
</html>
