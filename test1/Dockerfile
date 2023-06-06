FROM openjdk:11.0.5

COPY test1-0.0.1-SNAPSHOT.jar test1-0.0.1-SNAPSHOT.jar
ENV application_properties /usr/local/conf/application.yaml
ENV GIT_SSL_NO_VERIFY true
CMD /bin/sh -c "java $JAVA_OPTS -jar test1-0.0.1-SNAPSHOT.jar"