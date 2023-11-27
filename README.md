# Old man's demo

## Requirements
- Java 17
- Maven

## Build and Dockerize

```
mvn install package
docker build --build-arg "JAR_FILE=target/*.jar" -t myorg/myapp .


docker run -p 8080:8080  myorg/myapp
```
