# Task Manager API

A simple **Spring Boot 3** backend application for managing tasks (CRUD operations) with validation and Swagger/OpenAPI support.

---

## Features

- Create, read, update, delete tasks
- Input validation using `jakarta.validation`
- H2 in-memory database for development
- OpenAPI/Swagger UI documentation at `/swagger-ui.html`
- Cross-origin support enabled

---

## Requirements

- Java 17 or higher (tested with Java 21)
- Maven 3.8+
- Docker & Docker Compose (optional)

---

## Getting Started

Clone the repository:

```bash
git clone https://github.com/raedbaff/task_manager_BE.git
cd task_manager
```

## Run Options
### Option 1: Run Normally (without Docker)
1. Build the project:

```bash
mvn clean install
```
2. Run the Spring Boot application:
```bash
mvn spring-boot:run
```
3. Access the API:
- Swagger UI: http://localhost:8080/swagger-ui.html
- API base URL: http://localhost:8080/api/tasks


**Note:** H2 database is in-memory; data will be lost after each restart.

### Option 2: Run with Docker Compose (H2 in-memory)
The project already includes a `docker-compose.yml` file. You **do not need to build anything** — the Docker image is public on Docker Hub.  

To run the app:
1. Make sure Docker and Docker Compose are installed. 
2. In the project root, run:

```bash
docker-compose up
```
3. Access the API:
- Swagger UI: http://localhost:8080/swagger-ui.html
- API base URL: http://localhost:8080/api/tasks

**Note:** H2 database is in-memory; data will be lost after each restart.