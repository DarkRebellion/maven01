<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/26
  Time: 10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta charset="utf-8" />

    <link rel="stylesheet" type="text/css" href="/css/font-awesome.css">
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="/css/style.css">

    <script type="text/javascript" language="JavaScript" src="/js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="/js/popper.min.js"></script>
    <script type="text/javascript" src="/js/bootstrap.js"></script>
</head>
<style>
    .box{
        height: 400px;
        width: 400px;
        background-color: #de88af;
        /*box-sizing: border-box;
        border-color: blue;
        border-width: 10px;*/
    }
    .One{
        height: 10px;
        width: 10px;
        background-color: darkgray;
        position:absolute;
    }
    #head{
        background-color: chartreuse;
        position:absolute;
        left:30px;
        top:40px;

    }
    .b1{
        left:20px;
        top:40px;
    }
    .b2{
        left:10px;
        top:40px;
    }
    .b3{
        left:0px;
        top:40px;
    }
    #snake{
        position:absolute;
    }
    #food{
        background-color:  darkblue;
        position:absolute;
    }

</style>
<body>
    欢迎您使用！
    <button id="start" value="开始">开始/暂停</button>
    <br>
    <div class="box">
        <div id="snake" class="">
            <div id="food" class="One"></div>
            <div id="head" class="One"></div>
            <div class="One b1"></div>
            <div class="One b2"></div>
            <div class="One b3"></div>
        </div>
    </div>

</body>

<script>
        var h_x=30;
        var h_y=40;
        var f_x=Math.round(Math.random()*9)*10;
        var f_y=Math.round(Math.random()*9)*10;
        var goingway="x+";

        var interval = setInterval(function(){going()},200);
        var go=0;



        $(function(){
            $("#head").css({'left':h_x,'top':h_y});
            $("#food").css({'left':f_x,'top':f_y});

            $(document).keyup(function(event){
                console.log(event.keyCode);
                if(goingway=="x+"||goingway=="x-"){

                    if(event.keyCode == 87||event.keyCode == 38){
                        goingway="y-";
                    }
                    if(event.keyCode == 83||event.keyCode == 40){
                        goingway="y+";
                    }
                }
                if(goingway=="y+"||goingway=="y-"){
                    if(event.keyCode == 68||event.keyCode == 39){
                        goingway="x+";
                    }
                    if(event.keyCode == 65||event.keyCode == 37){
                        goingway="x-";
                    }
                }

            })
        });
        $("#start").click(
            function (){
                if(go==0){
                    go=1;
                    $("#start").val("停止");
                }else{
                    go=0;
                    $("#start").val("开始");
                }

            });

        function going() {
            if (go==1) {
                var bodynew = $("<div id='body'></div>");
                bodynew.addClass("One");
                bodynew.css({'left': h_x, 'top': h_y});
                $("#head").after(bodynew);


                switch (goingway) {
                    case "x+":
                        h_x = h_x + 10;
                        break;
                    case "x-":
                        h_x = h_x - 10;
                        break;
                    case "y+":
                        h_y = h_y + 10;
                        break;
                    case "y-":
                        h_y = h_y - 10;
                        break;
                }
                if (h_x >= 400 || h_y >= 400 || h_x < 0 || h_y < 0) {
                    alert("!");
                    clearInterval(interval);
                }

                $("#head").css({'left': h_x, 'top': h_y});


                if (h_x != f_x || h_y != f_y) {
                    $("#snake").children().last().remove();
                }
                else {
                    f_x = Math.floor(Math.random() * 9) * 10;
                    f_y = Math.floor(Math.random() * 9) * 10;
                    $("#food").css({'left': f_x, 'top': f_y});
                }
            }
        }
</script>



</html>
