FROM maven:latest

WORKDIR /mancala-java

COPY . . 

RUN mvn install

RUN mvn compile

