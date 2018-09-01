# DBooker
DBooker
## * 博客系统
## * 目录介绍
## * 应用技术

### 1. 博客系统介绍
	1:使用SSM框架整合版进行开发(Spring+SpringMVC+MyBatis)
### 2. 应用技术
    1: Spring + SpringMVC + MyBatis
    2: Intellij
    3: BootStrap
    4: JQuery
    5: Maven
### 3. 目录介绍
	    DBooker
        ┣━.git  ——Git文件夹
	    ┣━DBooker.iml   ——Intellij 文件
        ┣━out           ——输出文件
        ┃　┗━artifacts
        ┃　　　┗━DBooker_war_exploded
        ┃　　　　　┣━META-INF
        ┃　　　　　┃　┗━MANIFEST.MF
        ┃　　　　　┗━WEB-INF
        ┃　　　　　　　┣━classes
        ┃　　　　　　　┃　┣━dong
        ┃　　　　　　　┃　┃　┣━controller
        ┃　　　　　　　┃　┃　┣━dao
        ┃　　　　　　　┃　┃　┣━model
        ┃　　　　　　　┃　┃　┗━service
        ┃　　　　　　　┃　┃　　　┣━Impl
        ┃　　　　　　　┃　┃　　　┗━Interface
        ┃　　　　　　　┃　┣━mapper
        ┃　　　　　　　┃　┗━StaticUtil
        ┃　　　　　　　┣━html
        ┃　　　　　　　┣━jsp
        ┃　　　　　　　┗━lib
        ┣━pom.xml   ——Maven配置文件
        ┣━Project Dric  ——项目描述性文件
        ┃　┣━HTML Design
        ┃　┃　┣━About.html
        ┃　┃　┣━BookerInfo.html
        ┃　┃　┣━Header.txt
        ┃　┃　┣━index.html
        ┃　┃　┣━js
        ┃　┃　┃　┣━default.js
        ┃　┃　┃　┣━jquery.js
        ┃　┃　┃　┗━jquery_cookie.js
        ┃　┃　┣━jsp.html
        ┃　┃　┣━Login.html
        ┃　┃　┣━personInfo.html
        ┃　┃　┣━Register.html
        ┃　┃　┣━titleBar.html
        ┃　┃　┣━UserInfo.html
        ┃　┃　┣━模板.html
        ┃　┃　┣━首页条目信息.txt
        ┃　┃　┗━首页框架.txt
        ┃　┣━InterfaceList
        ┃　┃　┗━InterfaceList.txt
        ┃　┗━SQL Files   ——MySql文件
        ┃　　　┣━Database table Format.txt
        ┃　　　┗━mysql-databases-dump.sql
        ┣━README.md     ——MD文件
        ┣━src           ——项目主目录
        ┃　┣━main        ——主文件夹
        ┃　┃　┣━java
        ┃　┃　┃　┣━dong
        ┃　┃　┃　┃　┣━controller    ——SpringMVC Controller
        ┃　┃　┃　┃　┃　┣━BookerController.java
        ┃　┃　┃　┃　┃　┣━CareController.java
        ┃　┃　┃　┃　┃　┣━defaultController.java
        ┃　┃　┃　┃　┃　┣━FollowController.java
        ┃　┃　┃　┃　┃　┣━SpeakController.java
        ┃　┃　┃　┃　┃　┗━UserController.java
        ┃　┃　┃　┃　┣━dao           ——Dao 接口
        ┃　┃　┃　┃　┃　┣━BookersMapper.java
        ┃　┃　┃　┃　┃　┣━BookerTypeMapper.java
        ┃　┃　┃　┃　┃　┣━CareMapper.java
        ┃　┃　┃　┃　┃　┣━ConnectionMapper.java
        ┃　┃　┃　┃　┃　┣━FollowMapper.java
        ┃　┃　┃　┃　┃　┣━SpeakBookerMapper.java
        ┃　┃　┃　┃　┃　┣━TypeMapper.java
        ┃　┃　┃　┃　┃　┗━UserMapper.java
        ┃　┃　┃　┃　┣━model         ——模型
        ┃　┃　┃　┃　┃　┣━Bookers.java
        ┃　┃　┃　┃　┃　┣━BookerType.java
        ┃　┃　┃　┃　┃　┣━Care.java
        ┃　┃　┃　┃　┃　┣━Connection.java
        ┃　┃　┃　┃　┃　┣━DefaultClass.java
        ┃　┃　┃　┃　┃　┣━Follow.java
        ┃　┃　┃　┃　┃　┣━SpeakBooker.java
        ┃　┃　┃　┃　┃　┣━Type.java
        ┃　┃　┃　┃　┃　┗━User.java
        ┃　┃　┃　┃　┗━service       ——服务
        ┃　┃　┃　┃　　　┣━Impl       ——服务接口实现类
        ┃　┃　┃　┃　　　┃　┣━BookerServiceImpl.java
        ┃　┃　┃　┃　　　┃　┣━CareServiceImpl.java
        ┃　┃　┃　┃　　　┃　┣━FollowServiceImpl.java
        ┃　┃　┃　┃　　　┃　┣━SpeakServiceImpl.java
        ┃　┃　┃　┃　　　┃　┗━UserServiceImpl.java
        ┃　┃　┃　┃　　　┗━Interface   ——服务接口
        ┃　┃　┃　┃　　　　　┣━BookerService.java
        ┃　┃　┃　┃　　　　　┣━CareService.java
        ┃　┃　┃　┃　　　　　┣━FollowService.java
        ┃　┃　┃　┃　　　　　┣━SpeakService.java
        ┃　┃　┃　┃　　　　　┗━UserServiceI.java
        ┃　┃　┃　┗━StaticUtil  ——静态程序
        ┃　┃　┃　　　┣━CodeCounter.java
        ┃　┃　┃　　　┗━ProjectTree.java
        ┃　┃　┣━resources         ——资源配置文件夹
        ┃　┃　┃　┣━applicationContext.xml
        ┃　┃　┃　┣━generatorConfig.xml
        ┃　┃　┃　┣━mapper          ——MySql - MyBatis 映射文件
        ┃　┃　┃　┃　┣━BookersMapper.xml
        ┃　┃　┃　┃　┣━BookerTypeMapper.xml
        ┃　┃　┃　┃　┣━CareMapper.xml
        ┃　┃　┃　┃　┣━ConnectionMapper.xml
        ┃　┃　┃　┃　┣━FollowMapper.xml
        ┃　┃　┃　┃　┣━SpeakBookerMapper.xml
        ┃　┃　┃　┃　┣━TypeMapper.xml
        ┃　┃　┃　┃　┗━UserMapper.xml
        ┃　┃　┃　┗━springmvc-servlet.xml
        ┃　┃　┗━webapp        ——Web目录
        ┃　┃　　　┗━WEB-INF
        ┃　┃　　　　　┣━css
        ┃　┃　　　　　┃　┣━bootstrap-4.0.0-dist
        ┃　┃　　　　　┃　┃　┣━css
        ┃　┃　　　　　┃　┃　┃　┣━bootstrap-grid.css
        ┃　┃　　　　　┃　┃　┃　┣━bootstrap-grid.css.map
        ┃　┃　　　　　┃　┃　┃　┣━bootstrap-grid.min.css
        ┃　┃　　　　　┃　┃　┃　┣━bootstrap-grid.min.css.map
        ┃　┃　　　　　┃　┃　┃　┣━bootstrap-reboot.css
        ┃　┃　　　　　┃　┃　┃　┣━bootstrap-reboot.css.map
        ┃　┃　　　　　┃　┃　┃　┣━bootstrap-reboot.min.css
        ┃　┃　　　　　┃　┃　┃　┣━bootstrap-reboot.min.css.map
        ┃　┃　　　　　┃　┃　┃　┣━bootstrap.css
        ┃　┃　　　　　┃　┃　┃　┣━bootstrap.css.map
        ┃　┃　　　　　┃　┃　┃　┣━bootstrap.min.css
        ┃　┃　　　　　┃　┃　┃　┗━bootstrap.min.css.map
        ┃　┃　　　　　┃　┃　┗━js
        ┃　┃　　　　　┃　┃　　　┣━bootstrap.bundle.js
        ┃　┃　　　　　┃　┃　　　┣━bootstrap.bundle.js.map
        ┃　┃　　　　　┃　┃　　　┣━bootstrap.bundle.min.js
        ┃　┃　　　　　┃　┃　　　┣━bootstrap.bundle.min.js.map
        ┃　┃　　　　　┃　┃　　　┣━bootstrap.js
        ┃　┃　　　　　┃　┃　　　┣━bootstrap.js.map
        ┃　┃　　　　　┃　┃　　　┣━bootstrap.min.js
        ┃　┃　　　　　┃　┃　　　┗━bootstrap.min.js.map
        ┃　┃　　　　　┃　┗━default.css
        ┃　┃　　　　　┣━fonts
        ┃　┃　　　　　┣━img
        ┃　┃　　　　　┣━js
        ┃　┃　　　　　┃　┣━default.js
        ┃　┃　　　　　┃　┣━jquery.cookie.js
        ┃　┃　　　　　┃　┣━jquery.js
        ┃　┃　　　　　┃　┗━wangEditor.js
        ┃　┃　　　　　┣━jsp
        ┃　┃　　　　　┃　┣━About.jsp
        ┃　┃　　　　　┃　┣━BookerInfo.jsp
        ┃　┃　　　　　┃　┣━Footer.jsp
        ┃　┃　　　　　┃　┣━Header.jsp
        ┃　┃　　　　　┃　┣━index.jsp
        ┃　┃　　　　　┃　┣━Login.jsp
        ┃　┃　　　　　┃　┣━NewBooker.jsp
        ┃　┃　　　　　┃　┣━PersonInfor.jsp
        ┃　┃　　　　　┃　┣━Register.jsp
        ┃　┃　　　　　┃　┣━Title.jsp
        ┃　┃　　　　　┃　┣━UserCare.jsp
        ┃　┃　　　　　┃　┣━UserFollow.jsp
        ┃　┃　　　　　┃　┗━UserInfor.jsp
        ┃　┃　　　　　┗━web.xml
        ┃　┗━test        ——测试文件夹 主要测试MyBatis
        ┃　　　┣━java
        ┃　　　┃　┗━TestService
        ┃　　　┃　　　┣━TestBookerService.java
        ┃　　　┃　　　┣━TestCareService.java
        ┃　　　┃　　　┣━TestFollowService.java
        ┃　　　┃　　　┣━TestSpeak.java
        ┃　　　┃　　　┗━TestSpringMyBatis.java
        ┃　　　┗━resources
        ┗━target
        　　┣━classes
        　　┃　┣━applicationContext.xml
        　　┃　┣━dong
        　　┃　┃　┣━controller
        　　┃　┃　┃　┣━BookerController.class
        　　┃　┃　┃　┣━CareController.class
        　　┃　┃　┃　┣━defaultController.class
        　　┃　┃　┃　┣━FollowController.class
        　　┃　┃　┃　┣━SpeakController.class
        　　┃　┃　┃　┗━UserController.class
        　　┃　┃　┣━dao
        　　┃　┃　┃　┣━BookersMapper.class
        　　┃　┃　┃　┣━BookerTypeMapper.class
        　　┃　┃　┃　┣━CareMapper.class
        　　┃　┃　┃　┣━ConnectionMapper.class
        　　┃　┃　┃　┣━FollowMapper.class
        　　┃　┃　┃　┣━SpeakBookerMapper.class
        　　┃　┃　┃　┣━TypeMapper.class
        　　┃　┃　┃　┗━UserMapper.class
        　　┃　┃　┣━model
        　　┃　┃　┃　┣━Bookers.class
        　　┃　┃　┃　┣━BookerType.class
        　　┃　┃　┃　┣━Care.class
        　　┃　┃　┃　┣━Connection.class
        　　┃　┃　┃　┣━DefaultClass.class
        　　┃　┃　┃　┣━Follow.class
        　　┃　┃　┃　┣━SpeakBooker.class
        　　┃　┃　┃　┣━Type.class
        　　┃　┃　┃　┗━User.class
        　　┃　┃　┗━service
        　　┃　┃　　　┣━Impl
        　　┃　┃　　　┃　┣━BookerServiceImpl.class
        　　┃　┃　　　┃　┣━CareServiceImpl.class
        　　┃　┃　　　┃　┣━FollowServiceImpl.class
        　　┃　┃　　　┃　┣━SpeakServiceImpl.class
        　　┃　┃　　　┃　┗━UserServiceImpl.class
        　　┃　┃　　　┗━Interface
        　　┃　┃　　　　　┣━BookerService.class
        　　┃　┃　　　　　┣━CareService.class
        　　┃　┃　　　　　┣━FollowService.class
        　　┃　┃　　　　　┣━SpeakService.class
        　　┃　┃　　　　　┗━UserServiceI.class
        　　┃　┣━generatorConfig.xml
        　　┃　┣━mapper
        　　┃　┃　┣━BookersMapper.xml
        　　┃　┃　┣━BookerTypeMapper.xml
        　　┃　┃　┣━CareMapper.xml
        　　┃　┃　┣━ConnectionMapper.xml
        　　┃　┃　┣━FollowMapper.xml
        　　┃　┃　┣━SpeakBookerMapper.xml
        　　┃　┃　┣━TypeMapper.xml
        　　┃　┃　┗━UserMapper.xml
        　　┃　┣━springmvc-servlet.xml
        　　┃　┗━StaticUtil
        　　┃　　　┣━CodeCounter.class
        　　┃　　　┣━CounterRes.class
        　　┃　　　┣━ProjectTree.class
        　　┃　　　┗━TreeNode.class
        　　┣━DBooker
        　　┃　┣━META-INF
        　　┃　┃　┗━MANIFEST.MF
        　　┃　┗━WEB-INF
        　　┃　　　┣━classes
        　　┃　　　┃　┣━applicationContext.xml
        　　┃　　　┃　┣━dong
        　　┃　　　┃　┃　┣━controller
        　　┃　　　┃　┃　┃　┣━BookerController.class
        　　┃　　　┃　┃　┃　┣━CareController.class
        　　┃　　　┃　┃　┃　┣━defaultController.class
        　　┃　　　┃　┃　┃　┣━FollowController.class
        　　┃　　　┃　┃　┃　┣━SpeakController.class
        　　┃　　　┃　┃　┃　┗━UserController.class
        　　┃　　　┃　┃　┣━dao
        　　┃　　　┃　┃　┃　┣━BookersMapper.class
        　　┃　　　┃　┃　┃　┣━BookerTypeMapper.class
        　　┃　　　┃　┃　┃　┣━CareMapper.class
        　　┃　　　┃　┃　┃　┣━ConnectionMapper.class
        　　┃　　　┃　┃　┃　┣━FollowMapper.class
        　　┃　　　┃　┃　┃　┣━SpeakBookerMapper.class
        　　┃　　　┃　┃　┃　┣━TypeMapper.class
        　　┃　　　┃　┃　┃　┗━UserMapper.class
        　　┃　　　┃　┃　┣━model
        　　┃　　　┃　┃　┃　┣━Bookers.class
        　　┃　　　┃　┃　┃　┣━BookerType.class
        　　┃　　　┃　┃　┃　┣━Care.class
        　　┃　　　┃　┃　┃　┣━Connection.class
        　　┃　　　┃　┃　┃　┣━DefaultClass.class
        　　┃　　　┃　┃　┃　┣━Follow.class
        　　┃　　　┃　┃　┃　┣━SpeakBooker.class
        　　┃　　　┃　┃　┃　┣━Type.class
        　　┃　　　┃　┃　┃　┗━User.class
        　　┃　　　┃　┃　┗━service
        　　┃　　　┃　┃　　　┣━Impl
        　　┃　　　┃　┃　　　┃　┣━BookerServiceImpl.class
        　　┃　　　┃　┃　　　┃　┣━CareServiceImpl.class
        　　┃　　　┃　┃　　　┃　┣━FollowServiceImpl.class
        　　┃　　　┃　┃　　　┃　┣━SpeakServiceImpl.class
        　　┃　　　┃　┃　　　┃　┗━UserServiceImpl.class
        　　┃　　　┃　┃　　　┗━Interface
        　　┃　　　┃　┃　　　　　┣━BookerService.class
        　　┃　　　┃　┃　　　　　┣━CareService.class
        　　┃　　　┃　┃　　　　　┣━FollowService.class
        　　┃　　　┃　┃　　　　　┣━SpeakService.class
        　　┃　　　┃　┃　　　　　┗━UserServiceI.class
        　　┃　　　┃　┣━generatorConfig.xml
        　　┃　　　┃　┣━mapper
        　　┃　　　┃　┃　┣━BookersMapper.xml
        　　┃　　　┃　┃　┣━BookerTypeMapper.xml
        　　┃　　　┃　┃　┣━CareMapper.xml
        　　┃　　　┃　┃　┣━ConnectionMapper.xml
        　　┃　　　┃　┃　┣━FollowMapper.xml
        　　┃　　　┃　┃　┣━SpeakBookerMapper.xml
        　　┃　　　┃　┃　┣━TypeMapper.xml
        　　┃　　　┃　┃　┗━UserMapper.xml
        　　┃　　　┃　┣━springmvc-servlet.xml
        　　┃　　　┃　┗━StaticUtil
        　　┃　　　┃　　　┣━CodeCounter.class
        　　┃　　　┃　　　┣━CounterRes.class
        　　┃　　　┃　　　┣━ProjectTree.class
        　　┃　　　┃　　　┗━TreeNode.class
        　　┃　　　┣━css
        　　┃　　　┃　┣━bootstrap
        　　┃　　　┃　┃　┣━css
        　　┃　　　┃　┃　┗━js
        　　┃　　　┃　┣━bootstrap-4.0.0-dist
        　　┃　　　┃　┃　┣━css
        　　┃　　　┃　┃　┃　┣━bootstrap-grid.css
        　　┃　　　┃　┃　┃　┣━bootstrap-grid.css.map
        　　┃　　　┃　┃　┃　┣━bootstrap-grid.min.css
        　　┃　　　┃　┃　┃　┣━bootstrap-grid.min.css.map
        　　┃　　　┃　┃　┃　┣━bootstrap-reboot.css
        　　┃　　　┃　┃　┃　┣━bootstrap-reboot.css.map
        　　┃　　　┃　┃　┃　┣━bootstrap-reboot.min.css
        　　┃　　　┃　┃　┃　┣━bootstrap-reboot.min.css.map
        　　┃　　　┃　┃　┃　┣━bootstrap.css
        　　┃　　　┃　┃　┃　┣━bootstrap.css.map
        　　┃　　　┃　┃　┃　┣━bootstrap.min.css
        　　┃　　　┃　┃　┃　┗━bootstrap.min.css.map
        　　┃　　　┃　┃　┗━js
        　　┃　　　┃　┃　　　┣━bootstrap.bundle.js
        　　┃　　　┃　┃　　　┣━bootstrap.bundle.js.map
        　　┃　　　┃　┃　　　┣━bootstrap.bundle.min.js
        　　┃　　　┃　┃　　　┣━bootstrap.bundle.min.js.map
        　　┃　　　┃　┃　　　┣━bootstrap.js
        　　┃　　　┃　┃　　　┣━bootstrap.js.map
        　　┃　　　┃　┃　　　┣━bootstrap.min.js
        　　┃　　　┃　┃　　　┗━bootstrap.min.js.map
        　　┃　　　┃　┗━default.css
        　　┃　　　┣━html
        　　┃　　　┣━js
        　　┃　　　┃　┣━default.js
        　　┃　　　┃　┣━jquery.cookie.js
        　　┃　　　┃　┣━jquery.js
        　　┃　　　┃　┣━kindeditor
        　　┃　　　┃　┃　┣━lang
        　　┃　　　┃　┃　┣━plugins
        　　┃　　　┃　┃　┃　┣━anchor
        　　┃　　　┃　┃　┃　┣━autoheight
        　　┃　　　┃　┃　┃　┣━baidumap
        　　┃　　　┃　┃　┃　┣━clearhtml
        　　┃　　　┃　┃　┃　┣━code
        　　┃　　　┃　┃　┃　┣━emoticons
        　　┃　　　┃　┃　┃　┃　┗━images
        　　┃　　　┃　┃　┃　┣━filemanager
        　　┃　　　┃　┃　┃　┃　┗━images
        　　┃　　　┃　┃　┃　┣━fixtoolbar
        　　┃　　　┃　┃　┃　┣━flash
        　　┃　　　┃　┃　┃　┣━image
        　　┃　　　┃　┃　┃　┃　┗━images
        　　┃　　　┃　┃　┃　┣━insertfile
        　　┃　　　┃　┃　┃　┣━lineheight
        　　┃　　　┃　┃　┃　┣━link
        　　┃　　　┃　┃　┃　┣━map
        　　┃　　　┃　┃　┃　┣━media
        　　┃　　　┃　┃　┃　┣━multiimage
        　　┃　　　┃　┃　┃　┃　┗━images
        　　┃　　　┃　┃　┃　┣━pagebreak
        　　┃　　　┃　┃　┃　┣━plainpaste
        　　┃　　　┃　┃　┃　┣━preview
        　　┃　　　┃　┃　┃　┣━quickformat
        　　┃　　　┃　┃　┃　┣━table
        　　┃　　　┃　┃　┃　┣━template
        　　┃　　　┃　┃　┃　┃　┗━html
        　　┃　　　┃　┃　┃　┗━wordpaste
        　　┃　　　┃　┃　┗━themes
        　　┃　　　┃　┃　　　┣━common
        　　┃　　　┃　┃　　　┣━default
        　　┃　　　┃　┃　　　┣━qq
        　　┃　　　┃　┃　　　┗━simple
        　　┃　　　┃　┗━wangEditor.js
        　　┃　　　┣━jsp
        　　┃　　　┃　┣━About.jsp
        　　┃　　　┃　┣━BookerInfo.jsp
        　　┃　　　┃　┣━Footer.jsp
        　　┃　　　┃　┣━Header.jsp
        　　┃　　　┃　┣━index.jsp
        　　┃　　　┃　┣━Login.jsp
        　　┃　　　┃　┣━NewBooker.jsp
        　　┃　　　┃　┣━PersonInfor.jsp
        　　┃　　　┃　┣━Register.jsp
        　　┃　　　┃　┣━Title.jsp
        　　┃　　　┃　┣━UserCare.jsp
        　　┃　　　┃　┣━UserFollow.jsp
        　　┃　　　┃　┗━UserInfor.jsp
        　　┃　　　┣━lib
        　　┃　　　┃　┣━aopalliance-1.0.jar
        　　┃　　　┃　┣━asm-3.3.1.jar
        　　┃　　　┃　┣━aspectjweaver-1.8.7.jar
        　　┃　　　┃　┣━c3p0-0.9.1.2.jar
        　　┃　　　┃　┣━cglib-2.2.2.jar
        　　┃　　　┃　┣━commons-logging-1.2.jar
        　　┃　　　┃　┣━jackson-annotations-2.9.5.jar
        　　┃　　　┃　┣━jackson-core-2.9.5.jar
        　　┃　　　┃　┣━jackson-databind-2.9.5.jar
        　　┃　　　┃　┣━javassist-3.17.1-GA.jar
        　　┃　　　┃　┣━jstl-1.2.jar
        　　┃　　　┃　┣━mybatis-3.2.2.jar
        　　┃　　　┃　┣━mybatis-spring-1.3.0.jar
        　　┃　　　┃　┣━mysql-connector-java-8.0.11.jar
        　　┃　　　┃　┣━protobuf-java-2.6.0.jar
        　　┃　　　┃　┣━spring-aop-4.2.3.RELEASE.jar
        　　┃　　　┃　┣━spring-aspects-4.2.3.RELEASE.jar
        　　┃　　　┃　┣━spring-beans-4.2.3.RELEASE.jar
        　　┃　　　┃　┣━spring-context-4.2.3.RELEASE.jar
        　　┃　　　┃　┣━spring-context-support-4.2.3.RELEASE.jar
        　　┃　　　┃　┣━spring-core-4.2.3.RELEASE.jar
        　　┃　　　┃　┣━spring-expression-4.2.3.RELEASE.jar
        　　┃　　　┃　┣━spring-jdbc-4.2.3.RELEASE.jar
        　　┃　　　┃　┣━spring-test-4.2.3.RELEASE.jar
        　　┃　　　┃　┣━spring-tx-4.2.3.RELEASE.jar
        　　┃　　　┃　┣━spring-web-4.2.3.RELEASE.jar
        　　┃　　　┃　┣━spring-webmvc-4.2.3.RELEASE.jar
        　　┃　　　┃　┗━standard-1.1.2.jar
        　　┃　　　┗━web.xml
        　　┣━DBooker.war
        　　┣━generated-sources
        　　┃　┗━annotations
        　　┣━generated-test-sources
        　　┃　┗━test-annotations
        　　┗━test-classes
        　　　　┗━TestService
        　　　　　　┣━TestBookerService.class
        　　　　　　┣━TestCareService.class
        　　　　　　┣━TestFollowService.class
        　　　　　　┣━TestSpeak.class
        　　　　　　┗━TestSpringMyBatis.class
	
