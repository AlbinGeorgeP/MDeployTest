FROM openjdk:21
EXPOSE 8080
ENV DBHOST 172.17.0.2
ENV DBPORT 3306
ADD target/MDeployTest.jar MDeployTest.jar
ENTRYPOINT ["java","-jar","MDeployTest.jar"]
