# microservices-spring
Projeto microservices-spring, colocando em prática estudos do ecossistema Microserviços com Java Spring Cloud.

#### Estruturando um sistema de microsserviços Java com Spring Boot e Spring Cloud. Sistema composto por vários microsserviços que comunicam entre si de forma transparente, escalável e com balanceamento de carga. Os microsserviços são registrados em um "Discovery Server" (Eureka), de modo que a comunicação entre eles é feita pelo nome do microsserviço. Além disso, as requisições são feitas em um API Gateway (Zuul), responsável por rotear e autorizar as requisições.

## Etapas do Desenvolvimento:

- Feign para requisições de API entre microsserviços
- Ribbon para balanceamento de carga
- Servidor Eureka para registro dos microsserviços
- API Gateway Zuul para roteamento e autorização
- Hystrix para tolerância a falhas
- OAuth e JWT para autenticação e autorização
- Servidor de configuração centralizada com dados em repositório Git
- Geração de containers Docker para os microsserviços e bases de dados
- Chamadas de API entre microsserviços por meio de clientes Feign
- Roteamento transparente de microsserviços com Zuul API Gateway
- Configuração centralizada por meio de um servidor de configuração
- Autenticação e autorização compartilhada por meio do API Gateway, usando Oauth e JWT

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
- Discovery Server Eureka
- API Gateway Zuul
- Config Server
- Feign
- Ribbon
- Hystrix
- MySQL
- OAuth
- JWT
- Spring Security
- H2


# Como executar o projeto

## Back end
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/uevitondev/microservices-spring

# entrar na pasta do projeto back end
cd microservices-spring

# executar o projeto
./mvnw spring-boot:run
```

# Autor

Uéviton Assunção Santos

www.linkedin.com/in/uevitondev
