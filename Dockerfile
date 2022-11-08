FROM openjdk:11
WORKDIR /opt/codingchallendge-service

ARG JAR_FILE=./target/codingchallenge-0.0.1.jar
COPY ${JAR_FILE} /opt/codingchallendge-service/dictionary-service.jar

EXPOSE 3000

ENTRYPOINT exec java -jar /opt/codingchallendge-service/dictionary-service.jar
