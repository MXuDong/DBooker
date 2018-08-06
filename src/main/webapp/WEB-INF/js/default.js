// 添加提示
        function alertShow(errorDiv,info) {
            errorDiv.append("<div class=\"alert alert-danger\" role=\"alert\"> " + info + " <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button></div>")
        }