FROM openjdk:10-jdk
MAINTAINER Eugene Wang <eugenewyj79@gmail.com>

VOLUME /tmp

# Add the service itself
ARG JAR_FILE
COPY ${JAR_FILE} /usr/share/configserver/app.jar

ARG CONFIG_DIR
COPY ${CONFIG_DIR} /usr/share/configserver/config

ENTRYPOINT ["java","-Dspring.profiles.active=docker","-jar","/usr/share/configserver/app.jar"]