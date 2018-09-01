<%--
  Created by IntelliJ IDEA.
  User: Dong
  Date: 2018/8/9
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="Title.jsp" %>
<div class="jumbotron">
    <h1 class="display-4">DBooker</h1>
    <p class="lead">The DBooker About We</p>
    <hr class="my-4">
    <p>Version:2.0</p>
    <p>Author :Dong</p>
</div>


<div class="row">
    <div class="col-3">
        <div class="list-group" id="list-tab" role="tablist">
            <a class="list-group-item list-group-item-action active" id="list-GS-list" data-toggle="list"
               href="#list-GS" role="tab" aria-controls="GS">概述</a>
            <a class="list-group-item list-group-item-action" id="list-KFGJ-list" data-toggle="list" href="#list-KFGJ"
               role="tab" aria-controls="KFGJ">开发工具</a>
            <a class="list-group-item list-group-item-action" id="list-KFHJ-list" data-toggle="list" href="#list-KFHJ"
               role="tab" aria-controls="KFHJ">开发环境</a>
            <a class="list-group-item list-group-item-action" id="list-KFJS-list" data-toggle="list" href="#list-KFJS"
               role="tab" aria-controls="KFJS">开发技术</a>
            <a class="list-group-item list-group-item-action" id="list-GYZZ-list" data-toggle="list" href="#list-GYZZ"
               role="tab" aria-controls="GYZZ">关于作者</a>

        </div>
    </div>
    <div class="col-9">
        <div class="tab-content" id="nav-tabContent">
            <div class="tab-pane fade show active" id="list-GS" role="tabpanel" aria-labelledby="list-GS-list">
                <h4>概述</h4>
                <div class="row">
                    <div class="col-md-1"></div>
                    <div class="col-md-10">
                        <h5>说明</h5>
                        <p>DBooker 是一个Booker系统，是一个交流讨论信息的平台，请给位DBers自觉遵守相关规定，避免给您的使用来带不便，谢谢合作。</p>
                        <hr/>
                        <br/>

                        <h5>版本信息介绍</h5>
                        <table class="table table-bordered">
                            <tbody>
                            <tr>
                                <th scope="row">1</th>
                                <td>产品版本</td>
                                <td>2.0</td>
                            </tr>
                            <tr>
                                <th scope="row">2</th>
                                <td>作者</td>
                                <td>Dong</td>
                            </tr>
                            <tr>
                                <th scope="row">3</th>
                                <td>产品名称</td>
                                <td>DBooker</td>
                            </tr>
                            <tr>
                                <th scope="row">4</th>
                                <td>产品开始时间</td>
                                <td>2018.07.01</td>
                            </tr>
                            </tbody>
                        </table>
                        <hr>
                        <br/>

                        <h5>版权声明</h5>
                        <p>本产品已经上交至Github仓库，仓库地址：<a href="https://github.com/MXuDong/DBooker">https://github.com/MXuDong/DBooker</a>
                        </p>
                    </div>
                    <div class="col-md-1"></div>
                </div>
            </div>
            <div class="tab-pane fade" id="list-KFGJ" role="tabpanel" aria-labelledby="list-profile-list">
                <h4>开发工具</h4>
                <div class="row">
                    <div class="col-md-1"></div>
                    <div class="col-md-10">
                        <table class="table table-bordered">
                            <thead>
                            <tr>
                                <th scope="col">#</th>
                                <th scope="col">工具名</th>
                                <th scope="col">工具用途</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <th scope="row">1</th>
                                <td>Intellij</td>
                                <td>编写Java、JSP代码， 对工程进行构建</td>
                            </tr>
                            <tr>
                                <th scope="row">2</th>
                                <td>Sublime</td>
                                <td>编写HTML、JS，设计数据库表等</td>
                            </tr>
                            <tr>
                                <th scope="row">3</th>
                                <td>Android Studio</td>
                                <td>开发Android端应用</td>
                            </tr>
                            <tr>
                                <th scope="row">4</th>
                                <td>Chrome</td>
                                <td>检测开发结果的正确性，检查产品BUG等</td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                    <div class="col-md-1"></div>
                </div>
            </div>
            <div class="tab-pane fade" id="list-KFHJ" role="tabpanel" aria-labelledby="list-messages-list">
                <h4>开发环境</h4>
                <div class="row">
                    <div class="col-md-1"></div>
                    <div class="col-md-10">
                        <h5>本产品的基本环境</h5>
                        <p>
                            开发于Windows操作系统，后台基于JavaEE开发，需要Java环境支持、MySql数据库环境支持，详细版本信息见下表
                        </p>
                        <hr/>
                        <br/>

                        <h5>详细环境表</h5>
                        <table class="table table-bordered">
                            <thead>
                            <tr>
                                <th scope="col">#</th>
                                <th scope="col">环境名称</th>
                                <th scope="col">版本号</th>
                                <th scope="col">作用</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <th scope="row">1</th>
                                <td>JDK</td>
                                <td>10.0.1</td>
                                <td>编译Java代码</td>
                            </tr>
                            <tr>
                                <th scope="row">2</th>
                                <td>JRE</td>
                                <td>10.0.1</td>
                                <td>产品运行环境</td>
                            </tr>
                            <tr>
                                <th scope="row">3</th>
                                <td>Tomcat</td>
                                <td>9.0.8</td>
                                <td>产品部署环境</td>
                            </tr>
                            <tr>
                                <th scope="row">4</th>
                                <td>Maven</td>
                                <td>3.5.2</td>
                                <td>包管理工具</td>
                            </tr>
                            <tr>
                                <th scope="row">5</th>
                                <td>MySql</td>
                                <td>8.0.11</td>
                                <td>数据库</td>
                            </tr>
                            <tr>
                                <th scope="row">6</th>
                                <td>BootStrap</td>
                                <td>V.4</td>
                                <td>前端框架</td>
                            </tr>
                            <tr>
                                <th scope="row">7</th>
                                <td>JQuery</td>
                                <td>3.3.1</td>
                                <td>JS library</td>
                            </tr>
                            ！缺少Android信息！
                            </tbody>
                        </table>
                    </div>
                    <div class="col-md-1"></div>
                </div>
            </div>
            <div class="tab-pane fade" id="list-KFJS" role="tabpanel" aria-labelledby="list-settings-list">
                <h4>开发技术</h4>
                <div class="row">
                    <div class="col-md-1"></div>
                    <div class="col-md-10">
                        <h5>本产品主要基于SSM(Spring + SpringMVC + MyBatis)框架整合发开</h5>
                        <h5>富文本编辑器使用 wangEditor, JS 插件</h5>
                    </div>
                    <div class="col-md-1"></div>
                </div>
            </div>
            <div class="tab-pane fade" id="list-GYZZ" role="tabpanel" aria-labelledby="list-settings-list">
                <h4>关于作者</h4>
                <div class="row">
                    <div class="col-md-1"></div>
                    <div class="col-md-10">
                        <h4>作者：Dong</h4>
                        <ul>
                            <li>姓名：孟旭东</li>
                            <li>学号：16180601013</li>
                            <li>就读学校：大连东软信息学院软件工程系</li>
                            <li>Github：<a href="https://github.com/MXuDong">https://github.com/MXuDong</a></li>
                            <li>邮箱：2941884109@qq.com</li>
                        </ul>
                    </div>
                    <div class="col-md-1"></div>
                </div>
            </div>
        </div>
    </div>
</div>
<%@ include file="Footer.jsp" %>
