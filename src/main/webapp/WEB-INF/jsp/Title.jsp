<%--
  Created by IntelliJ IDEA.
  User: Dong
  Date: 2018/8/9
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="Header.jsp"%>
<nav class="navbar navbar-expand-lg navbar-light" style="background-color: #e3f2fd;">

    <!-- 标题 -->
    <a class="navbar-brand" href="#">DBooker</a>

    <!-- 链接组 -->
    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
        <div class="navbar-nav">
            <a id="navbar_about"     href="#" class="nav-item nav-link active">关于</a>
            <a id="navbar_newBooker" href="#" class="nav-item nav-link" >创建新博客</a>
            <a id="navbar_myDb"      href="#" class="nav-item nav-link" >我的DB空间</a>
            <a id="navbar_myFollow"  href="#" class="nav-item nav-link" >我的关注</a>
            <a id="navbar_myCare"    href="#" class="nav-item nav-link" >我的收藏</a>
            <a id="navbar_myInfo"    href="#" class="nav-item nav-link" >个人信息</a>
            <a id="navbar_LR"        href="#" class="nav-item nav-link" ></a>
        </div>
    </div>

    <!-- 搜索框 -->
    <form class="form-inline">
        <input id="SearchInfo" class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">查找</button>
    </form>
</nav>

<script type="text/javascript">

    //绑定常量  导航连的所有链接
    var NAVBAR_ABOUT     = $("#navbar_about");
    var NAVBAR_NEWBOOKER = $("#navbar_newBooker");
    var NAVBAR_MYDB      = $("#navbar_myDb");
    var NAVBAR_MYFOLLOW  = $("#navbar_myFollow");
    var NAVBAR_MYCARE    = $("#navbar_myCare");
    var NAVBAR_MYINFO    = $("#navbar_myInfo");
    var NAVBAR_LR        = $("#navbar_LR");

    // Windows加载调用的方法
    $(document).ready(function(){
        if(checkIsLogin()){
            var userId = getUserIdInCookie();
        }else{
            NAVBAR_NEWBOOKER.addClass("disabled");
            NAVBAR_MYDB.addClass("disabled");
            NAVBAR_MYFOLLOW.addClass("disabled");
            NAVBAR_MYCARE.addClass("disabled");
            NAVBAR_MYINFO.addClass("disabled");
            NAVBAR_LR.text("登陆");
        }
    });

    function SearchButton(){
        var searchInfo = $("#SearchInfo").val();
    }
</script>
