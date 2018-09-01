<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="Title.jsp" %>

<div class="row">
    <div class="col-md-2"></div>
    <div class="col-md-8">
        <div class="jumbotron">
            <div id="NewBooker_Error">

            </div>
            <h1 class="display-4">New Booker</h1>
            <div class="input-group input-group-lg">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="inputGroup-sizing-lg">Booker's Header</span>
                </div>
                <input type="text" id="BookerHeader" class="form-control" aria-label="Large"
                       aria-describedby="inputGroup-sizing-sm">
            </div>
            <hr class="my-4">
            <div id="editor">
                <p>DBooker....</p>
            </div>

            <br/>

            <button type="button" class="btn btn-outline-success btn-block" onclick="onButtonClick()">发布 Booker</button>
        </div>
    </div>
    <div class="col-md-2"></div>
    <!-- 注意， 只需要引用 JS，无需引用任何 CSS ！！！-->
    <script type="text/javascript" src="../js/wangEditor.js"></script>
    <script type="text/javascript">
        var E = window.wangEditor
        var editor = new E('#editor')
        var Error = $("#NewBooker_Error");

        // 或者 var editor = new E( document.getElementById('editor') )
        $(document).ready(function () {
            editor.customConfig.showLinkImg = false
            editor.create()
        })

        //发布按钮确认发布
        function onButtonClick() {
            var Title = $("#BookerHeader").val();
            var BookerInfo = editor.txt.html();

            if (Title.length == 0) {
                alertShow(Error, "请输入Booker Header!");
                return;
            }

            $.get("/booker/createNewBooker",
                {
                    "bookerHeader": Title,
                    "bookerInfo": BookerInfo,
                    "userId": getUserIdInCookie()
                }, function (data) {
                    if(data.resInt == 1){
                        window.location = "index";
                    }else {
                        alertShow(Error,"BookerHeader重复！请更换标题名称！");
                    }
                }
                ,
                "json"
            );
        }
    </script>

</div>
<%@ include file="Footer.jsp" %>