FROM openjdk:11
EXPOSE 8080
ADD gateway/target/gateway-api.jar gateway-api.jar
ENTRYPOINT ["java", "-jar", "/gateway-api.jar"]