CREATE TABLE `employee`.`employee`
( `ID` INT(10) NOT NULL AUTO_INCREMENT , `NAME` VARCHAR(255) NOT NULL ,
`POSITION_JOB` VARCHAR(255) NOT NULL , `EMAIL` VARCHAR(255) NOT NULL ,
`SALARY` FLOAT(10,2) NOT NULL  , PRIMARY KEY (`ID`));

CREATE TABLE `employee`.`authenticationRequest`
( `USERNAME` VARCHAR(255) NOT NULL ,
`PASSWORD` VARCHAR(255) NOT NULL , PRIMARY KEY (`USERNAME`));

INSERT INTO employee (NAME,POSITION_JOB,EMAIL,SALARY) values('Jason UU','CEO','jason@gmail.com',100000.00);
INSERT INTO employee (NAME,POSITION_JOB,EMAIL,SALARY) values('Arnold AA','Tech leader','arnold@gmail.com',80000.00);
INSERT INTO employee (NAME,POSITION_JOB,EMAIL,SALARY) values('Bale GG','Dev','Bale@gmail.com',60000.00);
INSERT INTO employee (NAME,POSITION_JOB,EMAIL,SALARY) values('Kaka R','Test','Kaka@gmail.com',50000.00);

INSERT INTO authenticationRequest (USERNAME,PASSWORD) values('itzy','notshy');
