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
('C002','John','Molefe','Francistown'),
('C003','Mary','Jones','Lobatse'),
('C004','Peter','Brown','Maun'),
('C005','Anna','White','Lobatse'),
('C006','James','Taylor','Molepolole'),
('C007','Sarah','Black','Serowe'),
('C008','Mike','Green','Kanye'),
('C009','Jane','Wilson','Selebi-Phikwe'),
('C010','David','Reed','Palapye');



INSERT INTO Account VALUES
('A001',1500,'Gaborone','Savings','C001'),
('A002',3000,'Gaborone','Investment','C001'),
('A003',5000,'Francistown','Cheque','C002'),
('A004',1000,'Palapye','Investment','C001'),
('A005',1400,'Molepolole','Savingst','C010'),
('A006',1000,'Tutume','Investment','C004'),
('A007',1000,'Francistown','Cheque','C006'),
('A008',1200,'Gaborone','Savings','C009'),
('A010',1050,'Maun','Investment','C005');


INSERT INTO Transactions VALUES
('T001','A001',500,'Deposit','2026-11-19'),
('T002','A002',1000,'Deposit','2026-11-19');