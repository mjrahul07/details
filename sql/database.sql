CREATE DATABASE student;
USE student;
CREATE TABLE details (
  id INT(6) AUTO_INCREMENT PRIMARY KEY,
  firstname VARCHAR(500) NOT NULL,
  lastname VARCHAR(5000) NOT NULL
);
INSERT INTO details(firstname,lastname) values('Ela','B');
Select * from details;