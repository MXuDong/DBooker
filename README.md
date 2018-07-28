# DBooker
DBooker
## * 博客系统
## * 目录介绍
## * 应用技术

### 1. 博客系统介绍
	1:使用SSM框架整合版进行开发(Spring+SpringMVC+MyBatis)
### 2. 目录介绍
		DBooker	
		┣━Project Dric
		┃ ┣━SQL Fukes
		┃ ┃ ┣━Database table Format.txt
		┃ ┃ ┗━mysql-databases-dump.sql
		┃ ┗━HTML Design
		┣━Src
		┃ ┣━main
		┃ ┃ ┣━java
		┃ ┃ ┃ ┣━StaticUtil
		┃ ┃ ┃ ┃ ┗━CodeCounter.java
		┃ ┃ ┃ ┗━dong
		┃ ┃ ┃   ┣━controller
		┃ ┃ ┃   ┃ ┗━IndexController.java
		┃ ┃ ┃   ┣━dao
		┃ ┃ ┃   ┃ ┣━BookerTypeMapper.java
		┃ ┃ ┃   ┃ ┣━BookersMapper.java
		┃ ┃ ┃   ┃ ┣━CareMapper.java
		┃ ┃ ┃   ┃ ┣━ConnectionMapper.java
		┃ ┃ ┃   ┃ ┣━FollowMapper.java
		┃ ┃ ┃   ┃ ┣━SpeakBookerMapper.java
		┃ ┃ ┃   ┃ ┣━TypeMapper.java
		┃ ┃ ┃   ┃ ┗━UserMapper.java
		┃ ┃ ┃   ┣━model
		┃ ┃ ┃   ┃ ┣━BookerType.java
		┃ ┃ ┃   ┃ ┣━Bookers.java
		┃ ┃ ┃   ┃ ┣━Care.java
		┃ ┃ ┃   ┃ ┣━Connecion.java
		┃ ┃ ┃   ┃ ┣━Follow.java
		┃ ┃ ┃   ┃ ┣━SpeakBooker.java
		┃ ┃ ┃   ┃ ┣━Type.java
		┃ ┃ ┃   ┃ ┗━User.java
		┃ ┃ ┃   ┗━service
		┃ ┃ ┃     ┣━Impl
		┃ ┃ ┃     ┃ ┣━BookerServiceImpl.java
		┃ ┃ ┃     ┃ ┣━CareServiceImpl.java
		┃ ┃ ┃     ┃ ┣━FollowServiceImpl.java
		┃ ┃ ┃     ┃ ┣━SpeakServiceImpl.java
		┃ ┃ ┃     ┃ ┗━UserServiceImpl.java
		┃ ┃ ┃     ┗━Interface
		┃ ┃ ┃       ┣━BookerService.java
		┃ ┃ ┃       ┣━CareService.java
		┃ ┃ ┃       ┣━FollowService.java
		┃ ┃ ┃       ┣━SpeakService.java
		┃ ┃ ┃       ┗━UserServiceI.java
		┃ ┃ ┣━resources
		┃ ┃ ┃ ┣━mapper
		┃ ┃ ┃ ┃ ┣━BookerTypeMapper.xml
		┃ ┃ ┃ ┃ ┣━BookerMapper.xml
		┃ ┃ ┃ ┃ ┣━CareMapper.xml
		┃ ┃ ┃ ┃ ┣━ConnectionMapper.xml
		┃ ┃ ┃ ┃ ┣━FollowMapper.xml
		┃ ┃ ┃ ┃ ┣━SpeakBookerMapper.xml
		┃ ┃ ┃ ┃ ┣━TypeMapper.xml
		┃ ┃ ┃ ┃ ┗━UserMapper.xml
		┃ ┃ ┃ ┣━applicationContext.xml
		┃ ┃ ┃ ┣━generatorConfig.xml
		┃ ┃ ┃ ┗━springmvc-servlet.xml
		┃ ┃ ┗━webapp
		┃ ┗━test
		┃   ┗━java
		┃     ┗━TestService
		┃       ┣━TestBookerService.java
		┃       ┣━TestCareService.java
		┃       ┣━TestFollowService.java
		┃       ┣━TestSpeak.java
		┃       ┗━TestSpringMyBatis.java
		┃
		┣━Target
		┃ ┗━生成性文件
		┣.gitignore
		┣README.md
		┗pom.xml
	
