FROM eclipse-temurin:21.0.1_12-jre
COPY /build/libs/tech-0.0.1-SNAPSHOT.jar /app.jar
WORKDIR /
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "/app.jar" ]


# Add app user
#ARG APPLICATION_USER=appuser
#RUN adduser --no-create-home -u 1000 -D $APPLICATION_USER

# Configure working directory
#RUN mkdir /app && \
#    chown -R $APPLICATION_USER /app

#USER 1000

#COPY --chown=1000:1000 ./myapp-0.0.1-SNAPSHOT.jar /app/app.jar
#WORKDIR /app

#EXPOSE 8080
#ENTRYPOINT [ "java", "-jar", "/app/app.jar" ]