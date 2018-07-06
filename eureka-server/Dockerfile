FROM openjdk:10-jdk
MAINTAINER Eugene Wang <eugenewyj79@gmail.com>

VOLUME /tmp

# Add the service itself
ARG JAR_FILE
COPY ${JAR_FILE} /usr/share/eurekaserver/app.jar

ENTRYPOINT ["java","-jar","/usr/share/eurekaserver/app.jar"]