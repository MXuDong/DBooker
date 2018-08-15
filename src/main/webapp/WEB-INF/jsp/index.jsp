<%--
  Created by IntelliJ IDEA.
  User: Dong
  Date: 2018/8/2
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="Title.jsp" %>

<!-- 主分区 -->
<div class="row">
    <!-- 个人DB信息 -->
    <div class="col-md-2" id="indexUserModel">

        <span class="border border-success">
        <%--大面板--%>
            <div class="jumbotron">
                <p class="lead">我的DB</p>
                <hr class="my-4">
                <!-- 列表框 -->
                <div class="list-group" id="indexUserDb">
                </div>
            </div>
        </span>
    </div>
    <!-- 最新发表 -->
    <div class="col-md-7">
        <div class="jumbotron">
            <p class="lead">总览</p>
            <hr class="my-4">
            <p class="lead">
                实时更新，快速阅览所有Booker
            </p>
            <!-- 列表框 -->
            <div class="list-group" id="AllBooker">
            </div>
        </div>

    </div>
    <!-- 关注人更新列表与收藏更新列表-最多每个显示10条（即：20条)
    且总和不超过最新发表 -->
    <div class="col-md-3">
        <%--大面板--%>
            <div class="jumbotron">
                <p class="lead">本站通知</p>
                <hr class="my-4">
                <p class="lead">
                    Time:2018年8月15日-14点51分<br>
                    Head:本站开始运行<br>
                    User:Root<br>
                    To  :All User
                </p>
            </div>
    </div>
</div>

<script type="text/javascript">

    var INDEX_USERDB = $("#indexUserDb");
    var INDEX_USERMODEL = $("#indexUserModel");
    var INDEX_ALL_BOOKER = $("#AllBooker");
    var Get_All_Booker_Flg = 0;

    //加载初始化项目
    $(document).ready(function () {
        // 验证是否有登陆
        if (checkIsLogin()) {
            //有登陆获取登陆列表
            getAuthorBookers();
        } else {
            // 没有登陆 提示用户需要登陆了
            indexUserDB_add(INDEX_USERDB, "点击登陆获取信息");
            $("#userInfo").text = "请先登陆"
        }

        getAllBooker();
    })

    //获取全部的部份Booker
    function getAllBooker() {
        var flagId = Get_All_Booker_Flg;
        $.get("/booker/getMainBookers",
            {
                "flagId": flagId
            },
            function (data) {
                for (var i = 0; i < data.length; i++) {
                    addBookersIndex(data[i].bookerHead,data[i].bookerInfo, new Date(data[i].createTime).toDateString());
                }
            },
            "json");
    }

    //获取作者的全部Booker
    function getAuthorBookers() {
        $.get("/booker/getUserBookers",
            {
                "getStatus": "-1",
                "UserId": getUserIdInCookie
            },
            function (data) {
                for (var i = 0, l = data.length; i < l; i++) {
                    indexUserDB_add(INDEX_USERDB, data[i].bookerHead);
                }
            }, "json");
    }

    //插入列表，需要父元素
    function indexUserDB_add(parent, data) {
        parent.append("<a href=\"#\" class=\"list-group-item list-group-item-action list-group-item-secondary\" onclick=\"turnToDbInfor(this)\">" + data + "</a>")
    }

    //插入booker索引
    function addBookersIndex(booker_headber, booker_author, booker_createTime) {
        var str1 = "<a href=\"#\" class=\"list-group-item list-group-item-action flex-column align-items-start border border-warning rounded-left\" onclick=\"turnToDbInfor(this)\"><div class=\"d-flex w-100 justify-content-between\"><h2 class=\"mb-1\">";
        var str2 = "</h1=2><h5 class=\"text-muted\">";
        var str3 = "</h5></div><h5 class=\"text-muted\">";
        var str4 = "</h5></a><br />";

        var res = str1 + "标题：" + booker_headber + str2 + "作者：" + booker_author + str3 + "发布日期：" + booker_createTime + str4;

        INDEX_ALL_BOOKER.append(res);
    }

    //跳转至登陆或者博客详细信息
    function turnToDbInfor(data) {
        if (data.text == "点击登陆获取信息") {
            window.location = "/login";
        }else{
            var BookerHeader = data.text;
            turnToBookerInfo(BookerHeader);
        }
    }


</script>

<%@ include file="Footer.jsp" %>