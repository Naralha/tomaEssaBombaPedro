# FROM maven:3.5.2-jdk-9 AS build
FROM maven:3-openjdk-11 AS build

COPY ./src /usr/src/app/src
ENV X=1
COPY ./pom.xml /usr/src/app
RUN mvn -f /usr/src/app/pom.xml clean install

FROM maven:3-openjdk-11
COPY --from=build /usr/src/app/target/teste-java-1.0-SNAPSHOT.jar teste-java.jar 
EXPOSE 8080
CMD ["java","-jar","/teste-java.jar"]