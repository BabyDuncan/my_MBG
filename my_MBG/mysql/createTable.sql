CREATE TABLE `student` (
  `id`          INT(11)   NOT NULL   AUTO_INCREMENT,
  `gender`      BIT(1)               DEFAULT NULL,
  `grade`       TINYINT(4)           DEFAULT NULL,
  `age`         SMALLINT(6)          DEFAULT NULL,
  `bookNum`     BIGINT(20)           DEFAULT NULL,
  `score`       DOUBLE               DEFAULT NULL,
  `total_score` DECIMAL(10, 5)       DEFAULT NULL,
  `identify`    CHAR(10)             DEFAULT NULL,
  `name`        VARCHAR(255)         DEFAULT NULL,
  `avatar_bin`  VARBINARY(255)       DEFAULT NULL,
  `create_time` TIMESTAMP NULL       DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `desc`        BLOB,
  `status`      ENUM ('ok', 'notok') DEFAULT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8