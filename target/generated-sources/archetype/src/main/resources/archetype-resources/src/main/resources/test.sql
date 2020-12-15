-- noinspection SqlResolveForFile
create database test;


create table test.test
(
    id     bigint(20) NOT NULL auto_increment,
    `name` varchar(255) DEFAULT null,
    `age`  int(3),
    `xb`   int(1),
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 4
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;