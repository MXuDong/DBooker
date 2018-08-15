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
            <span id="BookerInfo">

            </span>
            <%--版权声明--%>
            <p class="lead text-right">
                <small id="AuthorOf">
                    版权声明
                </small>
            </p>

            <button type="button" class="btn btn-outline-primary" id="Care">收藏</button>
            <button type="button" class="btn btn-outline-secondary" id="Speak">评论</button>

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
<%@ include file="Footer.jsp" %>
