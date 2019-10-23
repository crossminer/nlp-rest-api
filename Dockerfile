FROM openjdk:8-jre-slim
VOLUME /tmp
ARG JAR_FILE
COPY /target/ehu-nlp-rest_api.jar ehu-nlp-rest_api.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","ehu-nlp-rest_api.jar"]