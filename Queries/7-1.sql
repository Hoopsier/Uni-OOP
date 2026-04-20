DROP database if exists conversion;
create database conversion;
DROP USER IF EXISTS 'appuser'@'localhost';
CREATE USER 'appuser'@'localhost' IDENTIFIED BY 'password';
GRANT SELECT, INSERT, UPDATE, DELETE ON company.* TO 'appuser'@'localhost';

use conversion;
create table currencies(
  id int not null AUTO_INCREMENT,
  currency varchar(4) not null,
  exchange_rate decimal(2,1) not null,
  PRIMARY KEY(id)
);
INSERT INTO currencies (currency,exchange_rate) VALUES 
("eur",1.0),
("usd",0.8),
("gbp",1.2);

select currency from currencies;
select count(currency) from currencies;
select currency as Most_Pricy from currencies where exchange_rate = (select max(exchange_rate) from currencies);
