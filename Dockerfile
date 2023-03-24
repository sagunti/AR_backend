FROM amazoncorretto:11-alpine-jdk 
MAINTAINER SAM
COPY target/sam-0.0.1-SNAPSHOT.jar sam-app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/sam-app.jar"] 