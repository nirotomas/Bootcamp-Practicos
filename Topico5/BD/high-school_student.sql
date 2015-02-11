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
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `reg_number` int(11) NOT NULL,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `date_of_birth` date DEFAULT NULL,
  PRIMARY KEY (`reg_number`),
  KEY `indiceStudent` (`reg_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (1,'Holmes','Michael','0000-00-00'),(2,'Whitney','Guerra','0000-00-00'),(3,'Sasha','Gonzalez','0000-00-00'),(4,'Bradley','Flores','0000-00-00'),(5,'Raymond','Holcomb','0000-00-00'),(6,'Amy','Burgess','0000-00-00'),(7,'Montana','Hickman','0000-00-00'),(8,'Nell','Burch','0000-00-00'),(9,'Dennis','Barnett','0000-00-00'),(10,'Owen','Abbott','0000-00-00'),(11,'Alvin','Velasquez','0000-00-00'),(12,'Demetrius','Aguirre','0000-00-00'),(13,'Jerry','Hays','0000-00-00'),(14,'Helen','Hanson','0000-00-00'),(15,'Ila','Sampson','0000-00-00'),(16,'Armand','Yang','0000-00-00'),(17,'Ronan','Terry','0000-00-00'),(18,'Aidan','Flowers','0000-00-00'),(19,'Damon','Odom','0000-00-00'),(20,'Cadman','Harding','0000-00-00'),(21,'Kevin','Knox','0000-00-00'),(22,'Nolan','Clemons','0000-00-00'),(23,'Macon','Medina','0000-00-00'),(24,'Kylynn','Herman','0000-00-00'),(25,'Yolanda','Calderon','0000-00-00'),(26,'Cecilia','Hopper','0000-00-00'),(27,'Elizabeth','Weaver','0000-00-00'),(28,'Lana','Wood','0000-00-00'),(29,'Ryan','Armstrong','0000-00-00'),(30,'September','Velazquez','0000-00-00'),(50,'Tomas','Niro',NULL);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-02-11  1:06:10
