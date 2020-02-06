FROM openjdk:8-alpine

ENV JAVA_OPTS="-Xmx256m -Xms256m"

COPY target/demo*.jar /opt/app.jar
COPY docker-entrypoint.sh /docker-entrypoint.sh

EXPOSE 8080

ENTRYPOINT ["/docker-entrypoint.sh"]