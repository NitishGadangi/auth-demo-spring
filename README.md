# auth-demo-spring
Demo Auth Api using Spring Boot
> APIController - end points handler\
> AuthService - Business logic for Authentication\
> CredentialsRepo - Repository to handle credentaial storage

### SignUp request
POST : `http://localhost:8080/sign-up`

**Request Body**

    {
    "name": "Nitish",
    "email": "nitishgadangi@gmail.com",
    "password": "Hello@01"
    }
**email regex** : anystring@anystring.anystring

**password regex** : Minimum eight characters, at least one uppercase letter, one lowercase letter, one number and one special character

**Response**

    {
    "success": true
    }

### SignIn Request
POST : `http://localhost:8080/sign-in`

**Request Body**

    {
    "email": "nitishgadangi@gmail.com",
    "password": "Hello@01"
    }
    
**Response**

    {
    "success": true
    }


### Clean data of all credentials
POST : `http://localhost:8080/clean`
