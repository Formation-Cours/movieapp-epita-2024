FROM maven:3.9.6-eclipse-temurin-17 as BUILD

COPY . .

RUN mvn clean package -DskipTests

FROM openjdk:17-jdk-slim

COPY --from=BUILD target/*.jar /app.jar

ENV DB_URL=jdbc:postgresql://localhost:5432/movieapp
ENV DB_USER=postgres
ENV DB_PASSWORD=postgres

ENTRYPOINT ["java", "-jar", "/app.jar"]


