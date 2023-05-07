
<h1 align="center"> Employee_address </h1>

>### Framework Used 
 * ![SpringBoot](https://img.shields.io/badge/SpringBoot-White?style=flat&logoColor=Blue)

>### Language Used
* ![Java](https://img.shields.io/badge/Java-White?style=flat&logoColor=Blue)

>## Data flow
In this project, we have four layers-
* **Controller** - The controller layer handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business (service) layer. In short, it consists of views i.e., frontend part.
* **Service** -The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers.
* **Repository** - This layer mainatains the h2-database thing on which CRUD operations are performed
* **Model** - This layer consists basically the class level things- the various classes required for the project and these classes consists the attributes to be stored.

>## API Documentation
The following APIs are provided by the application:

>## Employee APIs-
* GET /employees - get all employees
* GET /employees/{id} - get an employee by id
* POST /employees - create a new employee
* PUT /employees/{id} - update an employee by id
* DELETE /employees/{id} - delete an employee by id

>## Address APIs-
* GET /addresses - get all addresses
* GET /addresses/{id} - get an address by id
* POST /addresses - create a new address
* PUT /addresses/{id} - update an address by id
* DELETE /addresses/{id} - delete an address by id


>## Validation-
* Validation is done using annotations in the entity classes. The following validations are applied:

>## Employee-
* firstName: @NotBlank
* lastName: @NotBlank
* address: @NotNull

>## Address-
* street: @NotBlank
* city: @NotBlank
* state: @NotBlank
* zipcode: @NotBlank, @Digits(integer = 6, fraction = 0, message = "Zipcode can't be letters")


>## Project Summary
This project demonstrates the basic usage of Spring Boot and Hibernate to build a RESTful API for managing employees and addresses. Further enhancements can be made to add authentication and authorization, error handling, pagination, etc.
