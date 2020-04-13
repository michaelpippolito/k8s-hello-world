DROP TABLE IF EXISTS users;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL
);

INSERT INTO users (first_name, last_name) VALUES
    ('John', 'Lennon'),
    ('Paul', 'McCartney'),
    ('George', 'Harrison'),
    ('Ringo', 'Starr');