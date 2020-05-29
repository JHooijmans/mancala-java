FROM maven:latest

RUN mvn install

COPY . . 

RUN mvn compile

