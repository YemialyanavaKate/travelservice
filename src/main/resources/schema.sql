CREATE TABLE IF NOT EXISTS HOTEL (
    id INT PRIMARY KEY,
    name VARCHAR (255) not NULL,
    description VARCHAR (255),
    brand VARCHAR (255) not NULL,
    address_id INT not NULL,
    contacts_id INT not NULL,
    arrivalTime_id INT not NULL,
    hotel_amenities VARCHAR (255)
);

CREATE TABLE IF NOT EXISTS ADDRESS (
    id INT PRIMARY KEY,
    houseNumber INT not NULL,
    street VARCHAR (255) not NULL,
    city VARCHAR (255) not NULL,
    country VARCHAR (255) not NULL,
    postCode VARCHAR (255) not NULL,
    hotel_id INT not NULL,
    CONSTRAINT FK_Hotel_Address FOREIGN KEY (hotel_id) REFERENCES HOTEL(id)
);

CREATE TABLE IF NOT EXISTS CONTACTS (
    id INT PRIMARY KEY,
    phone VARCHAR (255) not NULL,
    email VARCHAR (255) not NULL,
    hotel_id INT not NULL,
    CONSTRAINT FK_Hotel_Contacts FOREIGN KEY (hotel_id) REFERENCES HOTEL(id)
);

CREATE TABLE IF NOT EXISTS ARRIVALTIME (
    id INT PRIMARY KEY,
    checkIn VARCHAR (255) not NULL,
    checkOut VARCHAR (255),
    hotel_id INT not NULL,
    CONSTRAINT FK_Hotel_arrivalTime FOREIGN KEY (hotel_id) REFERENCES HOTEL(id)
);

CREATE TABLE IF NOT EXISTS HOTEL_AMENITIES (
    hotel_id INT,
    amenities VARCHAR (255)
    );