# Teste de Persistencia Automática - Spring Boot

Este projeto é um exemplo básico de uma aplicação Spring Boot utilizando JPA para persistência de dados e o banco de dados H2 configurado para modo FILE, garantindo a persistência dos dados.

## Tecnologias Utilizadas
- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **H2 Database**

## Como Executar o Projeto

### 1. Criar o Projeto Spring Boot
Crie o projeto no [Spring Initializr](https://start.spring.io/) com as seguintes dependências:
- Spring Data JPA
- H2 Database

Baixe o arquivo `.zip` gerado e importe para sua IDE de preferência.

### 2. Configurar o Banco de Dados H2
Edite o arquivo `src/main/resources/application.properties` para configurar o banco de dados H2 em modo FILE:

```properties
spring.application.name=TestePersisitencia

spring.datasource.url=jdbc:h2:mem:testes
spring.jpa.hibernate.ddl-auto=create-drop
