FROM openjdk:8-jdk-alpine
EXPOSE 8082
ADD target/time_sheet_DEVOPS-1.0.jar time_sheet_DEVOPS-1.0.jar
ENTRYPOINT ["java","-jar","/time_sheet_DEVOPS-1.0.jar"]