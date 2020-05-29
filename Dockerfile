FROM maven:latest

WORKINGDIR /app

RUN mvn install

COPY . . 

RUN mvn compile

