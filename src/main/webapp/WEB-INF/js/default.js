// 添加提示，需要父级DIV和警告信息
function alertShow(errorDiv, info) {
    errorDiv.append("<div class=\"alert alert-danger\" role=\"alert\"> " + info + " <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button></div>")
}

//判断用户是否登陆
/**
 如果用户登陆，则userId不为空
 如果用户没有登陆，则userId为空
 */
function checkIsLogin() {
    return $.cookie('userId') != null;
}
//获取登陆用户ID
function getUserIdInCookie() {
    return $.cookie('userId');
}
//跳转到BookerInfo 页面
function turnToBookerInfo(BookerHeader) {
    $.cookie("BookerHeader", BookerHeader);
    window.location = "bookerInfo";
}