-- phpMyAdmin SQL Dump
-- version 4.0.10.12
-- http://www.phpmyadmin.net
--
-- Host: 127.10.218.2:3306
-- Generation Time: Mar 11, 2016 at 04:20 PM
-- Server version: 5.5.45
-- PHP Version: 5.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `java`
 

structure for table `game`
--

CREATE TABLE IF NOT EXISTS `game` 
(
  `username` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,

  `winner` varchar(40) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
 
 `num_players` tinyint(4) NOT NULL,
  
`game_name` varchar(40) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
 
 `players` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  
`game_id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`game_id`)
) 
ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;



structure for table `players`
--

CREATE TABLE IF NOT EXISTS `players` 
(
  `player_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
 
 `player_id` tinyint(4) NOT NULL AUTO_INCREMENT,
  
PRIMARY KEY (`player_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;



structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` 
(
  `username` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  
`password` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  
`email` varchar(40) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
 
 `user_id` smallint(6) NOT NULL AUTO_INCREMENT,
  
PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 