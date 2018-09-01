<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="Title.jsp" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<div class="row">
    <div class="col-md-2"></div>
    <div class="col-md-8">
        <div class="jumbotron">
            <h1 class="display-4">我关注的DBookers</h1>
            <hr class="my-4">
            <%--博客链接--%>
            <c:forEach items="${requestScope.userList}" var="user">
                <a href="#" id="_${user.userName}" onclick="turnPersonInfoIn(this.id)"
                   class="list-group-item list-group-item-action flex-column align-items-start border border-warning rounded-left">
                    <div class="d-flex w-100 justify-content-between">
                        <h2 class="mb-1">
                                ${user.userName}
                        </h2>
                        <h5 class="text-muted float-right">
                                ${user.userSign}
                        </h5>
                    </div>
                </a>
                <br/>
            </c:forEach>
        </div>
    </div>
    <div class="col-md-2"></div>
</div>

<script>
    function turnPersonInfoIn(data) {
        var userName = "";
        for (var i = 1; i < data.length; i++) {
            userName = userName + data[i];
        }
        turnToUserInfo(userName)
    }
</script>
<%@ include file="Footer.jsp" %>