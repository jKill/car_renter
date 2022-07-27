/*
 Navicat Premium Data Transfer

 Source Server         : localConnection
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost
 Source Database       : seata_db

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : utf-8

 Date: 07/27/2022 16:16:43 PM
*/
CREATE DATABASE renter_db;
SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `t_car`
-- ----------------------------
DROP TABLE IF EXISTS `t_car`;
CREATE TABLE `t_car` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `cur_stock` int(11) DEFAULT NULL,
  `stock_limit` int(11) DEFAULT NULL,
  `car_model` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;

insert into t_car values(1, 2, 2, 'Toyota Camry');
insert into t_car values(2, 2, 2, 'BMW 650');
