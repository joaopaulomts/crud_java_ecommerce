```markdown
# 🛒 CRUD Java E-commerce - Backend

Este projeto é um backend simples para um sistema de e-commerce, desenvolvido com **Spring Boot** e **Java 21**. Ele oferece uma API RESTful para gerenciamento de produtos, com funcionalidades de **criação**, **leitura**, **atualização** e **remoção** (CRUD).

A aplicação pode ser testada facilmente com ferramentas como **Postman**, **Insomnia** ou qualquer cliente HTTP.

---

## 🚀 Tecnologias Utilizadas

- [Java 21](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)
- [Spring Boot 3.x](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Hibernate](https://hibernate.org/)
- [Lombok](https://projectlombok.org/)
- [H2 Database (ou outro configurado)](https://www.h2database.com/)
- [Maven](https://maven.apache.org/)

---

## 📁 Estrutura do Projeto

```
src/
├── main/
│   └── java/com/joaopaulo/crud_java_ecommerce/
│       ├── controllers/          # Controllers REST
│       ├── models/              # Entidades JPA
│       ├── repositories/        # Repositórios Spring Data JPA
│       ├── services/            # Regras de negócio
│       └── CrudJavaEcommerceApplication.java # Classe principal
└── test/                        # Testes unitários
```

---

## ⚙️ Como Rodar o Projeto

### 1. Pré-requisitos

- Java 21 instalado
- Maven instalado
- IDE (IntelliJ, Eclipse, VS Code...) ou terminal

### 2. Clone o repositório

```bash
git clone https://github.com/seu-usuario/crud-java-ecommerce.git
cd crud-java-ecommerce
```

### 3. Execute o projeto

Via terminal:

```bash
./mvnw spring-boot:run
```

Ou, na sua IDE, rode a classe `CrudJavaEcommerceApplication.java`

---

## 🧪 Testando a API com Postman

Base URL da API:

```
http://localhost:8080/product
```

### 📌 Endpoints disponíveis:

| Método | Endpoint             | Descrição                 |
|--------|----------------------|---------------------------|
| GET    | `/product`           | Listar todos os produtos  |
| GET    | `/product/{id}`      | Buscar produto por ID     |
| POST   | `/product`           | Criar novo produto        |
| PUT    | `/product/{id}`      | Atualizar produto por ID  |
| DELETE | `/product/{id}`      | Deletar produto por ID    |

### 📝 Exemplo de corpo (JSON) para POST/PUT

```json
{
  "name": "Notebook Dell Inspiron",
  "price": 4500.00
}
```

---

## 🧰 Banco de Dados

Por padrão, é possível usar o banco de dados H2 em memória para testes. Caso queira persistência real, configure o `application.properties` para outro banco (MySQL, PostgreSQL etc).

```properties
# application.properties (exemplo com H2)
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
```

---
