# Etapa 1: Construcción
FROM maven:3.8.4-openjdk-17 AS build
COPY . /app
WORKDIR /app
RUN mvn clean package -DskipTests

# Etapa 2: Ejecución
FROM openjdk:17-jdk-slim
COPY --from=build /app/target/ntt-ejercicio.jar /ntt-ejercicio.jar
ENTRYPOINT ["java", "-jar", "/ntt-ejercicio.jar"]
