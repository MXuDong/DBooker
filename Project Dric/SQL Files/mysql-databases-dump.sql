-- MySQL dump 10.13  Distrib 8.0.11, for Win64 (x86_64)
--
-- Host: localhost    Database: t_dbooker
-- ------------------------------------------------------
-- Server version 8.0.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8mb4 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `t_booker_type`
--

DROP TABLE IF EXISTS `t_booker_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `t_booker_type` (
  `type_id` int(11) NOT NULL,
  `booker_id` int(11) NOT NULL,
  KEY `booker_id` (`booker_id`),
  KEY `type_id` (`type_id`),
  CONSTRAINT `t_booker_type_ibfk_1` FOREIGN KEY (`booker_id`) REFERENCES `t_bookers` (`booker_id`),
  CONSTRAINT `t_booker_type_ibfk_2` FOREIGN KEY (`type_id`) REFERENCES `t_type` (`type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_booker_type`
--

LOCK TABLES `t_booker_type` WRITE;
/*!40000 ALTER TABLE `t_booker_type` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_booker_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_bookers`
--

DROP TABLE IF EXISTS `t_bookers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `t_bookers` (
  `booker_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `booker_head` varchar(30) NOT NULL,
  `booker_info` text,
  PRIMARY KEY (`booker_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `t_bookers_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_bookers`
--

LOCK TABLES `t_bookers` WRITE;
/*!40000 ALTER TABLE `t_bookers` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_bookers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_care`
--

DROP TABLE IF EXISTS `t_care`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `t_care` (
  `care_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `booker_id` int(11) NOT NULL,
  `care_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`care_id`),
  KEY `user_id` (`user_id`),
  KEY `booker_id` (`booker_id`),
  CONSTRAINT `t_care_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`user_id`),
  CONSTRAINT `t_care_ibfk_2` FOREIGN KEY (`booker_id`) REFERENCES `t_bookers` (`booker_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_care`
--

LOCK TABLES `t_care` WRITE;
/*!40000 ALTER TABLE `t_care` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_care` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_connection`
--

DROP TABLE IF EXISTS `t_connection`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `t_connection` (
  `user_id` int(11) NOT NULL,
  `phone_number` char(11) DEFAULT NULL,
  `QQ_number` char(15) DEFAULT NULL,
  `Email` char(20) DEFAULT NULL,
  KEY `user_id` (`user_id`),
  CONSTRAINT `t_connection_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_connection`
--

LOCK TABLES `t_connection` WRITE;
/*!40000 ALTER TABLE `t_connection` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_connection` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_follow`
--

DROP TABLE IF EXISTS `t_follow`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `t_follow` (
  `follow_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `be_follow_user_id` int(11) NOT NULL,
  PRIMARY KEY (`follow_id`),
  KEY `user_id` (`user_id`),
  KEY `be_follow_user_id` (`be_follow_user_id`),
  CONSTRAINT `t_follow_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`user_id`),
  CONSTRAINT `t_follow_ibfk_2` FOREIGN KEY (`be_follow_user_id`) REFERENCES `t_user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_follow`
--

LOCK TABLES `t_follow` WRITE;
/*!40000 ALTER TABLE `t_follow` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_follow` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_speak_booker`
--

DROP TABLE IF EXISTS `t_speak_booker`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `t_speak_booker` (
  `speak_id` int(11) NOT NULL AUTO_INCREMENT,
  `booker_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `speak_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `speak_info` varchar(100) NOT NULL,
  PRIMARY KEY (`speak_id`),
  KEY `user_id` (`user_id`),
  KEY `booker_id` (`booker_id`),
  CONSTRAINT `t_speak_booker_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`user_id`),
  CONSTRAINT `t_speak_booker_ibfk_2` FOREIGN KEY (`booker_id`) REFERENCES `t_bookers` (`booker_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_speak_booker`
--

LOCK TABLES `t_speak_booker` WRITE;
/*!40000 ALTER TABLE `t_speak_booker` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_speak_booker` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_type`
--

DROP TABLE IF EXISTS `t_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `t_type` (
  `type_id` int(11) NOT NULL AUTO_INCREMENT,
  `type_info` char(20) NOT NULL,
  PRIMARY KEY (`type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_type`
--

LOCK TABLES `t_type` WRITE;
/*!40000 ALTER TABLE `t_type` DISABLE KEYS */;
INSERT INTO `t_type` VALUES (1,'Java后台'),(2,'JavaSE'),(4,'JavaME'),(7,'JavaEE'),(8,'大数据');
/*!40000 ALTER TABLE `t_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_user`
--

DROP TABLE IF EXISTS `t_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `t_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` char(20) NOT NULL,
  `user_password` char(20) NOT NULL,
  `user_sex` char(2) DEFAULT '男',
  `user_true_name` char(10) DEFAULT NULL,
  `user_sign` char(40) DEFAULT NULL,
  `user_disc` char(200) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `user_name` (`user_name`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_user`
--

LOCK TABLES `t_user` WRITE;
/*!40000 ALTER TABLE `t_user` DISABLE KEYS */;
INSERT INTO `t_user` VALUES (2,'mxd','233333','M','孟旭东','this is my sign','asdfkljasf;ls');
/*!40000 ALTER TABLE `t_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-07-10 20:06:07