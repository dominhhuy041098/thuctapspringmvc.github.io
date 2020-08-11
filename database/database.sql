CREATE SCHEMA `thuctap` ;
CREATE TABLE `thuctap`.`book` (
  `bookid` INT NOT NULL AUTO_INCREMENT,
  `bookname` VARCHAR(45) NULL,
  `author` VARCHAR(45) NULL,
  `category` VARCHAR(45) NULL,
  PRIMARY KEY (`bookid`));
  
CREATE TABLE `thuctap`.`user` (
  `userid` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  PRIMARY KEY (`userid`));
  
  drop table ''