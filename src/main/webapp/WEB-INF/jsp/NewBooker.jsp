<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="Title.jsp" %>

<div class="row">
    <div class="col-md-3"></div>
    <div class="col-md-6">
        <div id="editor">
            <p>欢迎使用 <b>wangEditor</b> 富文本编辑器</p>
        </div>
        <button id="btn1">获取html</button>
        <button id="btn2">获取text</button>
    </div>
    <div class="col-md-3"></div>
    <!-- 注意， 只需要引用 JS，无需引用任何 CSS ！！！-->
    <script type="text/javascript" src="../js/wangEditor.js"></script>
    <script type="text/javascript">
        var E = window.wangEditor
        var editor = new E('#editor')
        // 或者 var editor = new E( document.getElementById('editor') )
        editor.customConfig.showLinkImg = false
        editor.create()

        document.getElementById('btn1').addEventListener('click', function () {
            // 读取 html
            alert(editor.txt.html())
        }, false)

        document.getElementById('btn2').addEventListener('click', function () {
            // 读取 text
            alert(editor.txt.text())
        }, false)
    </script>

</div>
<%@ include file="Footer.jsp" %>