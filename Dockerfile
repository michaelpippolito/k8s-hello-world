FROM openjdk:14-jdk
WORKDIR /usr/src/hello-world
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "hello-world.jar"]
COPY ./target/hello-world-1.0.0.jar /usr/src/hello-world/hello-world.jar