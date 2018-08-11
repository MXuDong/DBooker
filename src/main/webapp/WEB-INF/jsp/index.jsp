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
    <div class="col-md-2">
        <!-- 列表框 -->
        <div class="list-group" id="indexUserDb">
        </div>
    </div>
    <!-- 最新发表 -->
    <div class="col-md-5"></div>
    <!-- 关注人更新列表与收藏更新列表-最多每个显示条（即：20条)
    且总和不超过最新发表 -->
    <div class="col-md-5"></div>
</div>

<script type="text/javascript">

    var INDEX_USERDB = $("#indexUserDb");

    $(document).ready(function (){
        if(checkIsLogin()){

        }else{
            indexUserDB_add(INDEX_USERDB, "点击登陆获取更多信息");
        }
    })

    function getUserBookerCount() {
        $.get("/booker/getUserBookerCount",
            {"userId": 2})
    }

    function indexUserDB_add(parent,data){
        parent.append("<a href=\"#\" class=\"list-group-item list-group-item-action\" onclick=\"turnToDbInfor(this)\">" + data + "</a>")
    }

    function turnToDbInfor(data){
        if(data.text == "点击登陆获取更多信息"){
            window.location = "/login";
        }
    }
</script>

<%@ include file="Footer.jsp" %>