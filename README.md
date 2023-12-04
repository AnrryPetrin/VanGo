# VanGo-BackEnd: RESTful Transportation Solution API
![Project Status](https://img.shields.io/badge/Status-In%20Progress-brightgreen)

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Configuration](#configuration)
  - [Usage](#usage)
- [License](#license)
- [Team](#team)

## Introduction

The VanGo project is an innovative transportation solution presented as an experimental project to the Facens University. The proposed solution, VanGo, differentiates itself by focusing on user experience, inclusivity, and addressing specific user needs such as those of individuals with disabilities and pet owners.

## Features

- Registration and login for service providers.
  
- Creation of new trips to be displayed for potential clients.
  
- Search for available trips.
  
- Display of comprehensive trip information.

## Getting Started

Follow these steps to set up and run the VanGo-BackEnd project on your local machine.

### Prerequisites

Make sure you have the following prerequisites installed:

- [JDK](https://www.oracle.com/java/technologies/javase-downloads.html) - Version LTS
- [MySQL](https://www.mysql.com/) - Database engine
- [MySQL Workbench](https://www.mysql.com/products/workbench/) - Visual tool for database design and modeling
- [IDE of your preference] - For example, [IntelliJ IDEA](https://www.jetbrains.com/idea/)

### Configuration

1. Clone the repository:
```bash
git clone https://github.com/seu-usuario/VanGo-BackEnd.git
```
2. In MySQL Workbench, execute the following command to create the database:
```sql
CREATE DATABASE IF NOT EXISTS vango;
```
3. Configure Database Connection:
Open the project in your preferred IDE.
Locate the application.yml file (typically found in the src/main/resources directory) and update the database connection properties such as spring.datasource.username and spring.datasource.password if needed.

### Usage

1. Build and Run:
- Ensure that you have configured the database as per the instructions above.
  - In your IDE, build and run the project.

3. Access the API:
- Once the application is running, you can access the API at http://localhost:8080.

3. Explore Endpoints:
- Use tools like [Postman](https://www.postman.com/downloads/) or your preferred API testing tool to explore the available endpoints.

## License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT) - see the [LICENSE.md](LICENSE.md) file for details.

## Team

- **Anrry Petrin de Araujo**
  - Role: Project Manager & Developer
  - Expertise: Backend
  - Contact: [anrry.petrin@gmail.com](mailto:anrry.petrin@gmail.com)

- **Lucas Eduardo Pereira**
  - Role: Full-stack Developer
  - Expertise: Backend, Frontend
  - Contact: [lucaseduardodev@outlook.com](mailto:lucaseduardodev@outlook.com)

- **Jéser Cáceres Marcelino**
  - Role: Researcher
  - Contact: [cjeser99@gmail.com](mailto:cjeser99@gmail.com)

- **André de Lima Franceschini**
  - Role: Designer
  - Contact: [andrefranceschini@outlook.com.br](mailto:andrefranceschini@outlook.com.br) 
