# Usa una imagen base de Java 21
FROM eclipse-temurin:21-jdk-alpine

# Crea un directorio de trabajo en el contenedor
WORKDIR /app

# Copia el jar compilado desde target/
COPY target/tarea3Ysla-0.0.1-SNAPSHOT.jar app.jar

# Expón el puerto usado por Spring Boot
EXPOSE 8080

# Comando para ejecutar la app
ENTRYPOINT ["java", "-jar", "app.jar"]