FROM amazoncorretto:17-alpine-jdk

COPY target/clave_compas-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]

EXPOSE 8080
