--
-- Création de la base de données :  `LorannProject`
--
Drop database if exists `LorannProject`;

CREATE DATABASE `LorannProject` ;

USE `LorannProject` ;

DELIMITER $$

--
-- Procédures lancement de niveau
--


CREATE DEFINER=`root`@`localhost` PROCEDURE `Selectlvl1` (IN `p_id` INT)  READS SQL DATA
    SQL SECURITY INVOKER
SELECT * FROM LorannProject.level1 where id is not null order by id

CREATE DEFINER=`root`@`localhost` PROCEDURE `Selectlvl2` (IN `p_id` int)  READS SQL DATA
    SQL SECURITY INVOKER
SELECT * FROM LorannProject.level2 where id is not null order by id

CREATE DEFINER=`root`@`localhost` PROCEDURE `Selectlvl3` (IN `p_id` INT)  READS SQL DATA
    SQL SECURITY INVOKER
SELECT * FROM LorannProject.level3 where id is not null order by id

CREATE DEFINER=`root`@`localhost` PROCEDURE `Selectlvl4` (IN `p_id` int)  READS SQL DATA
    SQL SECURITY INVOKER
SELECT * FROM LorannProject.level4 where id is not null order by id

CREATE DEFINER=`root`@`localhost` PROCEDURE `Selectlvl5` (IN `p_id` int)  READS SQL DATA
    SQL SECURITY INVOKER
SELECT * FROM LorannProject.level5 where id is not null order by id

DELIMITER ;


--
-- Création des tables "level"
--

CREATE TABLE `level1` (
  `id` int,
  `x` int(2) NOT NULL,
  `y` int(2) NOT NULL,
  `symbol` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `level2` (
  `id` int,
  `x` int(2) NOT NULL,
  `y` int(2) NOT NULL,
  `symbol` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `level3` (
  `id` int,
  `x` int(2) NOT NULL,
  `y` int(2) NOT NULL,
  `symbol` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `level4` (
  `id` int,
  `x` int(2) NOT NULL,
  `y` int(2) NOT NULL,
  `symbol` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `level5` (
  `id` int,
  `x` int(2) NOT NULL,
  `y` int(2) NOT NULL,
  `symbol` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


--
-- Contenu de la table `level1`
--

INSERT INTO `level1` (`x`, `y`,`symbol`) VALUES

(1,7,"#"),
(1,8,"-"),
(1,9,"#"),
(1,10,"-"),
(1,11,"-"),
(1,12,"#"),
(1,13,"-"),
(1,14,"-"),
(1,15,"-"),
(1,16,"-"),
(1,17,"-"),
(1,18,"-"),
(1,19,"#"),

(2,4,"#"),
(2,5,"-"),
(2,6,"-"),
(2,7,"#"),
(2,8,"x"),
(2,9,"+"),
(2,19,"#"),
(2,20,"#"),

(3,4,"+"),
(3,9,"+"),
(3,20,"+"),

(4,1,"#"),
(4,2,"-"),
(4,3,"-"),
(4,4,"#"),
(4,9,"+"),
(4,13,"x"),
(4,20,"+"),

(5,1,"+"),
(5,3,"x"),
(5,5,"#"),
(5,6,"-"),
(5,7,"-"),
(5,8,"-"),
(5,9,"#"),
(5,10,"-"),
(5,11,"-"),
(5,12,"-"),
(5,13,"-"),
(5,14,"-"),
(5,15,"#"),
(5,20,"#"),

(6,1,"+"),
(6,2,"x"),
(6,13,"x"),
(6,20,"/"),

(7,1,"+"),
(7,3,"x"),
(7,5,"#"),
(7,6,"-"),
(7,7,"-"),
(7,8,"-"),
(7,9,"#"),
(7,10,"-"),
(7,11,"-"),
(7,12,"-"),
(7,13,"-"),
(7,14,"-"),
(7,15,"#"),
(7,20,"#"),

(8,1,"#"),
(8,2,"-"),
(8,3,"-"),
(8,4,"#"),
(8,9,"+"),
(8,13,"x"),
(8,20,"+"),

(9,4,"+"),
(9,9,"+"),
(9,20,"+"),

(10,4,"#"),
(10,5,"-"),
(10,6,"-"),
(10,7,"#"),
(10,8,"x"),
(10,9,"+"),
(10,19,"#"),
(10,20,"#"),

(11,7,"#"),
(11,8,"-"),
(11,9,"#"),
(11,10,"-"),
(11,11,"-"),
(11,12,"#"),
(11,13,"-"),
(11,14,"-"),
(11,15,"-"),
(11,16,"-"),
(11,17,"-"),
(11,18,"-"),
(11,19,"#");


INSERT INTO `level2` (`x`, `y`, `symbol`) VALUES 

(7,1,"+"),
(5,2,"x"),
(5,3,"x"),
(5,4,"x"),
(5,5,"#"),
(5,6,"-"),
(5,7,"-"),
(5,8,"-"),
(5,9,"#"),
(5,10,"-"),
(5,11,"-"),
(5,12,"-"),
(5,13,"-"),
(5,14,"-"),
(5,15,"#"),
(5,16,"-"),
(5,17,"-"),
(5,18,"-"),
(5,19,"#"),
(5,20,"#")

;

INSERT INTO `level3` (`x`, `y`, `symbol`) VALUES 

(7,1,"+"),
(5,2,"x"),
(5,3,"x"),
(5,4,"x"),
(5,5,"#"),
(5,6,"-"),
(5,7,"-"),
(5,8,"-"),
(5,9,"#"),
(5,10,"-"),
(5,11,"-"),
(5,12,"-"),
(5,13,"-"),
(5,14,"-"),
(5,15,"#"),
(5,16,"-"),
(5,17,"-"),
(5,18,"-"),
(5,19,"#"),
(5,20,"#")

;

INSERT INTO `level4` (`x`, `y`, `symbol`) VALUES 

(7,1,"+"),
(5,2,"x"),
(5,3,"x"),
(5,4,"x"),
(5,5,"#"),
(5,6,"-"),
(5,7,"-"),
(5,8,"-"),
(5,9,"#"),
(5,10,"-"),
(5,11,"-"),
(5,12,"-"),
(5,13,"-"),
(5,14,"-"),
(5,15,"#"),
(5,16,"-"),
(5,17,"-"),
(5,18,"-"),
(5,19,"#"),
(5,20,"#")

;

INSERT INTO `level5` (`x`, `y`, `symbol`) VALUES 

(7,1,"+"),
(5,2,"x"),
(5,3,"x"),
(5,4,"x"),
(5,5,"#"),
(5,6,"-"),
(5,7,"-"),
(5,8,"-"),
(5,9,"#"),
(5,10,"-"),
(5,11,"-"),
(5,12,"-"),
(5,13,"-"),
(5,14,"-"),
(5,15,"#"),
(5,16,"-"),
(5,17,"-"),
(5,18,"-"),
(5,19,"#"),
(5,20,"#")

;

--
-- Ajout des Primary keys
--
ALTER TABLE `level1`
  ADD PRIMARY KEY (`id`),
  MODIFY `id` int(1) AUTO_INCREMENT;
  
ALTER TABLE `level2`
  ADD PRIMARY KEY (`id`),
  MODIFY `id` int(1) AUTO_INCREMENT;
  
ALTER TABLE `level3`
  ADD PRIMARY KEY (`id`),
  MODIFY `id` int(1) AUTO_INCREMENT;
  
ALTER TABLE `level4`
  ADD PRIMARY KEY (`id`),
  MODIFY `id` int(1) AUTO_INCREMENT;
  
ALTER TABLE `level5`
  ADD PRIMARY KEY (`id`),
  MODIFY `id` int(1) AUTO_INCREMENT;