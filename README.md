# Customer App

This project is a Spring Boot-based RESTful API for managing customers and users with JWT-based authentication and authorization. It includes features such as user registration, login, and secured endpoints for CRUD operations on customers.

---

## **Features**

- **Spring Boot 2.5.4**
- **JWT Authentication and Authorization**
- **Spring Security** with `BCryptPasswordEncoder`
- **Customer CRUD APIs** (Create, Read, Update, Delete)
- **Swagger Integration** for API documentation
- **PostgreSQL** as the database
- **MapStruct** for DTO to entity mapping
- **Lombok** for reducing boilerplate code
- **CORS Configuration**
- **RESTful API Design** with versioning: `/api/v1`

---

## **Tech Stack**

- **Java 11**
- **Spring Boot**
- **Spring Security**
- **JPA (Hibernate)**
- **PostgreSQL**
- **JWT (com.auth0)**
- **Swagger (Springfox)**
- **MapStruct**
- **Lombok**

---

## **Getting Started**

### **Prerequisites**
- Java 11+
- Maven 3.6+
- PostgreSQL

---

### **Setup**

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-repo/customer-app.git
   cd customer-app
   ```

2. **Configure the database**
   Update `src/main/resources/application.properties`:

   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/customerdb
   spring.datasource.username=your_db_user
   spring.datasource.password=your_db_password
   spring.jpa.hibernate.ddl-auto=update
   ```

3. **Build and Run**

   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

4. **Access Swagger UI**

   ```
   http://localhost:8080/swagger-ui/
   ```

---

## **API Endpoints**

### **Customer Service**

Base URL: `/api/v1/customer-service`

* `GET /customers` - Retrieve all customers
* `GET /customers/{id}` - Retrieve a customer by ID
* `POST /customers` - Create a new customer
* `PUT /customers/{id}` - Update a customer
* `DELETE /customers/{id}` - Delete a customer

### **User Service**

Base URL: `/api/v1/user-service`

* `POST /users` - Register a new user
* `POST /user/login` - Authenticate and get a JWT token

---

## **Authentication**

The application uses JWT for securing endpoints:

1. **Login** with `POST /user/login` using JSON:

   ```json
   {
       "userName": "test",
       "password": "password"
   }
   ```

   Response: `username <JWT_TOKEN>`

2. **Use the token** in the `Authorization` header for subsequent requests:

   ```
   Authorization: Bearer <JWT_TOKEN>
   ```

---

## **Project Structure**

```
src/

├── main/

│   ├── java/com/pie/trainingtask/customerapp/

│   │   ├── controller/      # REST controllers

│   │   ├── dto/             # Data Transfer Objects

│   │   ├── entity/          # JPA entities

│   │   ├── security/        # JWT & Spring Security configurations

│   │   ├── service/         # Business logic services

│   └── resources/

│       └── application.properties

└── test/
```

---

## **Swagger API Docs**

Swagger is enabled with Springfox.

* Visit: `http://localhost:8080/swagger-ui/`
* JSON Docs: `http://localhost:8080/v2/api-docs`

---

## **Build**

To package the application:

```bash
mvn clean install
mvn spring-boot:run
```
