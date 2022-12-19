# Rock-paper-scissor

This project is based on Spring boot application 

#### Technology used
- Java 17 : programming language 
- Spring boot : Web application 
- Maven : Building project
- Swagger : RESTful Documentation

#### Web Application configuration 
- Web Application is running on port `8001`
- You can change the configuration in `application.properties`
 
#### Steps to run the project

> Prerequisite
- Maven 
- Java 11 or higher 

> Start the application

Through following command:

    mvn clean install spring-boot:run 
    
Maven will install all the dependencies and followed by run the application

> To test the application

    http://localhost:8001/swagger-ui.html
    
    
#### Architectural points and Terminologies used in the project

> Game rules
 - Rock beats Scissors
 - Scissors beats Paper
 - Paper beats Rock

