DROP TABLE IF EXISTS test.user_entity;


CREATE TABLE `test`.`user_entity` (
  `name` varchar(255) NOT NULL,
  `age` varchar(255) DEFAULT NULL,
  `emp_id` varchar(255) DEFAULT NULL,
  `salary` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`name`)
);

INSERT INTO `test`.`user_entity` VALUES ('jaga',25,123,NULL);