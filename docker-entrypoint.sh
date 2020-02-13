#!/bin/ash
exec java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar /opt/app.jar
