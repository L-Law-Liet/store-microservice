CREATE TABLE IF NOT EXISTS rating (
    id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    rating int,
    product_id int
    ) ENGINE=InnoDB DEFAULT CHARSET=UTF8;