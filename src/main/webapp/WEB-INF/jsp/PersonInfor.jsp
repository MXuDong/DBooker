<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="Title.jsp" %>

<%--声明JSTL标签--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<div class="row">
    <%--本文件只用于展示用户信息,不可以进行设置用户信息--%>
    <!--占位用-->
    <div class="col-md-3"></div>
    <!--信息显示区-->
    <!--
    用户信息
    1:用户名
    2:用户性别
    3:用户真实姓名
    4:用户签名
    5:用户描述
    详细信息:
    6:用户电话
    7:qq号码
    8:电子邮箱
    -->
    <div class="col-md-6">
        <!--用户信息框-->
        <div class="jumbotron">
            <h1 class="display-4">DBooker</h1>
            <p class="lead">这个用户的详细信息
                <button type="button" class="btn btn-outline-primary float-right">关注这个用户</button>
            </p>

            <table class="table">
                <tr>
                    <td><p class="lead">用户名</p></td>
                    <td>:</td>
                    <td><p class="lead" id="P_UserName">${requestScope.userName} </p></td>
                </tr>
                <tr>
                    <td><p class="lead">用户性别</p></td>
                    <td>:</td>
                    <td><p class="lead" id="P_UserSex"></p>${requestScope.userSex}</td>
                </tr>
                <tr>
                    <td><p class="lead">用户真实姓名</p></td>
                    <td>:</td>
                    <td><p class="lead" id="P_TrueName">${requestScope.userTrueName}</p></td>
                </tr>
                <tr>
                    <td><p class="lead">用户签名</p></td>
                    <td>:</td>
                    <td><p class="lead" id="P_UserSign">${requestScope.userSign}</p></td>
                </tr>
                <tr>
                    <td><p class="lead">用户自述</p></td>
                    <td>:</td>
                    <td><p class="lead" id="P_UserDisc">${requestScope.userDisc}</p></td>
                </tr>
                <tr>
                    <td><p class="lead">联系电话</p></td>
                    <td>:</td>
                    <td><p class="lead" id="P_UserPhone">${requestScope.userPhone}</p></td>
                </tr>
                <tr>
                    <td><p class="lead">QQ</p></td>
                    <td>:</td>
                    <td><p class="lead" id="P_" UserQQ>${requestScope.userQQ}</p></td>
                </tr>
                <tr>
                    <td><p class="lead">邮箱</p></td>
                    <td>:</td>
                    <td><p class="lead" id="P_UserEmail">${requestScope.userEmail}</p></td>
                </tr>
            </table>
        </div>
    </div>
    <!--占位用-->
    <div class="col-md-3"></div>
</div>
<%@ include file="Footer.jsp" %>