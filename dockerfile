FROM anapsix/alpine-java
MAINTAINER spain 
COPY ./target/tictactoe-0.0.1-SNAPSHOT.jar /home/tictactoe-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "tictactoe-0.0.1-SNAPSHOT.jar"]