<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="Title.jsp" %>

!--本文件只用于展示用户信息,不可以进行设置用户信息-->
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
        <p class="lead">The information of this user
            <button type="button" class="btn btn-outline-primary float-right">Follow This User</button>
        </p>

        <table class="table">
            <tr>
                <td><p class="lead">用户名</p></td>
                <td>:</td>
                <td><p class="lead" id="P_UserName"></p></td>
            </tr>
            <tr>
                <td><p class="lead">用户性别</p></td>
                <td>:</td>
                <td><p class="lead" id="P_UserSex"></p></td>
            </tr>
            <tr>
                <td><p class="lead">用户真实姓名</p></td>
                <td>:</td>
                <td><p class="lead" id="P_TrueName"></p></td>
            </tr>
            <tr>
                <td><p class="lead">用户签名</p></td>
                <td>:</td>
                <td><p class="lead" id="P_UserSign"></p></td>
            </tr>
            <tr>
                <td><p class="lead">用户自述</p></td>
                <td>:</td>
                <td><p class="lead" id="P_UserDisc"></p></td>
            </tr>
            <tr>
                <td><p class="lead">联系电话</p></td>
                <td>:</td>
                <td><p class="lead" id="P_UserPhone"></p></td>
            </tr>
            <tr>
                <td><p class="lead">QQ</p></td>
                <td></td>
                <td><p class="lead" id="P_" UserQQ></p></td>
            </tr>
            <tr>
                <td><p class="lead">邮箱</p></td>
                <td>:</td>
                <td><p class="lead" id="P_UserEmail"></p></td>
            </tr>
        </table>
    </div>
</div>
<!--占位用-->
<div class="col-md-3"></div>

<%@ include file="Footer.jsp" %>