<%--
  Created by IntelliJ IDEA.
  User: Dong
  Date: 2018/8/2
  Time: 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="Header.jsp"%>

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
<%@ include file="Footer.jsp"%>