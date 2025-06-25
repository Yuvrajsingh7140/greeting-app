# Demo Spring Boot Application

A simple Spring Boot REST API application demonstrating basic CRUD operations without database dependencies.

## Features

- REST API endpoints
- In-memory data storage
- User management
- Spring Boot DevTools for development

## Prerequisites

- Java 17 or higher
- Maven 3.6+

## Running the Application

1. Clone the repository
2. Navigate to project directory
3. Run: `./mvnw spring-boot:run`
4. Access: `http://localhost:8080`

## API Endpoints

- `GET /api/hello` - Basic greeting
- `GET /api/hello/{name}` - Personalized greeting
- `GET /api/status` - Application status
- `GET /api/users` - Get all users
- `GET /api/users/{name}` - Get user by name
- `POST /api/users` - Add new user

## Technology Stack

- Spring Boot 3.x
- Spring Web
- Maven
- Java 17