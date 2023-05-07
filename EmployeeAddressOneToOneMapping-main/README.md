<h1 align="center"> Employee_Address </h1>

>### Prerequisites
* ![MySql](https://img.shields.io/badge/DBMS-MYSQL%205.7%20or%20Higher-red)
 * ![SpringBoot](https://img.shields.io/badge/Framework-SpringBoot-green)


* ![Java](https://img.shields.io/badge/Language-Java%208%20or%20higher-yellow)

>## Getting started
* Clone the repository to your local machine.
* Create a MySQL database and update the application.properties file with the database credentials and connection details.
* Build the project using Maven: mvn clean install
* Run the application using java -jar target/employee-management-system-0.0.1-SNAPSHOT.jar
* Access the APIs using any HTTP client such as Postman or cURL.
>## Data flow
In this project, we have four layers-
* **Controller** - The controller layer handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business (service) layer. In short, it consists of views i.e., frontend part.
* **Service** -The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers.
* **Repository** - This layer mainatains the h2-database thing on which CRUD operations are performed
* **Model** - This layer consists basically the class level things- the various classes required for the project and these classes consists the attributes to be stored.

>## API Documentation
The following APIs are provided by the application:

Employee APIs
* GET /employees - get all employees
* GET /employees/{id} - get an employee by id
* POST /employees - create a new employee
* PUT /employees/{id} - update an employee by id
* DELETE /employees/{id} - delete an employee by id

Address APIs
* GET /addresses - get all addresses
* GET /addresses/{id} - get an address by id
* POST /addresses - create a new address
* PUT /addresses/{id} - update an address by id
* DELETE /addresses/{id} - delete an address by id

### Request and Response Formats
The APIs expect and return data in JSON format. Here are some examples:

GET /employees

Request:

```
GET /employees HTTP/1.1
Host: localhost:8080
```

Response

```
[
    {
        "id": 1,
        "firstName": "John",
        "lastName": "Doe",
        "address": {
            "id": 1,
            "street": "123 Main St",
            "city": "New York",
            "state": "NY",
            "zipcode": "10001"
        }
    },
    {
        "id": 2,
        "firstName": "Jane",
        "lastName": "Smith",
        "address": {
            "id": 2,
            "street": "456 Park Ave",
            "city": "San Francisco",
            "state": "CA",
            "zipcode": "94107"
        }
    }
]

```
POST /employees

Request:
```
POST /employees HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
    "firstName": "Alice",
    "lastName": "Johnson",
    "address": {
        "street": "789 Oak St",
        "city": "Chicago",
        "state": "IL",
        "zipcode": "60610"
    }
}

```
Response
```
{
    "id": 3,
    "firstName": "Alice",
    "lastName": "Johnson",
    "address": {
        "id": 3,
        "street": "789 Oak St",
        "city": "Chicago",
        "state": "IL",
        "zipcode": "60610"
    }
}

```
>## Project Summary
This project demonstrates the basic usage of Spring Boot and Hibernate to build a RESTful API for managing employees and addresses. Further enhancements can be made to add authentication and authorization, error handling, pagination, etc.
