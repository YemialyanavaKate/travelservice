CREATE TABLE HOTEL (
    id INT PRIMARY KEY,
    name VARCHAR (255),
    description VARCHAR (255),
    brand VARCHAR (255),
    address_id INT,
    contacts_id INT
);

CREATE TABLE ADDRESS (
    id INT PRIMARY KEY,
    houseNumber INT,
    street VARCHAR (255),
    city VARCHAR (255),
    country VARCHAR (255),
    postCode VARCHAR (255),
    hotel_id INT,
    CONSTRAINT FK_Hotel_Address FOREIGN KEY (hotel_id) REFERENCES HOTEL(id)
);

CREATE TABLE CONTACTS (
    id INT PRIMARY KEY,
    phone VARCHAR (255),
    email VARCHAR (255),
    hotel_id INT,
    CONSTRAINT FK_Hotel_Contacts FOREIGN KEY (hotel_id) REFERENCES HOTEL(id)
);

CREATE TABLE ARRIVALTIME (
    id INT PRIMARY KEY,
    checkIn VARCHAR (255),
    checkOut VARCHAR (255),
    hotel_id INT,
    CONSTRAINT FK_Hotel_arrivalTime FOREIGN KEY (hotel_id) REFERENCES HOTEL(id)
);

CREATE TABLE AMENITIES (
    id INT PRIMARY KEY,
    amenities VARCHAR (255)
);
