<%--
  Created by IntelliJ IDEA.
  User: Dong
  Date: 2018/8/7
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="Header.jsp" %>
<!-- 登陆界面小标题 -->
<div class="jumbotron jumbotron-fluid">
    <div class="container">
        <h1 class="display-4">DBooker</h1>
        <p class="lead">DBookers, 正在注册</p>
        <hr class="my-4">
        <!-- 错误提示 -->
        <div id="error"></div>
    </div>
</div>
<div class="container-fluid">
    <div class="row">
        <div class="col-md-4"></div>
        <div class="col-md-4">
            <!-- 用户名 -->
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="inputGroup-sizing-default">账&nbsp;&nbsp;&nbsp;&nbsp;号</span>
                </div>
                <input id="userName" type="text" class="form-control" aria-label="Default"
                       aria-describedby="inputGroup-sizing-default" placeholder="您用来登陆的账号">
            </div>

            <!-- 用户密码 -->
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="inputGroup-sizing-default">密&nbsp;&nbsp;&nbsp;&nbsp;码</span>
                </div>
                <input id="password" type="password" class="form-control" aria-label="Default"
                       aria-describedby="inputGroup-sizing-default" placeholder="账号的密码">
            </div>

            <!-- 密码确认 -->
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="inputGroup-sizing-default">确认密码</span>
                </div>
                <input id="password_again" type="password" class="form-control" aria-label="Default"
                       aria-describedby="inputGroup-sizing-default" placeholder="再次输入密码">
            </div>

            <!-- 按钮组 -->
            <div class="row">
                <div class="col-md 4">
                    <button type="button" class="btn btn-outline-success btn-block" onclick="doRegister()">立即注册</button>
                </div>
                <div class="col-md-4"></div>
                <div class="col-md-4">
                    <button type="button" class="btn btn-outline-secondary btn-block" onclick="turnToLogin()">账号登陆</button>
                </div>
            </div>

        </div>
        <div class="col-md-4"></div>
    </div>
</div>

<script type="text/javascript">

    var ERRORDIV = $("#error");

    //页面跳转
    function turnToLogin(){
        window.location="/login";
    }

    //进行注册行为
    function doRegister() {
        if (registerCheck()) {
            $.post("/user/register",
                {
                    "userName": $("#userName").val(),
                    "password": $("#password").val()
                },
                function (data) {
                    if(data.userId == null){
                        alert("Success");
                    }else{
                        alertShow(ERRORDIV,"失败！该账号已经存在，请更换账号重试");
                    }
                }, "json");
        }
    }
    // 判断注册信息是否合法
    function registerCheck() {
        //获取输入的信息
        var userName = $("#userName").val();
        var password = $("#password").val();
        var password_again = $("#password_again").val();

        //判断输入的内容是否合理
        if (!isStringIlgal(userName)) {
            alertShow(ERRORDIV, "异常！账号不合法,输入的信息只能为 英文字母（区分大小写）、数字和下划线，请检查");
            return false;
        }
        if (!isStringIlgal(password)) {
            alertShow(ERRORDIV, "异常！密码不合法,输入的信息只能为 英文字母（区分大小写）、数字和下划线，请检查");
            return false;
        }

        // 判别长度是否合法
        if (!(userName.length >= 5 && userName.length <= 12)) {
            alertShow(ERRORDIV, "错误!账号的长度必须为 5 - 12 （包括5， 12），请检查");
            return false;
        }
        if (!(password.length >= 8 && password.length <= 15)) {
            alertShow(ERRORDIV, "错误!密码的长度必须为 8 - 15 （包括8， 15），请检查");
            return false;
        }

        // 判断两次密码是否一致
        var i = 0;
        if (password.length != password_again.length) {
            alertShow(ERRORDIV, "您输入的两次密码长度不一致");
            return false;
        }
        for (i = 0; i < password.length; i++) {
            if (password_again[i] != password[i]) {
                alertShow(ERRORDIV, "错误!两次密码不一致，请检查");
                return false;
            }
        }

        return true;
    }

    // 登陆账号必须为应为字母、数字或者下划线，其他字符均为不合法字符
    function isStringIlgal(str) {
        var i = 0;
        for (i = 0; i < str.length; i++) {
            if (!(
                    (str[i] >= 'A' && str[i] <= 'Z') ||
                    (str[i] >= 'a' && str[i] <= 'z') ||
                    (str[i] >= '0' && str[i] <= '9') ||
                    (str[i] == '_')
                )) {
                return false;
            }
        }
        return true;
    }


</script>
<%@include file="Footer.jsp" %>
