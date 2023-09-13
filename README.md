## Build
```bash
./mvnw clean package
```

## Run

```bash
java -jar target/text4shell-0.0.1-SNAPSHOT.jar --server.port=80
```

## Go to web browser
```
http://localhost
```

-----

## To do:
- Make simple UI for index.html
- Develop microservice route to return record/generate record
- Make vulnerable with .replace(payload) call somewhere in the service.
- Potentially send back html with the payload in it where usually a record would be returned.

------
### Refs:
- https://stackoverflow.com/questions/38700790/how-to-return-an-html-page-from-a-restful-controller-in-spring-boot
- https://www.sqlitetutorial.net/sqlite-java/select/