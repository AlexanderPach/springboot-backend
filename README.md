# Cat Backend API
Hello! Welcome to my Backend API I made that is made to populate itself with Cat Oriented Objects. 

The technologies used in this project were :
<b> Spring Boot, Spring Data JPA, Java, Hibernate, and MySQL </b>

Optionally I ran this through POSTMAN to test CRUD functionality. You may choose whichever API tools fits you. 

<img src="https://i.imgur.com/3jzThNe.jpg">

<h2> Requirements </h2>
Although all the dependencies are ran through Maven, you will still need to connect a MYSQL database that can connect to the server.




<h2> Directory Root</h2>

```
.
├── SpringbootBackendApplication.java
├── controller
│   ├── CatController.java
│   └── getErrorController.java
├── exception
│   ├── SourceNotFoundException.java
│   └── UnknownObjectException.java
├── model
│   └── Cat.java
├── repository
│   └── CatRepository.java
└── service
    ├── CatService.java
    └── impl

```
