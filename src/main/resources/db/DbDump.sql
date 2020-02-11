SET NAMES utf8 ;
DROP TABLE IF EXISTS `city_db`;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `cities` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `description` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

LOCK TABLE `cities` WRITE;

INSERT INTO `cities` VALUES (1,'Москва','Не забудьте посетить Красную Площадь. Ну а в ЦУМ можно и не заходить)))'),
(2,'Вильнюс','Заберитесь на башню гедимина, заодно посетите Заречье.'),
(3,'Варшава','Посмотрите старый город, зайдите в музей Коперника.'),
(4,'Минск','Посетите музей ВОВ, прогуляйтесь по проспекут Независимости.');
(5,'Киев','Погуляйте по майдану,  пройдитесь по андреевскому спуску');

UNLOCK TABLE;