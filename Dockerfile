FROM openjdk:23
LABEL manteiner = "laboratorio.net"
ADD target/demo-docker-render-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]