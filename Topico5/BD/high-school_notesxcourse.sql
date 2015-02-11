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
-- Table structure for table `notesxcourse`
--

DROP TABLE IF EXISTS `notesxcourse`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `notesxcourse` (
  `student` int(11) NOT NULL,
  `course_name` varchar(45) NOT NULL,
  `note1` int(11) DEFAULT NULL,
  `note2` int(11) DEFAULT NULL,
  `note3` int(11) DEFAULT NULL,
  `final` int(11) DEFAULT NULL,
  PRIMARY KEY (`student`,`course_name`),
  KEY `fk_notes_course_idx` (`course_name`),
  CONSTRAINT `fk_notes_student` FOREIGN KEY (`student`) REFERENCES `student` (`reg_number`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_notes_course` FOREIGN KEY (`course_name`) REFERENCES `course` (`name`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notesxcourse`
--

LOCK TABLES `notesxcourse` WRITE;
/*!40000 ALTER TABLE `notesxcourse` DISABLE KEYS */;
INSERT INTO `notesxcourse` VALUES (1,'Intro to Java',10,9,7,8),(1,'Investments',7,9,7,10),(1,'Snow plowing for beginners',10,9,7,8),(1,'SQL 101',7,9,7,10),(2,'Intro to Java',8,6,7,9),(2,'Investments',8,6,7,9),(2,'Snow plowing for beginners',8,6,7,9),(2,'SQL 101',8,6,7,9),(3,'Intro to Java',10,10,8,8),(3,'Investments',7,9,10,10),(3,'Snow plowing for beginners',10,10,8,8),(3,'SQL 101',7,9,10,10),(4,'Intro to Java',8,6,7,9),(4,'Investments',10,9,7,8),(4,'Snow plowing for beginners',8,6,7,9),(4,'SQL 101',10,9,7,8),(5,'Intro to Java',10,9,7,8),(5,'Investments',7,8,10,10),(5,'Snow plowing for beginners',10,9,7,8),(5,'SQL 101',7,8,10,10),(6,'Intro to Java',8,6,7,9),(6,'Investments',10,10,8,8),(6,'Snow plowing for beginners',8,6,7,9),(6,'SQL 101',10,10,8,8),(7,'Intro to Java',8,6,7,9),(7,'Investments',8,6,7,9),(7,'Snow plowing for beginners',8,6,7,9),(7,'SQL 101',8,6,7,9),(8,'Intro to Java',8,6,7,9),(8,'Investments',10,10,8,8),(8,'Snow plowing for beginners',8,6,7,9),(8,'SQL 101',10,10,8,8),(9,'Intro to Java',8,6,7,9),(9,'Investments',10,9,7,8),(9,'Snow plowing for beginners',8,6,7,9),(9,'SQL 101',10,9,7,8),(10,'Intro to Java',10,10,8,8),(10,'Investments',8,6,7,9),(10,'Snow plowing for beginners',10,10,8,8),(10,'SQL 101',8,6,7,9),(11,'How to peel an orange',10,9,7,8),(11,'Investments',10,9,7,8),(11,'SQL 101',10,9,7,8),(12,'How to peel an orange',8,6,7,9),(12,'Investments',8,6,7,9),(12,'SQL 101',8,6,7,9),(13,'How to peel an orange',10,10,8,8),(13,'Investments',10,10,8,8),(13,'SQL 101',10,10,8,8),(14,'How to peel an orange',8,6,7,9),(14,'Investments',8,6,7,9),(14,'SQL 101',8,6,7,9),(15,'How to peel an orange',10,9,7,8),(15,'Investments',10,9,7,8),(15,'SQL 101',10,9,7,8),(16,'How to peel an orange',8,6,7,9),(16,'Investments',8,6,7,9),(16,'SQL 101',8,6,7,9),(17,'How to peel an orange',8,6,7,9),(17,'Investments',8,6,7,9),(17,'SQL 101',8,6,7,9),(18,'How to peel an orange',8,6,7,9),(18,'Investments',8,6,7,9),(18,'SQL 101',8,6,7,9),(19,'How to peel an orange',8,6,7,9),(19,'Investments',8,6,7,9),(19,'SQL 101',8,6,7,9),(20,'How to peel an orange',10,10,8,8),(20,'Investments',10,10,8,8),(20,'SQL 101',10,10,8,8),(21,'How to peel an orange',7,9,7,10),(21,'Intro to Java',7,9,7,10),(21,'Snow plowing for beginners',7,9,7,10),(22,'How to peel an orange',8,6,7,9),(22,'Intro to Java',8,6,7,9),(22,'Snow plowing for beginners',8,6,7,9),(23,'How to peel an orange',7,9,10,10),(23,'Intro to Java',7,9,10,10),(23,'Snow plowing for beginners',7,9,10,10),(24,'How to peel an orange',10,9,7,8),(24,'Intro to Java',10,9,7,8),(24,'Snow plowing for beginners',10,9,7,8),(25,'How to peel an orange',7,8,10,10),(25,'Intro to Java',7,8,10,10),(25,'Snow plowing for beginners',7,8,10,10),(26,'How to peel an orange',10,10,8,8),(26,'Intro to Java',10,10,8,8),(26,'Snow plowing for beginners',10,10,8,8),(27,'How to peel an orange',8,6,7,9),(27,'Intro to Java',8,6,7,9),(27,'Snow plowing for beginners',8,6,7,9),(28,'How to peel an orange',10,10,8,8),(28,'Intro to Java',10,10,8,8),(28,'Snow plowing for beginners',10,10,8,8),(29,'How to peel an orange',10,9,7,8),(29,'Intro to Java',10,9,7,8),(29,'Snow plowing for beginners',10,9,7,8),(30,'How to peel an orange',8,6,7,9),(30,'Intro to Java',8,6,7,9),(30,'Snow plowing for beginners',8,6,7,9);
/*!40000 ALTER TABLE `notesxcourse` ENABLE KEYS */;
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
