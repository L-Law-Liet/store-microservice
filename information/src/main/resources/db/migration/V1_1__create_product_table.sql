CREATE TABLE IF NOT EXISTS product (
    id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    title varchar(255),
    description text,
    price float
    ) ENGINE=InnoDB DEFAULT CHARSET=UTF8;