<%--
  Created by IntelliJ IDEA.
  User: Dong
  Date: 2018/8/2
  Time: 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="Header.jsp" %>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span2">
        </div>
        <div class="span8">
            <div class="control-group">
                <label class="control-label" for="inputUserName">邮箱</label>
                <div class="controls">
                    <input id="inputUserName" type="text"/>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="inputPassword">密码</label>
                <div class="controls">
                    <input id="inputPassword" type="password"/>
                </div>
            </div>
            <div class="control-group">
                <div class="controls">
                    <button type="submit" class="btn" onclick="Login()">登陆</button>
                </div>
            </div>
        </div>
        <div class="span2">
        </div>
    </div>
</div>
<script>
    function Login() {
        var userName = $("#inputUserName").val();
        var password = $("#inputPassword").val();

        if (userName.length == 0) {
            $("#inputUserName")
        }

        $.post(
            "/user/login/",
            {
                "userName": userName,
                "password": password
            },
            function (data) {
                console.log(data.userId);
            },
            "json");
    }
</script>
<%@ include file="Footer.jsp" %>