FROM openjdk:11
EXPOSE 8081
ADD login_service/target/login-service-api.jar login-service-api.jar
ENTRYPOINT ["java", "-jar", "/login-service-api"]