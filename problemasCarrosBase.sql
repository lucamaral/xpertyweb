-- MySQL dump 10.13  Distrib 5.5.46, for Win64 (x86)
--
-- Host: localhost    Database: xperty
-- ------------------------------------------------------
-- Server version	5.5.46

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
-- Table structure for table `attribute`
--

DROP TABLE IF EXISTS `attribute`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `attribute` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(255) DEFAULT NULL,
  `VALUE_TYPE` int(11) DEFAULT NULL,
  `IS_GOAL` tinyint(1) DEFAULT '0',
  `QUESTION` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attribute`
--

LOCK TABLES `attribute` WRITE;
/*!40000 ALTER TABLE `attribute` DISABLE KEYS */;
INSERT INTO `attribute` VALUES (15,'carburador tem gasolina',1,0,'carburador tem gasolina?'),(16,'diagnostico',2,1,''),(17,'farois ligam',1,0,'farois ligam?'),(18,'motor liga',1,0,'motor liga?'),(19,'tanque vazio',1,0,'tanque vazio?');
/*!40000 ALTER TABLE `attribute` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `play_evolutions`
--

DROP TABLE IF EXISTS `play_evolutions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `play_evolutions` (
  `id` int(11) NOT NULL,
  `hash` varchar(255) NOT NULL,
  `applied_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `apply_script` text,
  `revert_script` text,
  `state` varchar(255) DEFAULT NULL,
  `last_problem` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `play_evolutions`
--

LOCK TABLES `play_evolutions` WRITE;
/*!40000 ALTER TABLE `play_evolutions` DISABLE KEYS */;
INSERT INTO `play_evolutions` VALUES (1,'a9074d0eeb3c6e855a6728af553a82946a737b32','2015-11-29 23:11:43','create table attribute (\nID                        bigint auto_increment not null,\nNAME                      varchar(255),\nVALUE_TYPE                integer,\nIS_GOAL                   tinyint(1) default 0,\nQUESTION                  varchar(255),\nconstraint ck_attribute_VALUE_TYPE check (VALUE_TYPE in (0,1,2)),\nconstraint pk_attribute primary key (ID))\n;\n\ncreate table rule (\nID                        bigint auto_increment not null,\nNAME                      varchar(255),\nEXPRESSION                varchar(255),\nconstraint pk_rule primary key (ID))\n;','SET FOREIGN_KEY_CHECKS=0;\n\ndrop table attribute;\n\ndrop table rule;\n\nSET FOREIGN_KEY_CHECKS=1;','applied','');
/*!40000 ALTER TABLE `play_evolutions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rule`
--

DROP TABLE IF EXISTS `rule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rule` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(255) DEFAULT NULL,
  `EXPRESSION` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rule`
--

LOCK TABLES `rule` WRITE;
/*!40000 ALTER TABLE `rule` DISABLE KEYS */;
INSERT INTO `rule` VALUES (6,'Regra 1','IF\n\'tanque vazio\' = true\nTHEN\n\'diagnostico\' = \'Carro sem combustivel\'\nFI'),(7,'Regra 2','IF\n\'tanque vazio\' = false and \n\'carburador tem gasolina\' = false\nTHEN\n\'diagnostico\' = \'magueira bloqueada\'\nFI'),(8,'Regra 3','IF\n\'tanque vazio\' = false and\n\'motor liga\' = false and\n\'farois ligam\' = false\nTHEN\n\'diagnostico\' = \'Bateria ou cabos\'\nFI'),(9,'Regra 4','IF\n\'tanque vazio\' = false and\n\'motor liga\' = false and\n\'farois ligam\' = true\nTHEN\n\'diagnostico\' = \'Ignicao\'\nFI'),(10,'Regra 5','IF\n\'tanque vazio\' = false and\n\'motor liga\' = true and\n\'farois ligam\' = false\nTHEN\n\'diagnostico\' = \'vela de ignição\'\nFI');
/*!40000 ALTER TABLE `rule` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-12-01  8:46:01
