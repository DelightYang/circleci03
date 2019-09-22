FROM openjdk:8-jdk

#container预设目录
WORKDIR /app
# 注意中间有空格
ADD ./target/circleci03-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "circleci03-0.0.1-SNAPSHOT.jar"]