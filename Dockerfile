FROM java:8
ADD target/server-admin.jar server-admin.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=local","server-admin.jar"]


#docker build -f Dockerfile -t server-admin .
#docker images
#docker run -p 8082:8082 server-admin
#docker rmi -f <imageId>

#docker container ls
#docker inspect <container ID>




