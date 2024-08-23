create table if not exists users(
    id bigint not null auto_increment,
    name VARCHAR(255),
    password VARCHAR(255)
    primary key (id)
)

INSERT INTO users (name, password) 
VALUES ('teste', '123');