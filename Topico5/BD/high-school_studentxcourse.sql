CREATE DATABASE  IF NOT EXISTS `high-school` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `high-school`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: localhost    Database: high-school
-- ------------------------------------------------------
-- Server version	5.6.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `studentxcourse`
--

DROP TABLE IF EXISTS `studentxcourse`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `studentxcourse` (
  `student` int(11) NOT NULL,
  `course_name` varchar(45) NOT NULL,
  PRIMARY KEY (`student`,`course_name`),
  KEY `fk_course_idx` (`course_name`),
  CONSTRAINT `fk_student` FOREIGN KEY (`student`) REFERENCES `student` (`reg_number`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_course` FOREIGN KEY (`course_name`) REFERENCES `course` (`name`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentxcourse`
--

LOCK TABLES `studentxcourse` WRITE;
/*!40000 ALTER TABLE `studentxcourse` DISABLE KEYS */;
INSERT INTO `studentxcourse` VALUES (11,'How to peel an orange'),(12,'How to peel an orange'),(13,'How to peel an orange'),(14,'How to peel an orange'),(15,'How to peel an orange'),(16,'How to peel an orange'),(17,'How to peel an orange'),(18,'How to peel an orange'),(19,'How to peel an orange'),(20,'How to peel an orange'),(21,'How to peel an orange'),(22,'How to peel an orange'),(23,'How to peel an orange'),(24,'How to peel an orange'),(25,'How to peel an orange'),(26,'How to peel an orange'),(27,'How to peel an orange'),(28,'How to peel an orange'),(29,'How to peel an orange'),(30,'How to peel an orange'),(1,'Intro to Java'),(2,'Intro to Java'),(3,'Intro to Java'),(4,'Intro to Java'),(5,'Intro to Java'),(6,'Intro to Java'),(7,'Intro to Java'),(8,'Intro to Java'),(9,'Intro to Java'),(10,'Intro to Java'),(21,'Intro to Java'),(22,'Intro to Java'),(23,'Intro to Java'),(24,'Intro to Java'),(25,'Intro to Java'),(26,'Intro to Java'),(27,'Intro to Java'),(28,'Intro to Java'),(29,'Intro to Java'),(30,'Intro to Java'),(1,'Investments'),(2,'Investments'),(3,'Investments'),(4,'Investments'),(6,'Investments'),(7,'Investments'),(8,'Investments'),(9,'Investments'),(10,'Investments'),(11,'Investments'),(12,'Investments'),(13,'Investments'),(14,'Investments'),(15,'Investments'),(16,'Investments'),(17,'Investments'),(18,'Investments'),(19,'Investments'),(20,'Investments'),(1,'Snow plowing for beginners'),(2,'Snow plowing for beginners'),(3,'Snow plowing for beginners'),(4,'Snow plowing for beginners'),(5,'Snow plowing for beginners'),(6,'Snow plowing for beginners'),(7,'Snow plowing for beginners'),(8,'Snow plowing for beginners'),(9,'Snow plowing for beginners'),(10,'Snow plowing for beginners'),(21,'Snow plowing for beginners'),(22,'Snow plowing for beginners'),(23,'Snow plowing for beginners'),(24,'Snow plowing for beginners'),(25,'Snow plowing for beginners'),(26,'Snow plowing for beginners'),(27,'Snow plowing for beginners'),(28,'Snow plowing for beginners'),(29,'Snow plowing for beginners'),(30,'Snow plowing for beginners'),(1,'SQL 101'),(2,'SQL 101'),(3,'SQL 101'),(4,'SQL 101'),(5,'SQL 101'),(6,'SQL 101'),(7,'SQL 101'),(8,'SQL 101'),(9,'SQL 101'),(10,'SQL 101'),(11,'SQL 101'),(12,'SQL 101'),(13,'SQL 101'),(14,'SQL 101'),(15,'SQL 101'),(16,'SQL 101'),(17,'SQL 101'),(18,'SQL 101'),(19,'SQL 101'),(20,'SQL 101');
/*!40000 ALTER TABLE `studentxcourse` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-02-11  1:06:09
