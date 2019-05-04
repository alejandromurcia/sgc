FROM openjdk:8-jdk-alpine
EXPOSE 8080
VOLUME /tmp
COPY /target/sgc-0.0.1-SNAPSHOT.jar sgc-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","sgc-0.0.1-SNAPSHOT.jar"]