# Book Middle Service

### Training project demonstrating creation of a REST Spring Boot microservice

The repo contains multiple branches, each focused on a feature. 

Use the diff link to see changes from master which contains the basic REST API.

| Branch                                                                                                                        | Feature                                      |
| ----------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------- |
| master                                                                                                                        | Spring-Web REST API                          |
| logging - [diff](https://github.com/mp-ebsco/platform.training.bookmiddle_copy/compare/logging)                               | Configure log4j2 Logging and Zipkin/Sleuth   | 
| test-junit - [diff](https://github.com/mp-ebsco/platform.training.bookmiddle_copy/compare/test-junit)                         | Unit and Integration Tests (Java/JUnit)      |
| test-e2e - [diff](https://github.com/mp-ebsco/platform.training.bookmiddle_copy/compare/test-e2e)                             | End-to-end API Tests (Javascript/Mocha/Chai) |
| configuration - [diff](https://github.com/mp-ebsco/platform.training.bookmiddle_copy/compare/configuration)                   | Spring Configuration and Profiles            |
| discovery-registration - [diff](https://github.com/mp-ebsco/platform.training.bookmiddle_copy/compare/discovery-registration) | Eureka Service Discovery                     |
| circuit-breaker - [diff](https://github.com/mp-ebsco/platform.training.bookmiddle_copy/compare/circuit-breaker)               | Hystrix Circuit Breaker                      |
| metrics - [diff](https://github.com/mp-ebsco/platform.training.bookmiddle_copy/compare/metrics)                               | Metrics Endpoint and Instrumentation         |
| final - [diff](https://github.com/mp-ebsco/platform.training.bookmiddle_copy/compare/final)                                   | All branches merged into final project       |

## Build

`$ gradle build`

## Run (local profile is optional)

`$ gradle [-Dspring.profiles.active=local] bootRun`

## Explore

Go to http://localhost:8080/books from a browser or Postman.