CREATE TABLE Customer(
    customerID VARCHAR(10) PRIMARY KEY,
    firstName VARCHAR(50),
    surname VARCHAR(50),
    address VARCHAR(100)
);

CREATE TABLE Account(
    accountNumber VARCHAR(20) PRIMARY KEY,
    balance DOUBLE,
    branch VARCHAR(50),
    accountType VARCHAR(20),
    customerId VARCHAR(10),

    FOREIGN KEY(customerID) REFERENCES Customer(customerID)
);

CREATE TABLE Transactions(
    transactionId VARCHAR(10) PRIMARY KEY,
    accountNumber VARCHAR(20),
    amount DOUBLE,
    transactionType VARCHAR(20),
    transactionDate DATE,
    FOREIGN KEY(accountNumber) REFERENCES Account(accountNumber)
);

INSERT INTO Customer VALUES
('C001','Kutlwano','Tshosa','Gaborone'),
('C002','John','Molefe','Francistown');

INSERT INTO Account VALUES
('A001',1500,'Gaborone','Savings','C001'),
('A002',3000,'Gaborone','Investment','C001'),
('A003',5000,'Francistown','Cheque','C002');

INSERT INTO Transactions VALUES
('T001','A001',500,'Deposit','2026-11-19'),
('T002','A002',1000,'Deposit','2026-11-19');