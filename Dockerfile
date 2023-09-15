FROM adoptopenjdk/openjdk11:alpine
RUN addgroup -S poc && adduser -S poc -G poc
USER poc:poc
VOLUME /tmp
ARG JAR_FILE
ADD ${JAR_FILE} /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/app.jar"]