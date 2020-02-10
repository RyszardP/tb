CREATE SCHEMA IF NOT EXISTS `city_db` DEFAULT CHARACTER SET utf8 ;
USE `city_db` ;

CREATE TABLE IF NOT EXISTS `city_db`.`cities` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `description` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = utf8;