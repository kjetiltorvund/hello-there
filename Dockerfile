FROM maven:3.8-openjdk-17-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
WORKDIR /home/app

RUN echo "Building docker image" | mvn clean package -DskipTests

FROM openjdk:17-slim
LABEL maintainer="kjetiltorvund@gmail.com"
WORKDIR /usr/local/lib
COPY --from=build /home/app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]