CREATE TABLE Customer(
    customerId VARCHAR(10) PRIMARY KEY,
    firstName VARCHAR(50),
    surname VARCHAR(50),
    address VARCHAR(100)
);

CREATE TABLE Account(
    accountNumber VARCHAR(20) PRIMARY KEY,
    balance DOUBLE,
    branch VARCHAR(50),
    accountType VARCHAR(20),
    customerId VARCHAR(10)
);

CREATE TABLE Transaction(
    transactionId VARCHAR(10) PRIMARY KEY,
    accountNumber VARCHAR(20),
    amount DOUBLE,
    transactionType VARCHAR(20),
    transactionDate DATE,
    FOREIGN KEY(accountNumber) REFERENCES Account(accountNumber)
);
INSERT INTO Customer VALUES
('C001','John','Doe','Gaborone'),
('C002','Mary','Smith','Francistown');