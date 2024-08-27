CREATE TABLE users (
    id BIGINT AUTO_INCREMENT, 
    name VARCHAR(255),
    password VARCHAR(255),
    PRIMARY KEY (id)
);

INSERT INTO users (name, password)
VALUES ('teste', '123');
