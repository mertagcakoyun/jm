## Microsevice Product

### Endpoints: 

#### Save/Create Product

````
POST /api/product HTTP/1.1
Host: localhost:3333
Authorization:Basic base64 (username:password)
Content-Type: application/json

{
    "name":"Test",
    "price": 21.1

}
````

#### Get All Products

````
GET /api/product HTTP/1.1
Host: localhost:3333
Authorization: Basic base64 (username:password)
Content-Type: application/json

````
#### Delete Product by Product Id

````
DELETE /api/product/2 HTTP/1.1
Host: localhost:3333
Authorization: Basic base64 (username:password)
````