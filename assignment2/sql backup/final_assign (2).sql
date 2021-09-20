CREATE DATABASE  IF NOT EXISTS `cb11studentsmarks` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `cb11studentsmarks`;
-- MySQL dump 10.13  Distrib 8.0.21, for macos10.15 (x86_64)
--
-- Host: 127.0.0.1    Database: cb11studentsmarks
-- ------------------------------------------------------
-- Server version	8.0.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `assignments`
--

DROP TABLE IF EXISTS `assignments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `assignments` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(45) NOT NULL,
  `oralgrade` decimal(4,0) DEFAULT NULL,
  `totalgrade` decimal(5,0) DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  `subdate` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assignments`
--

LOCK TABLES `assignments` WRITE;
/*!40000 ALTER TABLE `assignments` DISABLE KEYS */;
INSERT INTO `assignments` VALUES (1,'Ass1',20,80,'Programming','2020-09-08'),(2,'Ass2',40,60,'web development','2020-09-07'),(3,'Ass3',20,80,'Marketing','2020-09-06'),(4,'Java',10,90,'Java programming','2020-05-04'),(5,'Html',30,70,'web developement','2020-03-02'),(6,'C# 1',25,75,'Programming','2020-01-09'),(11,'k',90,90,'l','2019-08-14');
/*!40000 ALTER TABLE `assignments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `assignments_marks`
--

DROP TABLE IF EXISTS `assignments_marks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `assignments_marks` (
  `id` int NOT NULL,
  `oralmark` varchar(45) DEFAULT NULL,
  `totalmark` varchar(45) DEFAULT NULL,
  `eid` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `assignment_fk_idx` (`eid`),
  CONSTRAINT `assignment_eid_fk` FOREIGN KEY (`eid`) REFERENCES `enrollmentsprojects` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assignments_marks`
--

LOCK TABLES `assignments_marks` WRITE;
/*!40000 ALTER TABLE `assignments_marks` DISABLE KEYS */;
INSERT INTO `assignments_marks` VALUES (1,'20','100',1),(2,'20','100',2),(3,'20','100',3);
/*!40000 ALTER TABLE `assignments_marks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `courses`
--

DROP TABLE IF EXISTS `courses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `courses` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(45) NOT NULL,
  `description` varchar(45) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  `startdate` date DEFAULT NULL,
  `enddate` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `courses`
--

LOCK TABLES `courses` WRITE;
/*!40000 ALTER TABLE `courses` DISABLE KEYS */;
INSERT INTO `courses` VALUES (1,'CB11 PT Java','CB11 Part Time Java','Programming','2020-01-01','2020-12-08'),(2,'CB11 PT C#','CB11 Part Time C#','programming','2020-01-02','2020-12-09'),(3,'CB12 PT JS','CB12 Part Time JavaScript','Web development','2020-01-03','2020-11-01'),(4,'CB1HTML','HTML Part Time','Web development','2020-01-04','2020-09-08'),(5,'CB1CSS','CSS Part Time','web Design','2020-02-01','2020-10-07'),(7,'lo','kl','','1982-09-09','1982-09-09'),(8,'o','p','l','1967-07-09','1990-09-09');
/*!40000 ALTER TABLE `courses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `enrollments`
--

DROP TABLE IF EXISTS `enrollments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `enrollments` (
  `id` int NOT NULL,
  `sid` int DEFAULT NULL,
  `cid` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_enrollments_cid_courses_id_idx` (`cid`),
  KEY `fk_enrollments_sid_students_id_idx` (`sid`),
  CONSTRAINT `fk_enrollments_cid_courses_id` FOREIGN KEY (`cid`) REFERENCES `courses` (`id`),
  CONSTRAINT `fk_enrollments_sid_students_id` FOREIGN KEY (`sid`) REFERENCES `students` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `enrollments`
--

LOCK TABLES `enrollments` WRITE;
/*!40000 ALTER TABLE `enrollments` DISABLE KEYS */;
INSERT INTO `enrollments` VALUES (1,1,1),(2,2,2),(3,3,3),(4,4,4),(5,5,5),(6,1,2),(7,2,1),(8,1,5);
/*!40000 ALTER TABLE `enrollments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `enrollments_trainers`
--

DROP TABLE IF EXISTS `enrollments_trainers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `enrollments_trainers` (
  `id` int NOT NULL,
  `cid` int DEFAULT NULL,
  `Trainers_id` int NOT NULL,
  PRIMARY KEY (`id`,`Trainers_id`),
  KEY `fk_enrollments_cid_courses_id_idx` (`cid`),
  KEY `fk_enrollments_trainers_Trainers1_idx` (`Trainers_id`),
  CONSTRAINT `fk_enrollments_cid_courses_id0` FOREIGN KEY (`cid`) REFERENCES `courses` (`id`),
  CONSTRAINT `fk_enrollments_trainers_Trainers1` FOREIGN KEY (`Trainers_id`) REFERENCES `trainers` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `enrollments_trainers`
--

LOCK TABLES `enrollments_trainers` WRITE;
/*!40000 ALTER TABLE `enrollments_trainers` DISABLE KEYS */;
INSERT INTO `enrollments_trainers` VALUES (1,1,1),(5,1,2),(2,2,2),(3,3,3),(4,4,4);
/*!40000 ALTER TABLE `enrollments_trainers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `enrollmentsassignments`
--

DROP TABLE IF EXISTS `enrollmentsassignments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `enrollmentsassignments` (
  `id` int NOT NULL AUTO_INCREMENT,
  `eid` int DEFAULT NULL,
  `aid` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_enrollmentsassignments_eid_enrollments_id_idx` (`eid`),
  KEY `fk_enrollmentsassignments_aid_assignments_id_idx` (`aid`),
  CONSTRAINT `fk_enrollmentsassignments_aid_assignments_id` FOREIGN KEY (`aid`) REFERENCES `assignments` (`id`),
  CONSTRAINT `fk_enrollmentsassignments_eid_enrollments_id` FOREIGN KEY (`eid`) REFERENCES `enrollments` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `enrollmentsassignments`
--

LOCK TABLES `enrollmentsassignments` WRITE;
/*!40000 ALTER TABLE `enrollmentsassignments` DISABLE KEYS */;
INSERT INTO `enrollmentsassignments` VALUES (1,1,1),(2,2,2),(3,3,3),(4,4,4);
/*!40000 ALTER TABLE `enrollmentsassignments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `enrollmentsprojects`
--

DROP TABLE IF EXISTS `enrollmentsprojects`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `enrollmentsprojects` (
  `id` int NOT NULL AUTO_INCREMENT,
  `eid` int DEFAULT NULL,
  `pid` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_enrollmentsprojects_eid_enrollments_id_idx` (`eid`),
  KEY `fk_enrollmentsprojects_pid_projects_id_idx` (`pid`),
  CONSTRAINT `fk_enrollmentsprojects_eid_enrollments_id` FOREIGN KEY (`eid`) REFERENCES `enrollments` (`id`),
  CONSTRAINT `fk_enrollmentsprojects_pid_projects_id` FOREIGN KEY (`pid`) REFERENCES `projects` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `enrollmentsprojects`
--

LOCK TABLES `enrollmentsprojects` WRITE;
/*!40000 ALTER TABLE `enrollmentsprojects` DISABLE KEYS */;
INSERT INTO `enrollmentsprojects` VALUES (1,1,1),(2,1,2),(3,2,1),(4,2,2);
/*!40000 ALTER TABLE `enrollmentsprojects` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `projects`
--

DROP TABLE IF EXISTS `projects`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `projects` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(45) NOT NULL,
  `oralgrade` decimal(4,0) NOT NULL,
  `totalgrade` decimal(5,0) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `projects`
--

LOCK TABLES `projects` WRITE;
/*!40000 ALTER TABLE `projects` DISABLE KEYS */;
INSERT INTO `projects` VALUES (1,'Individual',20,80),(2,'Group',20,80),(3,'Company Based',0,100);
/*!40000 ALTER TABLE `projects` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `projects_marks`
--

DROP TABLE IF EXISTS `projects_marks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `projects_marks` (
  `id` int NOT NULL,
  `oralmark` varchar(45) DEFAULT NULL,
  `totalmark` varchar(45) DEFAULT NULL,
  `eid` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `project_fk_idx` (`eid`),
  CONSTRAINT `project_fk` FOREIGN KEY (`eid`) REFERENCES `enrollmentsprojects` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `projects_marks`
--

LOCK TABLES `projects_marks` WRITE;
/*!40000 ALTER TABLE `projects_marks` DISABLE KEYS */;
INSERT INTO `projects_marks` VALUES (1,'20','100',1),(2,'20','100',2),(3,'20','100',3);
/*!40000 ALTER TABLE `projects_marks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `students` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fname` varchar(45) NOT NULL,
  `lname` varchar(45) NOT NULL,
  `dateofbirth` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students`
--

LOCK TABLES `students` WRITE;
/*!40000 ALTER TABLE `students` DISABLE KEYS */;
INSERT INTO `students` VALUES (1,'GEORGE','PASPARAKIS','07-09-1990'),(2,'PANOS','BOZAS','01-09-1993'),(3,'GIORGOS','ANASTASIADHS','09-09-1999'),(4,'MARIA','RIGOPOULOY','01-07-1987'),(5,'NIKOS','KALOGEROPOULOS','16-04-1990'),(6,'KOSTANTINOS','GEWRGIOU','17-06-1994'),(7,'MARIA','EMANOUIL','17-04-1995'),(8,'ww','ww','1982-09-08'),(9,'kkl','llk','1982-08-07');
/*!40000 ALTER TABLE `students` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trainers`
--

DROP TABLE IF EXISTS `trainers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trainers` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fname` varchar(45) NOT NULL,
  `lname` varchar(45) NOT NULL,
  `subject` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trainers`
--

LOCK TABLES `trainers` WRITE;
/*!40000 ALTER TABLE `trainers` DISABLE KEYS */;
INSERT INTO `trainers` VALUES (1,'ILIAS','PANAGIOTOPOULOS','programming'),(2,'GIORGOS','MAVREAS','Web development'),(3,'ILIANA','PAPAGEWRGIOU','Programming'),(4,'IWANNIS','ANASTASIOU','Programming'),(5,'GIORGOS','MPOZIKAS','Programming'),(14,'j','s','a');
/*!40000 ALTER TABLE `trainers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'cb11studentsmarks'
--

--
-- Dumping routines for database 'cb11studentsmarks'
--
/*!50003 DROP PROCEDURE IF EXISTS `GETALLSTUDENTS` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `GETALLSTUDENTS`()
BEGIN
  SELECT* FROM cb11studentsmarks.students;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-09-18 21:06:15
