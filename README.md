# Spring Boot Application – Practice Project

This repository contains a simple Spring Boot application developed as a hands-on practice project.

## Purpose

The primary goal of this project is to gain end-to-end experience with building, running, and understanding Spring Boot applications.

## Features

- Basic Spring Boot setup
- RESTful APIs (add more details here if applicable)
  
## Technologies Used

- Java
- Spring Boot
- Maven


## Notes

- To define a controller in Spring Boot, we use either @Controller or @RestController. These annotations help Spring identify the class responsible for handling incoming HTTP requests.
- You can define any number of controller classes in a Spring Boot application.
- Spring Boot uses a component called the Front Controller (specifically, the DispatcherServlet) to route incoming requests to the appropriate controller. This happens behind the scenes.
- If your controller needs to return data (such as primitive types, objects, or JSON), use @RestController instead of @Controller. This is because @RestController is a combination of @Controller and @ResponseBody, which automatically serializes the return value into the HTTP response body.
- Alternatively, if you're using @Controller, you can annotate individual methods with @ResponseBody to achieve the same effect as @RestController.