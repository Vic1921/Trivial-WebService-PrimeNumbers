FROM tomcat:9.0-alpine
LABEL maintainer="office@omilab.org"
ADD target/dummy_service_java.war /usr/local/tomcat/webapps/
EXPOSE 8080
CMD ["catalina.sh", "run"]
