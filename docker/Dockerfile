FROM openjdk:8-jdk-alpine

EXPOSE 8080

ARG JAR_FILE=target/*.jar
ARG PROFILE=qa
ENV PROFILE="${PROFILE}"

WORKDIR /app

COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]

CMD ["--spring.profiles.active=${PROFILE}"]