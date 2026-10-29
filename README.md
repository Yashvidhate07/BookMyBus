# 🚌 Book My Bus — Bus Ticket Reservation System

A RESTful web application designed to simplify online bus ticket reservations. The system allows users to register, log in, search for available bus routes, reserve seats, manage bookings, cancel reservations, and submit feedback. Administrators can manage buses, routes, and reservation-related information.

## 🔐 Local configuration

The backend source is in `BusTicketReservationSystem(Backend)`. Before running it, copy `src/main/resources/application.properties.example` to `application.properties`; that local file is intentionally excluded from Git. Create the `masaidb` MySQL database (or set `DB_URL`), then provide these environment variables:

```text
DB_URL=jdbc:mysql://localhost:3306/masaidb
DB_USERNAME=your_mysql_username
DB_PASSWORD=your_mysql_password
APP_ADMIN_USERNAME=your_admin_username
APP_ADMIN_PASSWORD=your_admin_password
```

Run the backend from `BusTicketReservationSystem(Backend)` with `./mvnw spring-boot:run` (or `mvnw.cmd spring-boot:run` on Windows). It listens on port 8088.

## 📌 Project Overview

**Book My Bus** is a bus ticket reservation system developed using Java, Spring Boot, Hibernate, and MySQL. It follows a modular architecture and exposes RESTful APIs for managing users, buses, routes, reservations, and feedback.

The application aims to provide a convenient and organized booking experience while enabling administrators to manage bus transportation services efficiently.

## ✨ Features

### 👤 User Features
- User registration and login.
- Session-based authentication and validation.
- Search for buses by source and destination.
- View available buses and journey details.
- Book bus tickets.
- View and manage reservations.
- Cancel existing reservations.
- Submit feedback about the bus journey.

### 🛠️ Admin Features
- Admin authentication.
- Add and manage bus information.
- Configure bus routes and stops.
- Maintain departure and arrival details.
- Manage bus types, including AC and non-AC.
- Manage seat availability and reservation information.
- Review reservation details.

## 🧩 Application Modules

| Module | Description |
|---|---|
| Login / Logout | Manages user access and sessions. |
| Admin | Provides administrative functionality. |
| User | Handles registration and user information. |
| Bus | Manages bus details, types, and seats. |
| Route | Stores source, destination, stops, and route information. |
| Reservation | Handles booking and cancellation operations. |
| Feedback | Collects user feedback about journeys. |

## 💻 Technology Stack

### Backend
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- RESTful APIs

### Frontend
- HTML5
- CSS3
- JavaScript

### Database
- MySQL

### Development Tools
- Maven
- Lombok
- Swagger
- Postman
- Spring Tool Suite / Eclipse
- Git and GitHub

## 🏗️ System Design

### Entity Relationship Diagram (ER Diagram)

The ER diagram illustrates the relationships between the entities used in the bus reservation system.

![Book My Bus ER Diagram](https://github.com/DeependrYadav/honest-wing-5796/assets/121309012/9c8bb70a-5f68-4210-8a88-d8796f8e165c)

### Application Modules

The application is divided into separate modules to support organized development and maintenance.

![Book My Bus Modules](https://github.com/DeependrYadav/honest-wing-5796/assets/121309012/0bab30a1-8c4b-4032-b528-0532c49d4fc8)

## 📸 Application Screenshots

### Admin Dashboard
![Admin Dashboard](https://github.com/DeependrYadav/honest-wing-5796/assets/121309012/215875e6-4558-4599-96ab-d1fe33b3649e)

### User Landing Page
![User Landing Page](https://github.com/DeependrYadav/honest-wing-5796/assets/121309012/d2e58fb4-a7ed-4554-9989-7c7d9723995f)

### User Registration
![User Registration](https://github.com/DeependrYadav/honest-wing-5796/assets/121309012/32f62e58-51fc-4725-9bd6-90c77f853de2)

### Bus Management
![Bus Management](https://github.com/DeependrYadav/honest-wing-5796/assets/121309012/6443f399-696f-45bc-8be9-877490633c47)

### Route Management
![Route Management](https://github.com/DeependrYadav/honest-wing-5796/assets/121309012/abafa311-7b93-42de-bd8f-9011bd88e8ba)

### Reservation Management
![Reservation Management](https://github.com/DeependrYadav/honest-wing-5796/assets/121309012/bd23d53e-a2d3-4b31-9aea-8c61f7ef2cb6)

### Feedback Module
![Feedback Module](https://github.com/DeependrYadav/honest-wing-5796/assets/121309012/097301e3-a2be-4718-a538-3f6ae1537c82)

## ⚙️ Getting Started

### Prerequisites
Ensure the following tools are installed:

- Java JDK
- Maven
- MySQL Server
- Spring Tool Suite or Eclipse
- Git

### Installation

**1. Clone the repository**

```bash
git clone YOUR_GITHUB_REPOSITORY_URL
cd YOUR_PROJECT_FOLDER
```

Replace the placeholder with your actual repository URL.

**2. Create the database**

Create a MySQL database using the name configured in your application.

```sql
CREATE DATABASE book_my_bus;
```

**3. Configure database credentials**

Update your `application.properties` file with your local MySQL configuration.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/book_my_bus
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Set `DB_USERNAME` and `DB_PASSWORD` in your local environment. Adjust the database settings according to your project's configuration.

**4. Build the application**

```bash
mvn clean install
```

**5. Run the application**

```bash
mvn spring-boot:run
```

The application will start on the port configured in your Spring Boot settings.

> Note: The commands above are a general setup guide. Verify the actual repository structure, database configuration, and run instructions before publishing.

## 🔗 API Documentation and Testing

- **Swagger:** Use the Swagger UI endpoint configured in the application to explore the available REST APIs.
- **Postman:** Test endpoints for user registration, authentication, bus management, route management, reservations, and feedback.
- **Database:** MySQL stores application data through Spring Data JPA and Hibernate.

The exact API URLs and Swagger endpoint depend on the implementation.

## 📚 Key Learnings

- Understanding Java and Spring Boot application development.
- Designing RESTful APIs.
- Working with relational databases using MySQL.
- Using Spring Data JPA and Hibernate for persistence.
- Organizing an application into independent functional modules.
- Testing APIs with Postman and documenting them using Swagger.
- Using Git and GitHub for version control.
- Understanding authentication, validation, and reservation workflows.

## 👨‍💻 Author

**Yash Vidhate**

- GitHub: [Yashvidhate07](https://github.com/Yashvidhate07
- Email: vidhateyash33@gmail.com

---


