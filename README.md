# SpringBoot

## Run : ./mvnw spring-boot:runG

### Add a sport : POST : http://localhost:8080/sports
Directly in Postman (Body>Raw>JSON) : 
```
{
    "id": 1,
    "name": "Skiing",
    "description":"On your skis, these longs and narrows kinds of skates, you can practice several disciplines that will transport you, for fun or during competitions, in the heart of the most beautiful winter landscapes. You’ll be able to ride down the hills at a fast pace and execute controlled turns, allowing you to take fresh air and strengthen your cardiovascular system. Have a fun ride!"
}
```

### Get all sports : GET : http://localhost:8080/sports

### Get a sport : GET : http://localhost:8080//sports/{sportId}

![](https://i.ibb.co/DbNhyk2/te-le-chargement-1.png)

Inspired by : https://sports.api.decathlon.com/sports/natation
