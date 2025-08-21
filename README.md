# Student Management System

A full-stack web application built with the Spring Framework for managing student details. This application provides CRUD (Create, Read, Update, Delete) operations for student records.

## 🚀 Features

- **View Student List**: See a list of all registered students in a table.
- **Add New Students**: A form to add new student details (ID, Name, Department, Country, etc.).
- **Update Existing Students**: Edit the details of any existing student.
- **Delete Students**: Remove a student record from the system.
- **Search & Filter**: (Optional - add if you implemented it) Filter students by department or name.

## 🛠️ Built With

### Backend
*   **Spring Boot** - Core framework for creating stand-alone, production-grade applications.
*   **Spring MVC** - Model-View-Controller architecture for building web applications.
*   **Spring Data JPA** - For simplified database access and ORM (Object-Relational Mapping).
*   **Hibernate** - JPA implementation for database operations.

### Frontend
*   **Thymeleaf** - Server-side Java template engine for HTML.
*   **Bootstrap** - CSS framework for responsive and modern UI components.
*   **HTML5, CSS3** - Standard web technologies.

### Database
*   **MySQL** / **H2 Database** (Choose one) - Relational database management system.

### Build Tool
*   **Maven** - Dependency management and project build.

## 📋 Prerequisites

Before you run this application, make sure you have the following installed on your machine:
*   **JDK** 8 or 11 (Java Development Kit)
*   **Apache Maven** 3.6+
*   **MySQL Server** (if using MySQL as the database)
*   An IDE like **Eclipse** or **IntelliJ IDEA**

## 🗄️ Database Configuration

This application uses a relational database. Follow these steps to set it up:

1.  **Create a Database**: Create an empty schema in your MySQL server (e.g., `student_db`).
2.  **Update Application Properties**:
    Edit the `src/main/resources/application.properties` file with your database credentials.

    ```properties
    # For MySQL Database
    spring.datasource.url=jdbc:mysql://localhost:3306/student_db
    spring.datasource.username=your_mysql_username
    spring.datasource.password=your_mysql_password
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true

    # For H2 Database (in-memory, for testing)
    # spring.datasource.url=jdbc:h2:mem:testdb
    # spring.datasource.driverClassName=org.h2.Driver
    # spring.datasource.username=sa
    # spring.datasource.password=
    # spring.h2.console.enabled=true
    ```

## 🚀 Running the Application

Follow these steps to get the application running on your local machine:

1.  **Clone the repository**
    ```bash
    git clone https://github.com/your-username/your-repo-name.git
    cd your-repo-name
    ```

2.  **Configure the Database** (as mentioned above).

3.  **Build the project** (using Maven)
    ```bash
    mvn clean install
    ```

4.  **Run the Spring Boot application**
    *   **Option A: Using IDE**: Run the main class (e.g., `StudentManagementApplication.java`) from your IDE.
    *   **Option B: Using Command Line**:
        ```bash
        mvn spring-boot:run
        ```

5.  **Access the Application**
    Open your web browser and go to: `http://localhost:8080`

## 📸 Screenshots (Optional but Highly Recommended)

*(You can add screenshots here to make your README visually appealing. Just add a sentence like the one below and upload your images to a folder like `/screenshots` in your repo.)*

> ![Student List Page](/screenshots/student-list.png)
*Homepage showing the list of all students.*

> ![Add Student Form](/screenshots/add-student.png)
*Form for adding a new student.*

## 📁 Project Structure

```bash
src/main/java/
├── com.example.studentmanagement
│   ├── StudentManagementApplication.java  # Main Spring Boot class
│   ├── controller
│   │   └── StudentController.java         # Handles web requests (GET, POST)
│   ├── entity
│   │   └── Student.java                   # JPA Entity/Model class
│   ├── repository
│   │   └── StudentRepository.java         # JPA Repository interface
│   └── service
│       ├── StudentService.java            # Service interface
│       └── StudentServiceImpl.java        # Service implementation
src/main/resources/
├── static/                                # CSS, JS, images
├── templates/                             # Thymeleaf HTML files
│   ├── index.html                         # Student list page
│   ├── new_student.html                   # Add student form
│   └── update_student.html                # Edit student form
└── application.properties                 # Database & application config
