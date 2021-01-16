/*
 Navicat Premium Data Transfer

 Source Server         : sartre
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : localhost:3306
 Source Schema         : market

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 16/01/2021 11:51:48
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for manager
-- ----------------------------
DROP TABLE IF EXISTS `manager`;
CREATE TABLE `manager`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of manager
-- ----------------------------
INSERT INTO `manager` VALUES (1, 'wangfeng@123.com', '123456');
INSERT INTO `manager` VALUES (2, 'admin', '123456');

-- ----------------------------
-- Table structure for ware
-- ----------------------------
DROP TABLE IF EXISTS `ware`;
CREATE TABLE `ware`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `price` int(0) NOT NULL,
  `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ware
-- ----------------------------
INSERT INTO `ware` VALUES (2, '栗子', 10, '水果');
INSERT INTO `ware` VALUES (3, '电脑', 5000, '电子电器');
INSERT INTO `ware` VALUES (4, '手机', 2000, '电子电器');
INSERT INTO `ware` VALUES (5, '香蕉', 1, '水果');
INSERT INTO `ware` VALUES (7, '苹果', 5, '水果');
INSERT INTO `ware` VALUES (8, '火龙果', 15, '水果');
INSERT INTO `ware` VALUES (9, '键盘', 500, '电子电器');
INSERT INTO `ware` VALUES (10, '香梨', 10, '水果');

SET FOREIGN_KEY_CHECKS = 1;
