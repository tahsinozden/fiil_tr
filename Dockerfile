FROM openjdk:11

CMD mkdir -p /app
WORKDIR /app
COPY target/*.jar .
EXPOSE 8080:8080

ENTRYPOINT ["java", "-jar", "fiil_tr.jar"]