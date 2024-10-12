FROM openjdk:17-alpine
EXPOSE 8080
ADD target/springboot-mysql-k8s.jar springboot-mysql-k8s.jar
ENTRYPOINT ["java","-jar","/springboot-mysql-k8s.jar"]