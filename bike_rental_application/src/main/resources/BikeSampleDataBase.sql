create database if not exists bike_rental;

use bike_rental;

drop table if exists bike;

CREATE TABLE bike (
  `id` int(3) NOT NULL AUTO_INCREMENT,
  `model` varchar(64) DEFAULT NULL,
  `bike_size` varchar(4) DEFAULT NULL,
  `bike_type` varchar(16) DEFAULT NULL,
  `rented` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO bike (`id`, `model`,`bike_size`,`bike_type`, `rented`) VALUES (	1, "Accent_Apex", "L", "ROAD", FALSE);
INSERT INTO bike (`model`,`bike_size`,`bike_type`, `rented`) VALUES ("Specialized FSR", "L", "MTB", TRUE);
INSERT INTO bike (`model`,`bike_size`,`bike_type`, `rented`) VALUES ("Focus Mares", "XL", "CX", FALSE);