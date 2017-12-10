FROM openjdk:8
ADD target/microservices-server-admin.jar microservices-server-admin.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=local","microservices-server-admin.jar"]


#docker build -f Dockerfile -t server-admin .
#docker images
#docker run -p 8082:8082 server-admin
#docker rmi -f <imageId>

#docker container ls
#docker inspect <container ID>




