# Simple Spring Boot Web Service - Day 02 Practical

## Project Overview
This project demonstrates a simple Spring Boot web service application created on **March 21, 2025**. The application provides basic REST API endpoints that return text responses.

## Project Structure
- **`AppController.java`** - Contains basic greeting endpoints.
- **`DetailsController.java`** - Contains a student information endpoint.
- **`Output1.png`** - Screenshot showing application output.

## Technologies Used
- **Spring Boot**
- **Spring Web**
- **Java**

## Getting Started
### Prerequisites
Ensure you have the following installed:
- Java 17 or later
- Maven

### Installation & Running the Application
1. Clone the repository:
   ```sh
   git clone https://github.com/your-repo-url.git
   ```
2. Navigate to the project directory:
   ```sh
   cd spring-boot-web-service
   ```
3. Build and run the application:
   ```sh
   mvn spring-boot:run
   ```

### API Endpoints
| Method | Endpoint | Description |
|--------|---------|-------------|
| GET | `/greet` | Returns a basic greeting message |
| GET | `/student/details` | Returns student information |

## Screenshots
Below is an example output of the application:
![Output Screenshot](Output1.png)


