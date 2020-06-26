FROM java:8
VOLUME /tmp
ADD tqfframe-website-1.0-SNAPSHOT.jar app.jar
# EXPOSE 8080
# 运行jar包
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
