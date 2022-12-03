# syntax=docker/dockerfile:1
FROM openjdk:8-jdk-alpine
EXPOSE 8012
ADD ./target/dubbo-consumer-0.0.1-SNAPSHOT.jar /app/
ENTRYPOINT ["java","-jar","/app/dubbo-consumer-0.0.1-SNAPSHOT.jar"]
MAINTAINER zhuoli02 zhuoli02forev`er@163.com