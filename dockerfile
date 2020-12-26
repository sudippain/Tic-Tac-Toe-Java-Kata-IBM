FROM java:8-jre
WORKDIR usr/src
ADD ./target/tictactoe-0.0.1-SNAPSHOT.jar /usr/src/tictactoe-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "tictactoe-0.0.1-SNAPSHOT.jar"]