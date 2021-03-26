## Branch: VB-100
- This branch demo connect between java spring boot and postgrest sql
## Branch: VB-101
- Demo without connect to database
- Step by step to deploy docker
  - Package java
  - build image: docker build -t springio/gs-spring-boot-docker .
  - run container: docker run -d -p 8081:8081 --name spring-boot spring-boot-docker
  - check result: http://localhost:8081/api/locations