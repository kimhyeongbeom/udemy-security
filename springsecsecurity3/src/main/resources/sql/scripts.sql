CREATE  TABLE users (
  id INT NOT NULL AUTO_INCREMENT,
  username VARCHAR(50) NOT NULL,
  password VARCHAR(50) NOT NULL,
  enabled INT NOT NULL,
  PRIMARY KEY (id)
);

CREATE  TABLE authorities (
    id INT NOT NULL AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL,
    authority VARCHAR(50) NOT NULL,
    PRIMARY KEY (id)
);

INSERT IGNORE INTO users VALUES (NULL, 'happy', '12345', '1');
INSERT IGNORE INTO authorities (username, authority) VALUES (NULL, 'happy', 'write');