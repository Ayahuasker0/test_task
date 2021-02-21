CREATE TABLE users
(
    username VARCHAR(50)  NOT NULL,
    password VARCHAR(100) NOT NULL,
    enabled  TINYINT      NOT NULL DEFAULT 1,
    PRIMARY KEY (username)
);

CREATE TABLE authorities
(
    username  VARCHAR(50) NOT NULL,
    authority VARCHAR(50) NOT NULL,
    FOREIGN KEY (username) REFERENCES users (username)
);

CREATE UNIQUE INDEX ix_auth_username
    on authorities (username, authority);

CREATE TABLE transaction_account
(
   id LONG NOT NULL,
   balance DECIMAL(10,2) NOT NULL,
   username  VARCHAR(50) NOT NULL
);

CREATE TABLE transaction
(
  id LONG NOT NULL,
  amount DECIMAL(10,2) NOT NULL,
  transaction_account_id LONG NOT NULL,
  FOREIGN KEY (transaction_account_id) REFERENCES transaction_account (id)
);