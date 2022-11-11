# 게시판 만들기

## 사용된 기술

- Spring Boot
- Spring MVC
- Spring JDBC
- MYSQL - SQL
- thymeleaf 템플릿 엔진

## 아키텍처 

```
                     Spring Core
                     Spring MVC                   Spring JDBC    MySQL
브라우저 ---- 요청 ---> Controller ----> Service ----> DAO ----> DB
        <--- 응답 --- 템플릿 <---           <----         <----
                      <------------ layer간에 데이터 전송은 DTO -->
```

## 게시판 만드는 순서

1. Controller와 템플릿
2. Service - 비지니스 로직을 처리 (하나의 트랜잭션 단위)
3. Service는 비지니스로직을 처리하기위해 데이터를 CRUD 하기위해 DAO를 사용

