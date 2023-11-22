## Application Description
This is a RESTful API for a simple online bookstore built using Spring Boot, Hibernate and MySQL. The API allows users to perform CRUD (Create, Read, Update, Delete) operations on books, authors, and genres. Books have a title, author, genre, price, and quantity available, and users can search for books by title, author, or genre.

## Steps to Run and Test the Application

1. Clone the repository onto your local machine using the command:
```
git clone <repository-url>
```

2. Navigate to the project directory:
```
cd Online-Bookstore-API
```

3. Build the project using Maven:
```
mvn clean install
```

4. Change the database configurations in application.properties according to your database settings:
```
spring.datasource.url=jdbc:mysql://localhost:<port>/<database-name>?useSSL=false
spring.datasource.username=<database-username>
spring.datasource.password=<database-password>
```
Note: If you don't have MySQL installed on your local machine, please install it first.

5. Run the application using any of the following commands:
```
java -jar target/Online-Bookstore-API.jar
```
or
```
mvn spring-boot:run
```

6. Open Postman or any other similar tool to test the APIs. The API endpoints can be tested using the following URLs:
```
- GET    /books
- GET    /books/{id}
- POST   /books
- PUT    /books/{id}
- DELETE /books/{id}

- GET    /authors
- GET    /authors/{id}
- POST   /authors
- PUT    /authors/{id}
- DELETE /authors/{id}

- GET    /genres
- GET    /genres/{id}
- POST   /genres
- PUT    /genres/{id}
- DELETE /genres/{id}

- GET    /books/search?title={title}
- GET    /books/search?author={author}
- GET    /books/search?genre={genre}
```

7. Use the appropriate HTTP methods to test the API endpoints. For example, to add a new book, send a POST request to the /books endpoint with the following body:
```
{
    "title": "Java Programming",
    "author": "John Doe",
    "genre": "Programming",
    "price": 29.99,
    "quantity": 10
}
```

8. The application also includes unit tests to check the correctness of the application. Run the unit tests using the following command:
```
mvn clean test
```

Note: The application requires JDK 1.8 or higher and Maven 3.2+ to be installed on your local machine.
