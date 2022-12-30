FROM maven:3.8.2-jdk-11 AS build
COPY . .
RUN mvn clean package -DskipTests


#FROM openjdk:20
FROM amazoncorretto:19
#ADD webapp-0.0.1-SNAPSHOT.jar webapp-0.0.1-SNAPSHOT.jar
COPY --from=build webapp-0.0.1-SNAPSHOT.jar webapp-0.0.1-SNAPSHOT.jar
EXPOSE 8080
#ENV PORT=8080
ENTRYPOINT ["java", "-jar", "webapp-0.0.1-SNAPSHOT.jar"]