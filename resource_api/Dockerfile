FROM openjdk:11
EXPOSE 8082
ADD resource_api/target/resource-api.jar resource-api.jar
ENTRYPOINT ["java", "-jar", "/resource-api.jar"]