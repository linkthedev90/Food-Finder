#FROM openjdk:20
FROM amazoncorretto:19
ADD webapp-0.0.1-SNAPSHOT.jar webapp-0.0.1-SNAPSHOT.jar
#COPY --from=build webapp-0.0.1-SNAPSHOT.jar webapp-0.0.1-SNAPSHOT.jar
EXPOSE 8080
#ENV PORT=8080
ENTRYPOINT ["java", "-jar", "webapp-0.0.1-SNAPSHOT.jar"]