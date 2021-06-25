FROM openjdk:8
EXPOSE 8888
ADD target/dockerspringboot.jar dockerspringboot.jar
ENTRYPOINT ["java", "-jar", "dockerspringboot.jar"]

#docker build -f Dockerfile -t dockerspring .
#docker images
#docker run -p8888:8888 e2284e1e5baa