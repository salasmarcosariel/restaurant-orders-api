Restaurant Orders API

API REST desarrollada en Java con Spring Boot para la gestión de pedidos de un restaurante.

El proyecto implementa autenticación segura mediante JWT, creación y consulta de pedidos, y una arquitectura backend limpia basada en buenas prácticas.

🚀 Funcionalidades

Registro y autenticación de usuarios

Autenticación mediante JWT

Creación de pedidos asociados al usuario autenticado

Consulta de pedidos del usuario

Endpoints REST protegidos

Respuestas limpias mediante DTOs

Documentación automática con Swagger / OpenAPI

🛠️ Tecnologías utilizadas

Java

Spring Boot

Spring Security

JWT (JSON Web Tokens)

Spring Data JPA

Hibernate

PostgreSQL

Maven

Swagger / OpenAPI

📦 Endpoints principales
Autenticación

POST /api/auth/register → Registro de usuario

POST /api/auth/login → Login y obtención de token JWT

Pedidos

POST /api/orders → Crear un pedido

GET /api/orders/my → Ver pedidos del usuario autenticado

▶️ Ejecución del proyecto

Clonar el repositorio

Configurar la conexión a la base de datos en application.yml

Ejecutar la aplicación

Acceder a Swagger en:

http://localhost:8081/swagger-ui.html

🔐 Autenticación

Los endpoints protegidos requieren un token JWT.

Pasos:

Realizar login en /api/auth/login

Copiar el token devuelto

Enviar el token en las peticiones como header:

Authorization: Bearer TU_TOKEN_AQUI


En Swagger, el token se puede introducir desde el botón Authorize.

📌 Notas técnicas

Este proyecto demuestra:

Separación entre entidades y DTOs

Uso de autenticación JWT

Control de acceso mediante Spring Security

Modelado de relaciones con JPA

Diseño correcto de una API REST backend

👤 Autor

Marcos Salas
Backend Developer | Java & Kotlin | APIs | SQL

LinkedIn: [MarcosSalas](https://www.linkedin.com/in/desarrolladormarcossalas/)
