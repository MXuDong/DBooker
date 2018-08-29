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
            <h1 class="display-4">DBookerI</h1>
            <p class="lead">我的详细信息
                <button id="P_Follow" type="button" class="btn btn-outline-primary float-right" onclick="">修改</button>
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
                    <td><input class="form-control" value="${requestScope.userSeinput}" id="P_UserSex"></input></td>
                </tr>
                <tr>
                    <td><p class="lead">用户真实姓名</p></td>
                    <td>:</td>
                    <td><input class="form-control" value="${requestScope.userTrueName}" id="P_TrueName"></input></td>
                </tr>
                <tr>
                    <td><p class="lead">用户签名</p></td>
                    <td>:</td>
                    <td><input class="form-control" value="${requestScope.userSign}" id="P_UserSign"></input></td>
                </tr>
                <tr>
                    <td><p class="lead">用户自述</p></td>
                    <td>:</td>
                    <td><input class="form-control" value="${requestScope.userDisc}" id="P_UserDisc"></input></td>
                </tr>
                <tr>
                    <td><p class="lead">联系电话</p></td>
                    <td>:</td>
                    <td><input class="form-control" value="${requestScope.userPhone}" id="P_UserPhone"></input></td>
                </tr>
                <tr>
                    <td><p class="lead">QQ</p></td>
                    <td>:</td>
                    <td><input class="form-control" value="${requestScope.userQQ}" id="P_UserQQ"></input></td>
                </tr>
                <tr>
                    <td><p class="lead">邮箱</p></td>
                    <td>:</td>
                    <td><input class="form-control" value="${requestScope.userEmail}" id="P_UserEmail"></input></td>
                </tr>
            </table>
        </div>
    </div>
</div>

<script language="JavaScript">

    var Follow = $("#P_Follow");

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

    //跳转至博客详情页
    function turnToDbInforById(data) {
        var header = "";
        for (var i = 1; i < data.length; i++) {
            header = header + data[i];
        }
        turnToBookerInfo(header);
    }

</script>
<%@ include file="Footer.jsp" %>