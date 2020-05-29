FROM maven:latest

WORKDIR /app

RUN mvn install

COPY . . 

RUN mvn compile

