/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50711
Source Host           : localhost:3306
Source Database       : shop

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2016-03-29 13:22:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `age` int(11) DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('1', '23', 'zty', '13212221333');
INSERT INTO `user_info` VALUES ('2', '23', 'zty', '13212221333');
INSERT INTO `user_info` VALUES ('3', '23', 'zty', '13212221333');
INSERT INTO `user_info` VALUES ('4', '23', 'zty', '13212221333');
INSERT INTO `user_info` VALUES ('5', '23', 'zty', '13212221333');
INSERT INTO `user_info` VALUES ('6', '23', 'zty', '13212221333');
INSERT INTO `user_info` VALUES ('7', '23', 'zty', '13212221333');
