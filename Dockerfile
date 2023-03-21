
FROM amazoncorretto:11-alpine-jdk //imagen java
MAINTAINER SAM//propietario
COPY target/sam-0.0.1-SNAPSHOT.jar sam-app.jar//va a copiar el empaquetado a github
ENTRYPOINT ["java","-jar","/sam-app.jar"] //lo primero a ejecutar