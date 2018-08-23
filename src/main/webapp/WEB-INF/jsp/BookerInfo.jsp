<%--
  Created by IntelliJ IDEA.
  User: Dong
  Date: 2018/8/15
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="Title.jsp" %>
<div class="row">
    <div class="col-md-2">
        <!-- 占位符 -->
    </div>
    <div class="col-md-8">
        <div class="jumbotron">
            <h1 class="display-4" id="BookerHeader">BookerHeader</h1>
            <p class="lead text-right" id="BookerCreateTime">createTime</p>
            <hr class="my-4">
            <span id="BookerInfo"></span>
            <%--版权声明--%>
            <p class="lead text-right">
                <small id="AuthorOf">
                    版权声明
                </small>
            </p>

            <button type="button" class="btn btn-outline-primary" id="Care" onclick="onCareClick()"></button>
            <button type="button" class="btn btn-outline-secondary" id="Speak" onclick="onSpeakClick()">评论</button>

        </div>
        <%--评论列表--%>
        <div>

        </div>
    </div>
    <div class="col-md-2">

        <!-- 这个booker的主人的其他Booker -->
        <!-- <%--大面板--%> -->
        <div class="jumbotron">
            <!-- 博客作者，点击跳转到他的信息页面 -->
            <p class="lead" id="BookerAuthor">UserName</p>
            <hr class="my-4">
            <!-- 列表框 -->
            <div class="list-group" id="indexUserDb">
            </div>
        </div>
    </div>
</div>

<script language="JavaScript">
    var BookerHeader = $("#BookerHeader");
    var CreateTime = $("#BookerCreateTime");
    var BookerInfo = $("#BookerInfo");
    var AuthorOf = $("#AuthorOf");
    var Button_Care = $("#Care");
    var Button_Speak = $("#Speak");
    var INDEX_USERDB = $("#indexUserDb");
    var BookerAuthor = $("#BookerAuthor");

    $(document).ready(function () {
        var bookerHeader = $.cookie("BookerHeader");

        //检查Booker是否存在
        if (bookerHeader == null) {
            BookerInfo.text = "没有找到这篇Booker，三秒后返回主页，请您重试！";
            setTimeout(window.location = "index", 3);
        }

        //可以申请Booker信息

        $.get("/booker/getBookerInfo",
            {
                "BookerHeader": bookerHeader
            },
            function (data) {
                BookerHeader.text(data.bookerHead);
                CreateTime.text(new Date(data.createTime).toDateString());
                BookerInfo.text("");
                BookerInfo.append(data.bookerInfo);
                //加载文章作者的其他博客
                $.get("/booker/getUserBookers",
                    {
                        "getStatus": "-1",
                        "UserId": data.userId
                    },
                    function (data) {
                        for (var i = 0, l = data.length; i < l; i++) {
                            indexUserDB_add(INDEX_USERDB, data[i].bookerHead);
                        }
                    }, "json");
                $.get("/user/getUserName",
                    {
                        "userId": data.userId
                    },
                    function (data) {
                        AuthorOf.text("版权所有：" + data.userName);
                        BookerAuthor.text(data.userName);
                    }, "json")
            }, "json")

        //设置关注状态
        if (!checkIsLogin()) {
            Button_Care.addClass("disabled");
            Button_Care.text("关注");
            Button_Speak.addClass("disabled");
        } else {
            $.get("/Care/isUserCareBooker",
                {
                    "bookerHeader": bookerHeader,
                    "userId": getUserIdInCookie()
                },
                function (data) {
                    if (data.resInt == 1) {
                        Button_Care.text("取消关注");
                    } else {
                        Button_Care.text("关注");
                    }
                }, "json")
        }
        deleteCookie("BookerHeader");
    })

    // 关注按钮事件
    function onCareClick() {
        // 检查登陆
        if (checkIsLogin()) {
            var userId = getUserIdInCookie();
            var bookerHeader = BookerHeader.text();
            if (Button_Care.text() == "关注") {
                // 添加关注
                $.get("/Care/addCare",
                    {
                        "userId": userId,
                        "bookerHeader": bookerHeader
                    });
                Button_Care.text("取消关注")
            } else {
                //取消关注
                $.get("/Care/deleteCare",
                    {
                        "userId": userId,
                        "bookerHeader": bookerHeader
                    });
                Button_Care.text("关注")
            }
        }

    }

    // 评论按钮事件
    function onSpeakClick() {

    }

    //跳转博客事件
    function turnToDbInfor(data) {
        var BookerHeader = data.text;
        turnToBookerInfo(BookerHeader);
    }

    //插入列表，需要父元素
    function indexUserDB_add(parent, data) {
        parent.append("<a href=\"#\" class=\"list-group-item list-group-item-action list-group-item-secondary\" onclick=\"turnToDbInfor(this)\">" + data + "</a>")
    }

</script>
<%@ include file="Footer.jsp" %>
