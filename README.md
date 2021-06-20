# BackendExam

use "docker-compose up -d"  to create database 

login API to generate token  : localhost:8080/api/v1/authenticate/login
{
    "username": "itzy",
    "password": "notshy"
}

paste token to header key = "Authorization" , value = "token=(generate token)"

retrieving all employee : GET localhost:8080/api/v1/employee/list
retrieving one employee by ID : GET localhost:8080/api/v1/employee/{id}
saving one employee : POST localhost:8080/api/v1/employee reqest body 
modifying one employee : PUT localhost:8080/api/v1/employee/update/{id} request body
deleting one employee by ID : DEL localhost:8080/api/v1/employee/delete/{id}

request body :
{
    "name": " ",
    "positionJob": " ",
    "email": " ",
    "salary": 0.00
}
