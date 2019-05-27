# quarkus-restful-webservice
Example code for the Blog-Post [RESTful Webservices mit Quarkus](https://blog.codecentric.de/?p=67699&preview=true)

Zum starten wird eine laufende PostgreSQL-Instanz benötigt. Diese kann z.B. über Docker gestartet werden: 
```
docker run -e POSTGRES_PASSWORD=securePassword -e POSTGRES_USER=postgres -e POSTGRES_DB=quarkus-shoppinglist -d -p 5432:5432 postgres
```

Anschließend kann die Anwendung über Maven gestartet werden: 

```
./mvnw compile quarkus:dev
```