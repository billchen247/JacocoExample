FROM eclipse-temurin:21-jdk-jammy

VOLUME /tmp

COPY target/JacocoExample-0.0.2-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar", "/app.jar"]
