# syntax=docker/dockerfile:1
FROM openjdk:8-jdk-alpine
EXPOSE 8011
ADD ./target /app/
ENTRYPOINT ["java","-jar","/app/dubbo-provider-0.0.1-SNAPSHOT.jar"]
MAINTAINER zhuoli02 zhuoli02forever@163.com