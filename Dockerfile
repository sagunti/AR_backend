
FROM amazoncorretto:11-alpine-jdk 
MAINTAINER SAM
COPY target/sam-0.0.1-SNAPSHOT.jar sam-app.jar
ENTRYPOINT ["java","-jar","/sam-app.jar"] 