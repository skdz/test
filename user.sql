/*
 Navicat Premium Data Transfer

 Source Server         : 本地mysql
 Source Server Type    : MySQL
 Source Server Version : 50717
 Source Host           : localhost:3306
 Source Schema         : mytest

 Target Server Type    : MySQL
 Target Server Version : 50717
 File Encoding         : 65001

 Date: 07/06/2022 09:20:36
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `age` int(11) NULL DEFAULT NULL COMMENT '年龄',
  `sex` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址',
  `phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话',
  `create_time` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 27 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '张三', 22, '男', '上海市', '13867675656', '2020-12-26');
INSERT INTO `user` VALUES (2, '李四', 20, '男', '合肥市', '13978786565', '2020-11-18');
INSERT INTO `user` VALUES (3, '赵柳', 20, '男', '南京市', '13978786565', '2020-11-18');
INSERT INTO `user` VALUES (4, '钱望', 22, '男', '深圳市', '13867675656', '2020-11-18');
INSERT INTO `user` VALUES (5, '马云禄', 20, '女', '西凉', '13978786565', '2022-06-06');
INSERT INTO `user` VALUES (6, '张傅', 22, '男', '上海市', '13867675656', '2020-11-18');
INSERT INTO `user` VALUES (7, '李青', 20, '男', '合肥市', '13978786565', '2020-11-18');
INSERT INTO `user` VALUES (8, '王二发', 22, '男', '昆明市', '13867675656', '2020-11-18');
INSERT INTO `user` VALUES (12, '王富贵', 22, '男', '红狐小红娘', '13867674565', '2022-06-06');
INSERT INTO `user` VALUES (13, '胡桃y', 14, '女', '原神', '41412411253231', '2022-06-06');
INSERT INTO `user` VALUES (14, '刻晴3', 15, '女', '原神2', '524523', '2022-06-06');
INSERT INTO `user` VALUES (15, '香菱6rr', 13, '女', '原神', '12414', '2022-06-06');
INSERT INTO `user` VALUES (16, '班尼特', 15, '男', '原神', '5141', '2022-06-06');
INSERT INTO `user` VALUES (17, '尤拉', 14, '女', '原神', '515215', '2022-06-06');
INSERT INTO `user` VALUES (18, '莫干那', 6000, '女', '英雄联盟', '14124', '2022-06-06');
INSERT INTO `user` VALUES (20, '德莱文', 23, '男', '诺克萨斯', '1521', '2022-06-06');
INSERT INTO `user` VALUES (22, '瑞文', 23, '女', '诺克萨斯', '1514253', '2022-06-06');
INSERT INTO `user` VALUES (23, '拉克丝', 23, '女', '德玛西亚', '1241', '2022-06-06');
INSERT INTO `user` VALUES (26, '李云龙', 55, '男', '亮剑', '435346', '2022-06-07');

SET FOREIGN_KEY_CHECKS = 1;
