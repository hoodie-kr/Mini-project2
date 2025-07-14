# 🍜 컵라면 키오스크

Spring Boot + MyBatis 기반 컵라면 자판기 키오스크 프로그램입니다.

## 실행 방법

1. `application.yml`의 DB 접속 정보 확인
2. MySQL에 `kioskdb` DB 생성 및 ramen 테이블 구성
3. 아래 명령어 실행

```bash
./gradlew bootRun
```

## API 명세

Swagger UI: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)