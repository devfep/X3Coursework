CREATE TABLE Customers (
	customer_id SERIAL NOT NULL UNIQUE,
	first_name varchar(30) NOT NULL,
	last_name varchar(30) NOT NULL,
	email varchar(50) NOT NULL UNIQUE,
	phone_numer integer UNIQUE
);

INSERT INTO Customers(first_name, last_name, email, phone_numer)
VALUES ('Felix', 'Pat', 'fep@gmail.com', 911111111),
       ('John', 'Doe', 'jdoe@gmail.com', 902819023);


SELECT * FROM Customers;




CREATE TABLE Products (
	product_id serial NOT NULL UNIQUE,
	brand varchar(30) NOT NULL,
	model varchar(30) NOT NULL,
	description varchar(500) NOT NULL,
	price integer NOT NULL,
	quantity integer NOT NULL
);

INSERT INTO Products(brand, model, description, price, quantity)
VALUES ('Yuyama', 'x300', 'This is our fastest bike yet', 200, 15),
       ('Kawasaki', 'p500', 'Want to go fast, faster, fastest? Come join the family', 300, 10);

SELECT * FROM Products;


CREATE TABLE Transactions (
	transaction_id serial NOT NULL UNIQUE,
	customer_id integer NOT NULL,
	product_id integer NOT NULL,
	transaction_date DATE NOT NULL,
	CONSTRAINT Transactions_pk PRIMARY KEY ("transaction_id")
);

SELECT * FROM Transactions;

INSERT INTO Transactions(customer_id, product_id, transaction_date)
VALUES (2, 2, NOW() - interval '2 month');


ALTER TABLE Transactions ADD CONSTRAINT Transactions_fk0 FOREIGN KEY ("customer_id") REFERENCES Customers("customer_id");
ALTER TABLE Transactions ADD CONSTRAINT Transactions_fk1 FOREIGN KEY ("product_id") REFERENCES Products("product_id");
