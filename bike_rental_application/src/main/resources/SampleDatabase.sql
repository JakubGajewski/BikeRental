create database if not exists bike_rental;
use bike_rental;
--
drop table if exists bike;
CREATE TABLE bike (
  `id` int(3) NOT NULL AUTO_INCREMENT,
  `model` varchar(64) DEFAULT NULL,
  `bike_size` varchar(4) DEFAULT NULL,
  `bike_type` varchar(16) DEFAULT NULL,
  `rent_id` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
--
INSERT INTO bike (`id`, `model`,`bike_size`,`bike_type`, `rented`) VALUES (	1, "Accent_Apex", "L", "ROAD", FALSE);
INSERT INTO bike (`model`,`bike_size`,`bike_type`, `rented`) VALUES ("Specialized FSR", "L", "MTB", TRUE);
INSERT INTO bike (`model`,`bike_size`,`bike_type`, `rented`) VALUES ("Focus Mares", "XL", "CX", FALSE);

drop table if exists customer;
CREATE TABLE customer (
  `id` int(3) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) DEFAULT NULL,
  `surname` varchar(4) DEFAULT NULL,
  `mail` varchar(16) DEFAULT NULL,
  `phone` int(16) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
--
INSERT INTO customer (`id`, `name`, `surname`, `mail`, `phone`) VALUES (	1, "John", "Smith", "john.smith@yahoo.com");
INSERT INTO customer (`id`, `name`, `surname`, `mail`, `phone`) VALUES (	2, "Merry", "Jane", "merry.jane@amazon.com");
INSERT INTO customer (`id`, `name`, `surname`, `mail`, `phone`) VALUES (	3, "Ted", "Kowalsky", "ted.kowalsky@gmail.com");


drop table if exists rent;
CREATE TABLE rent (
  `id` int(3) NOT NULL AUTO_INCREMENT,
  `from` date DEFAULT NULL,
  `to` date DEFAULT NULL,
  `customer_id` varchar(16) DEFAULT NULL,
  `bike_id` int(16) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
--
INSERT INTO rent (`id`, `from`, `to`, `customer_id`, `bike_id`) VALUES (	1, "2018-9-15", "2018-10-15", 3, 1);
INSERT INTO rent (`id`, `from`, `to`, `customer_id`, `bike_id`) VALUES (	1, "2018-10-15", "2018-11-15", 1, 1);