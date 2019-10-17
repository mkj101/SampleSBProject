# Getting Started

### Guides
The following guides illustrates how to use certain features concretely:

* [Caching Data with Spring](https://spring.io/guides/gs/caching/)
* [Accessing JPA Data with REST](https://spring.io/guides/gs/accessing-data-rest/)
* [Accessing Neo4j Data with REST](https://spring.io/guides/gs/accessing-neo4j-data-rest/)
* [Accessing MongoDB Data with REST](https://spring.io/guides/gs/accessing-mongodb-data-rest/)

##Swagger: is a specification for documenting REST API.
Dependencies added:
* (io.springfox : springfox-swagger2) 
* (io.springfox : springfox-swagger-ui) 
--- SwaggerConfiguration class is configured to consider all controller classes and rest APIs in swagger

##Swagger UI is accessible from link:  http://localhost:8080/swagger-ui.html

##H2- in memory database is used to test application with some test data without setting up actual Database
Dependency added:
**	(com.h2database : h2 : runtime)
-- On application start, Spring-boot automatically connects with H2 database, "spring-boot-auto-configuration"
H2-in memory DB can be accessed via below link
#H2 console Link: http://localhost:8080/h2-console
Set JDBC URL as : jdbc:h2:mem:testdb

Put a data.sql file in "src/main/resources". Write some insert queries, Next time when you start the application
you will see these values already available in the H2- in memory DB.

##AOP: Aspect oriented programming

@ASpect & @configuration is added in loggingAspect.java class.
@Around Advice is used to log all the information

	

##@OneTOMany 

### SpringSecurity Added
@EnabledWebSecurity
Security is configured on http request



