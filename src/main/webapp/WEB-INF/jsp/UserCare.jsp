<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<%@include file="Title.jsp" %>
    <div class="row">
        <div class="col-md-2"></div>
        <div class="col-md-8">
            <div class="jumbotron">
                <h1 class="display-4">我收藏的Booker</h1>
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
        <div class="col-md-2"></div>
    </div>

<script>
    function turnToDbInforById(data) {
        var header = "";
        for (var i = 1; i < data.length; i++) {
            header = header + data[i];
        }
        turnToBookerInfo(header);
    }
</script>
<%@ include file="Footer.jsp" %>