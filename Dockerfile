FROM amazoncorretto:8-alpine-jdk
MAINTAINER SAM
COPY target/sam-0.0.1-SNAPSHOT.jar samApp.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/samApp.jar"]