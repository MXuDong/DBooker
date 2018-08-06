<%--
  Created by IntelliJ IDEA.
  User: Dong
  Date: 2018/8/2
  Time: 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="Header.jsp"%>
<!-- 登陆界面小标题 -->
<div class="jumbotron jumbotron-fluid">
    <div class="container">
        <h1 class="display-4">DBooker</h1>
        <p class="lead">DBookers, 请您登陆</p>
        <hr class="my-4">
        <!-- 错误提示 -->
        <div id="login_error">

        </div>
    </div>
</div>
<div class="container-fluid">
    <div class="row">
        <div class="col-md-4"></div>
        <!-- 登陆分区 -->
        <div class="col-md-4">
            <!-- 用户名 -->
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="inputGroup-sizing-default">账&nbsp;&nbsp;&nbsp;&nbsp;号</span>
                </div>
                <input id="userName" type="text" class="form-control" aria-label="Default" aria-describedby="inputGroup-sizing-default" placeholder="登陆账号">
            </div>
            <!-- 密码 -->
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="inputGroup-sizing-default">密&nbsp;&nbsp;&nbsp;&nbsp;码</span>
                </div>
                <input id="password" type="password" class="form-control" aria-label="Default" aria-describedby="inputGroup-sizing-default" placeholder="登陆密码">
            </div>
            <!-- 按钮  登陆， 重制-->
            <div class="row">
                <div class="col-md 4"><button type="button" class="btn btn-outline-success btn-block" onclick="login()">确认登陆</button></div>
                <div class="col-md-4"><button type="button" class="btn btn-outline-warning btn-block">忘记密码</button></div>
                <div class="col-md-4"><button type="button" class="btn btn-outline-secondary btn-block">立即注册</button></div>
            </div>
            <div class="col-md-4"></div>
        </div>
    </div>

    <script type="text/javascript">
        function alertShow(info) {
            $("#login_error").append("<div class=\"alert alert-danger\" role=\"alert\"> " + info + " <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button></div>")
        }

        function login_Check(){
            var userName = $("#userName").val();
            if(userName.length == 0){
                alertShow("错误！账号不能为空");
                return false;
            }

            var password = $("#password").val();
            if(password.length == 0){
                alertShow("错误！密码不能为空");
                return false;
            }

            return true;
        }

        function login() {
            if(login_Check()){
                doPost();
            }
            else{
                return false;
            }
        }
        
        function doPost() {
            var userName = $("#userName").val();
            var password = $("#password").val();
            $.post(
                "/user/login",
                {
                    "userName":userName,
                    "password":password
                },
                function (data) {
                    if(data.userId == null){
                        return false;
                    }else{

                    }
                },
                "json"
            );
        }
    </script>
<%@ include file="Footer.jsp"%>