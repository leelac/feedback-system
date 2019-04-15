FROM java:8
EXPOSE 8888
ARG JAR_FILE=target/feedback-system-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} feedback-system.jar
ENTRYPOINT ["java", "-jar", "feedback-system.jar"]