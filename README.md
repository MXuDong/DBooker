# DBooker
DBooker
## * 博客系统
## * 目录介绍
## * 应用技术

### 1. 博客系统介绍
	1:使用SSM框架整合版进行开发(Spring+SpringMVC+MyBatis)
### 2. 目录介绍
		DBooker
        ┣━.git
        ┃　┣━COMMIT_EDITMSG
        ┃　┣━config
        ┃　┣━description
        ┃　┣━HEAD
        ┃　┣━hooks
        ┃　┃　┣━applypatch-msg.sample
        ┃　┃　┣━commit-msg.sample
        ┃　┃　┣━fsmonitor-watchman.sample
        ┃　┃　┣━post-update.sample
        ┃　┃　┣━pre-applypatch.sample
        ┃　┃　┣━pre-commit.sample
        ┃　┃　┣━pre-push.sample
        ┃　┃　┣━pre-rebase.sample
        ┃　┃　┣━pre-receive.sample
        ┃　┃　┣━prepare-commit-msg.sample
        ┃　┃　┗━update.sample
        ┃　┣━index
        ┃　┣━info
        ┃　┃　┗━exclude
        ┃　┣━logs
        ┃　┃　┣━HEAD
        ┃　┃　┗━refs
        ┃　┃　　　┣━heads
        ┃　┃　　　┃　┗━master
        ┃　┃　　　┗━remotes
        ┃　┃　　　　　┗━origin
        ┃　┃　　　　　　　┣━HEAD
        ┃　┃　　　　　　　┗━master
        ┃　┣━objects
        ┃　┃　┣━0f
        ┃　┃　┃　┗━224b622f46599003cc91100ad5d2ae51cc580f
        ┃　┃　┣━32
        ┃　┃　┃　┗━b799c7428c750c503373cfc7142668839f24ad
        ┃　┃　┣━74
        ┃　┃　┃　┗━840cda64f763099e9a9dd7ab531582a4f8de32
        ┃　┃　┣━f0
        ┃　┃　┃　┗━048464f15da63ba6d24aeaa3d80f9b4ba6d42c
        ┃　┃　┣━info
        ┃　┃　┗━pack
        ┃　┃　　　┣━pack-50a111a4e6be2a5310b9218a7ed0904efb597491.idx
        ┃　┃　　　┗━pack-50a111a4e6be2a5310b9218a7ed0904efb597491.pack
        ┃　┣━packed-refs
        ┃　┗━refs
        ┃　　　┣━heads
        ┃　　　┃　┗━master
        ┃　　　┣━remotes
        ┃　　　┃　┗━origin
        ┃　　　┃　　　┣━HEAD
        ┃　　　┃　　　┗━master
        ┃　　　┗━tags
        ┣━.gitignore
        ┣━.idea
        ┃　┣━compiler.xml
        ┃　┣━encodings.xml
        ┃　┣━misc.xml
        ┃　┣━vcs.xml
        ┃　┗━workspace.xml
        ┣━pom.xml
        ┣━Project Dric
        ┃　┣━HTML Design
        ┃　┃　┣━Header.txt
        ┃　┃　┣━首页条目信息.txt
        ┃　┃　┗━首页框架.txt
        ┃　┗━SQL Files
        ┃　　　┣━Database table Format.txt
        ┃　　　┗━mysql-databases-dump.sql
        ┣━README.md
        ┣━src
        ┃　┣━main
        ┃　┃　┣━java
        ┃　┃　┃　┣━dong
        ┃　┃　┃　┃　┣━controller
        ┃　┃　┃　┃　┃　┗━IndexController.java
        ┃　┃　┃　┃　┣━dao
        ┃　┃　┃　┃　┃　┣━BookersMapper.java
        ┃　┃　┃　┃　┃　┣━BookerTypeMapper.java
        ┃　┃　┃　┃　┃　┣━CareMapper.java
        ┃　┃　┃　┃　┃　┣━ConnectionMapper.java
        ┃　┃　┃　┃　┃　┣━FollowMapper.java
        ┃　┃　┃　┃　┃　┣━SpeakBookerMapper.java
        ┃　┃　┃　┃　┃　┣━TypeMapper.java
        ┃　┃　┃　┃　┃　┗━UserMapper.java
        ┃　┃　┃　┃　┣━model
        ┃　┃　┃　┃　┃　┣━Bookers.java
        ┃　┃　┃　┃　┃　┣━BookerType.java
        ┃　┃　┃　┃　┃　┣━Care.java
        ┃　┃　┃　┃　┃　┣━Connection.java
        ┃　┃　┃　┃　┃　┣━Follow.java
        ┃　┃　┃　┃　┃　┣━SpeakBooker.java
        ┃　┃　┃　┃　┃　┣━Type.java
        ┃　┃　┃　┃　┃　┗━User.java
        ┃　┃　┃　┃　┗━service
        ┃　┃　┃　┃　　　┣━Impl
        ┃　┃　┃　┃　　　┃　┣━BookerServiceImpl.java
        ┃　┃　┃　┃　　　┃　┣━CareServiceImpl.java
        ┃　┃　┃　┃　　　┃　┣━FollowServiceImpl.java
        ┃　┃　┃　┃　　　┃　┣━SpeakServiceImpl.java
        ┃　┃　┃　┃　　　┃　┗━UserServiceImpl.java
        ┃　┃　┃　┃　　　┗━Interface
        ┃　┃　┃　┃　　　　　┣━BookerService.java
        ┃　┃　┃　┃　　　　　┣━CareService.java
        ┃　┃　┃　┃　　　　　┣━FollowService.java
        ┃　┃　┃　┃　　　　　┣━SpeakService.java
        ┃　┃　┃　┃　　　　　┗━UserServiceI.java
        ┃　┃　┃　┗━StaticUtil
        ┃　┃　┃　　　┣━CodeCounter.java
        ┃　┃　┃　　　┗━ProjectTree.java
        ┃　┃　┣━resources
        ┃　┃　┃　┣━applicationContext.xml
        ┃　┃　┃　┣━generatorConfig.xml
        ┃　┃　┃　┣━mapper
        ┃　┃　┃　┃　┣━BookersMapper.xml
        ┃　┃　┃　┃　┣━BookerTypeMapper.xml
        ┃　┃　┃　┃　┣━CareMapper.xml
        ┃　┃　┃　┃　┣━ConnectionMapper.xml
        ┃　┃　┃　┃　┣━FollowMapper.xml
        ┃　┃　┃　┃　┣━SpeakBookerMapper.xml
        ┃　┃　┃　┃　┣━TypeMapper.xml
        ┃　┃　┃　┃　┗━UserMapper.xml
        ┃　┃　┃　┗━springmvc-servlet.xml
        ┃　┃　┗━webapp
        ┃　┃　　　┗━WEB-INF
        ┃　┃　　　　　┣━html
        ┃　┃　　　　　┃　┗━index.html
        ┃　┃　　　　　┣━jsp
        ┃　┃　　　　　┃　┗━index.jsp
        ┃　┃　　　　　┗━web.xml
        ┃　┗━test
        ┃　　　┗━java
        ┃　　　　　┗━TestService
        ┃　　　　　　　┣━TestBookerService.java
        ┃　　　　　　　┣━TestCareService.java
        ┃　　　　　　　┣━TestFollowService.java
        ┃　　　　　　　┣━TestSpeak.java
        ┃　　　　　　　┗━TestSpringMyBatis.java
        ┗━target
        　　┣━classes
        　　┃　┣━applicationContext.xml
        　　┃　┣━dong
        　　┃　┃　┣━controller
        　　┃　┃　┃　┗━IndexController.class
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
        　　┃　　　┃　┃　┃　┗━IndexController.class
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
        　　┃　　　┣━html
        　　┃　　　┃　┗━index.html
        　　┃　　　┣━jsp
        　　┃　　　┃　┗━index.jsp
        　　┃　　　┣━lib
        　　┃　　　┃　┣━aopalliance-1.0.jar
        　　┃　　　┃　┣━asm-3.3.1.jar
        　　┃　　　┃　┣━aspectjweaver-1.8.7.jar
        　　┃　　　┃　┣━c3p0-0.9.1.2.jar
        　　┃　　　┃　┣━cglib-2.2.2.jar
        　　┃　　　┃　┣━commons-logging-1.2.jar
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
