/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50616
Source Host           : localhost:3306
Source Database       : vlife_core_stage

Target Server Type    : MYSQL
Target Server Version : 50616
File Encoding         : 65001

Date: 2015-08-24 18:39:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `vvf_user`
-- ----------------------------
DROP TABLE IF EXISTS `vvf_user`;
CREATE TABLE `vvf_user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `password` varchar(20) NOT NULL,
  `nickname` varchar(20) DEFAULT '',
  `age` int(11) DEFAULT '0',
  `time` decimal(15,0) NOT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of vvf_user
-- ----------------------------
INSERT INTO `vvf_user` VALUES ('1', '123', 'xiaohua', '10', '1440401089000');
INSERT INTO `vvf_user` VALUES ('2', '123456', 'xiaoxin', '18', '0');
