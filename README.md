# OPA Integration with Spring Boot

## Table of Contents

1. [Introduction](#introduction)
2. [Installation](#installation)

## Introduction

This project is a simple sample of integrating the OPA policy engine with Spring Security.

## Installation

### Prerequisites

- [OPA](https://www.openpolicyagent.org/docs/latest/#running-opa)
- Java
- [Maven](https://docs.spring.io/spring-boot/installing.html)
- [Postman](https://www.postman.com/)

### Steps

1. **Clone the repository:**

    ```bash
    git clone https://github.com/HsuehYangYu/opa-integration-spring-boot.git
    ```
   
2. **Navigate to the project directory:**

    ```bash
    cd opa-integration-spring-boot
    ```

3. **Build the project using Maven:**

    ```bash
    mvn clean install
    ```

## OPA Policy Verification



### Running the Project

1. **Run OPA Server:**
    ```bash
    opa run -w -s src/test/rego
    ```
2. **Run Spring Boot Application:**
    ```bash
    ./mvnw spring-boot:run
    ```