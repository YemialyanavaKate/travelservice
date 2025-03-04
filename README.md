RESTful API application for working with hotels with the following methods:
1.	GET /hotels - Retrieve the list of all hotels with their brief information.
2.	GET /hotels/{id} - Retrieve detailed information about a specific hotel.
3.	GET /search - Retrieve the list of all hotels with their brief information based on the following parameters: name, brand, city, county, amenities. For example: /search?city=minsk.
4.	POST /hotels - Create a new hotel.
5.	POST /hotels/{id}/amenities - Add a list of amenities to a hotel.
6.	GET /histogram/{param} - Retrieve the number of hotels grouped by each value of the specified parameter. Parameter: brand, city, county, amenities.
Port for launch: 8092.
 Technologies used:
•	Maven, Java 17, Spring Boot, Spring JPA, Liquibase Database: H2 Additional features: Unit Tests written, design patterns used, layer separation implemented, and a quick switch to another database from H2 is possible.

