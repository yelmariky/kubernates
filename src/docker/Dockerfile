#### Stage 1: Build the application
FROM openjdk:8-jdk-alpine

# Set the current working directory inside the image
WORKDIR /app

VOLUME /tmp



COPY *.jar kubernates.jar

##ENTRYPOINT ["java","-jar","/kubernates.jar"]

##ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=prod","-jar","/backend-event.jar"]
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","kubernates.jar"]

## docker build . -t event/backend:v1