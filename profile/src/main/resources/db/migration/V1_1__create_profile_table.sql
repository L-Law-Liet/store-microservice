CREATE TABLE IF NOT EXISTS profile (
    id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name varchar(255),
    surname varchar(255),
    email varchar(255)
    ) ENGINE=InnoDB DEFAULT CHARSET=UTF8;