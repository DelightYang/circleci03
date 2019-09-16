FROM openjdk:8-jdk

ADD ./target/circleci03-0.0.1-SNAPSHOT.jar circleci03.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "circleci03-0.0.1-SNAPSHOT.jar"]