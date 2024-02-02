# MovieApp - Java EPITA 2024

## Introduction

MovieApp est un projet développé avec Spring Boot, destiné à la gestion d'une collection de films. Ce webservice backend est conçu pour être connecté à un frontend Angular 17 et utilise PostgreSQL (versions 15 ou 16) comme système de gestion de base de données.

## Prérequis

- Java JDK 17 ou supérieur
- Maven 3.6.3 ou supérieur
- PostgreSQL 15 ou 16
- Node.js et npm (pour le développement Angular)
- Angular CLI 17

## Configuration de l'environnement

### Base de données PostgreSQL

- Installez PostgreSQL (version 15/16) et créez une base de données nommée `movieapp`.
- Configurez les informations de connexion dans `src/main/resources/application.properties` :

```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/movieapp
    spring.datasource.username=postgres
    spring.datasource.password=votre_mot_de_passe
    spring.datasource.driverClassName=org.postgresql.Driver
    spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
    
    # JPA / Hibernate
    spring.jpa.show-sql=true
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.properties.hibernate.format_sql=true
```

## Cloner le projet

```bash
git clone git@github.com:Formation-Cours/movieapp-java-epita-2024.git
cd movieapp-java-epita-2024
```

## Lancer le projet

```bash
mvn spring-boot:run
```

