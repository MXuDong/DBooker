<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="Title.jsp" %>

<%--声明JSTL标签--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<div class="row">
    <%--本文件只用于展示用户信息,不可以进行设置用户信息--%>
    <!--博客详细信息-->
    <div class="col-md-7">
        <div class="jumbotron">
            <h1 class="display-4">Bookers</h1>
            <hr class="my-4">

            <%--博客链接--%>
            <c:forEach items="${requestScope.bookersList}" var="booker">

                <a href="#" id="_${booker.bookerHead}" onclick="turnToDbInforById(this.id)"
                   class="list-group-item list-group-item-action flex-column align-items-start border border-warning rounded-left">
                    <div class="d-flex w-100 justify-content-between">
                        <h2 class="mb-1">
                                ${booker.bookerHead}
                        </h2>
                        <h5 class="text-muted">
                                ${requestScope.userName}
                        </h5>
                    </div>
                    <h5 class="text-muted">
                            ${booker.createTime}
                    </h5>
                </a>
                <br/>
            </c:forEach>

        </div>
    </div>
    <div class="col-md-5">
        <!--用户信息框-->
        <div class="jumbotron">
            <div id="changeInfo_error">
            </div>
            <h1 class="display-4">DBookerI</h1>
            <p class="lead">我的详细信息
                <button id="InforChange" type="button" class="btn btn-outline-primary float-right disabled" onclick="InforChange_Click()">修改</button>
            </p>

            <table class="table">
                <tr>
                    <td><p class="lead">用户名</p></td>
                    <td>:</td>
                    <td><p class="lead" id="P_UserName">${requestScope.userName}</p></td>
                </tr>
                <tr>
                    <td><p class="lead">用户性别</p></td>
                    <td>:</td>
                    <td><input class="form-control" value="${requestScope.userSeinput}" id="P_UserSex" onchange="InputChanged()"></input></td>
                </tr>
                <tr>
                    <td><p class="lead">用户真实姓名</p></td>
                    <td>:</td>
                    <td><input class="form-control" value="${requestScope.userTrueName}" id="P_TrueName" onchange="InputChanged()"></input></td>
                </tr>
                <tr>
                    <td><p class="lead">用户签名</p></td>
                    <td>:</td>
                    <td><input class="form-control" value="${requestScope.userSign}" id="P_UserSign" onchange="InputChanged()"></input></td>
                </tr>
                <tr>
                    <td><p class="lead">用户自述</p></td>
                    <td>:</td>
                    <td><input class="form-control" value="${requestScope.userDisc}" id="P_UserDisc" onchange="InputChanged()"></input></td>
                </tr>
                <tr>
                    <td><p class="lead">联系电话</p></td>
                    <td>:</td>
                    <td><input class="form-control" value="${requestScope.userPhone}" type="number" id="P_UserPhone" onchange="InputChanged()"></input></td>
                </tr>
                <tr>
                    <td><p class="lead">QQ</p></td>
                    <td>:</td>
                    <td><input class="form-control" value="${requestScope.userQQ}" type="number" id="P_UserQQ" onchange="InputChanged()"></input></td>
                </tr>
                <tr>
                    <td><p class="lead">邮箱</p></td>
                    <td>:</td>
                    <td><input class="form-control" value="${requestScope.userEmail}" id="P_UserEmail" onchange="InputChanged()"></input></td>
                </tr>
            </table>
        </div>
    </div>
</div>

<script language="JavaScript">

    var Follow = $("#P_Follow");
    var changeError = $("#changeInfo_error");

    $(document).ready(function () {
        if (!checkIsLogin()) {
            Follow.addClass("disabled");
        } else {
            //获取是否关注该作者
            $.get("/Follow/isUserFollowAuthor",
                {
                    "userId": getUserIdInCookie(),
                    "authorName": $("#P_UserName").text()
                },
                function (data) {
                    if(data.resInt == 1){
                        // 后台发现关注记录
                        Follow.text("取消关注");
                    }else {
                        // 后台没有发现关注记录
                        Follow.text("关注这个用户");
                    }
                }, "json");
        }
    })

    function InputChanged() {
        $("#InforChange").removeClass("disabled");
        $("#InforChange").text("确认修改");
        changeError.html("");
    }

    //跳转至博客详情页
    function turnToDbInforById(data) {
        var header = "";
        for (var i = 1; i < data.length; i++) {
            header = header + data[i];
        }
        turnToBookerInfo(header);
    }

    //确认修改按钮事件
    function InforChange_Click() {

        if($("#InforChange").text() == "修改"){
            return ;
        }
        $("#InforChange").text("修改");

        // 绑定基本数据
        var userId = getUserIdInCookie();
        var userName = $("#P_UserName").val();
        var userSex = $("#P_UserSex").val();
        var trueName = $("#P_TrueName").val();
        var userSign = $("#P_UserSign").val();
        var userDisc = $("#P_UserDisc").val();
        var userPhone = $("#P_UserPhone").val();
        var userQQ = $("#P_UserQQ").val();
        var userEmail = $("#P_UserEmail").val();
        changeError
        //对数据的长度进行检测
        if (!(userSex == '男' || userSex == '女' || userSex == '')) {
            alertShow(changeError, "性别只能为 男 或 女");
            return;
        }
        if(trueName.length > 10){
            alertShow(changeError, "真实姓名汉语只能最多5个字符，英语最多10个字符！");
            return;
        }
        if(userSign.length > 40){
            alertShow(changeError, "用户签名最多40子英文字符，汉语最多20个字符!");
            return;
        }
        if(userDisc.length > 200){
            alertShow(changeError, "用户描述最多100个字符！");
            return;
        }
        if(userPhone.length != 11 && userPhone.length != 0){
            alertShow(changeError, "请输入正确的手机号码！");
            return;
        }
        if(userQQ.length > 15){
            alertShow(changeError, "QQ长度过长，请检查！最多为15个字符");
            return;
        }
        if(userEmail.length > 20){
            alertShow(changeError, "邮箱地址过长！最多为20个字符！");
            return;
        }
        //检查某些数据的合法性
        //判断QQ和电话是否为数字：
        if(!isNumber(userQQ)){
            alertShow(changeError, "QQ中出现非法字符!");
            return;
        }
        if(!isNumber(userPhone)){
            alertShow(changeError, "电话中出现非法字符！");
            return;
        }
        //判断邮箱是否符合格式
        var myreg = /^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/;
        if(!myreg.test(userEmail) && userEmail.length != 0){
            alertShow(changeError, "邮箱格式错误！");
            return;
        }
        alertShow(changeError,"Success");

    }

    // 判断字符串是否为数字
    function isNumber(Str) {
        var i = 0;
        for(i = 0; i < Str.length; i++){
            if(Str[i] < '0' || Str[i] > '9') return false;
        }
        return true;
    }

</script>
<%@ include file="Footer.jsp" %>