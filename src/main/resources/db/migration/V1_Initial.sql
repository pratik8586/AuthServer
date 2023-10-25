CREATE TABLE USER (
id         VARCHAR(36)  PRIMARY KEY,
email      VARCHAR(100),
password   VARCHAR(100),

);


INSERT INTO USER (id, email, password ) VALUES (uuid(), 'authuser@test.com', 'testPassword');