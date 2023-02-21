FROM adoptopenjdk/openjdk11:alpine-jre

# cd /opt/app
WORKDIR /app

# cp target/spring-boot-web.jar /opt/app/app.jar
COPY target/repository-svc-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8081

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","app.jar"]