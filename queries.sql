CREATE DATABASE IF NOT EXISTS netbanking;

USE netbanking;

CREATE TABLE IF NOT EXISTS customer_accounts (
    account_number INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    balance DOUBLE NOT NULL
);
