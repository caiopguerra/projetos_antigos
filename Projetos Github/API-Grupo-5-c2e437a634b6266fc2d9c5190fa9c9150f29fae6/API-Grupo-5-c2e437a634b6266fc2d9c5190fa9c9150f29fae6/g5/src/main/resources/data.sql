CREATE TABLE role (
    id INT PRIMARY KEY,
    name VARCHAR(50)
);

INSERT INTO role (id, name) VALUES (1, 'ROLE_USER');
INSERT INTO role (id, name) VALUES (2, 'ROLE_MODERATOR');
INSERT INTO role (id, name) VALUES (3, 'ROLE_ADMIN');
