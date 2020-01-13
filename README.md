## spring-boot-oauth2-example

## 수정
 - InMemory방식을 JDBC로 변경
   
 ## 요청
 - oauth/token
    - client: client
    - client-secret: client
    - username: user
    - password: test
```curl
curl -X POST \
  http://localhost:8080/oauth/token \
  -H 'Authorization: Basic Y2xpZW50OnRlc3Q=' \
  -H 'Content-Type: application/x-www-form-urlencoded' \
  -H 'Postman-Token: f48be26f-3b4e-4463-8f17-f690d0238957' \
  -H 'cache-control: no-cache' \
  -d 'username=user&password=test&grant_type=password&undefined='
```

response
```json
{
    "access_token": "253bd417-7914-4963-ba20-63cf1c345f5e",
    "token_type": "bearer",
    "refresh_token": "3637dc8b-1d95-41c6-896a-9ea90469c8b5",
    "expires_in": 2999,
    "scope": "read_profile read_posts"
}
```

- users/user
```
curl -X GET \
  http://localhost:8080/users/user \
  -H 'Authorization: Bearer 253bd417-7914-4963-ba20-63cf1c345f5e' \
  -H 'Postman-Token: 67bbe182-0dfb-406e-b352-86a9e0772862' \
  -H 'cache-control: no-cache'
```

response
```json
    [{
        "id": 1,
        "username": "keesun"
    },
    {
        "id": 4,
        "username": "user"
    }]
```

- facebook login
```
https://localhost:8080/login/facebook
```

## 레퍼런스
https://www.devglan.com/spring-security/spring-boot-security-oauth2-example

https://github.com/keesun/study