# Use OpenJDK base image

FROM openjdk:17-jdk-slim

# Set working directory

WORKDIR /app

# Copy the JAR file

COPY target/inventorysystem-1.0.0.jar app.jar

# Expose port

EXPOSE 8080

# Run the application

ENTRYPOINT ["java", "-jar", "app.jar"]
