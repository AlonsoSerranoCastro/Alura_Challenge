# Proyecto Literatura - literAlura

![Captura de pantalla 2024-06-07 191102](https://github.com/albelizGH/literalura/assets/129092769/0b3f3a6a-ac9a-4611-abc9-07cf32917553)


Bienvenido al proyecto literAlura, una aplicación Java basada en Spring Boot que te permite gestionar libros y autores de manera eficiente y fácil. 🎉

## Descripción del Proyecto 

El proyecto literAlura está diseñado para ayudar a los amantes de la literatura a buscar, registrar y listar libros y autores. También ofrece funcionalidades avanzadas como listar autores vivos en un determinado año y listar libros por idioma.

### Funcionamiento del Programa

1. **Obtención de Datos**: El programa toma libros de la API [GutenDex](https://gutendex.com/).
2. **Conversión a Objetos Java**: Los datos obtenidos de la API se convierten en objetos Java utilizando la clase `JsonParser`.
3. **Procesamiento**: Los datos se procesan para asegurarse de que los libros y autores no se dupliquen en la base de datos.
4. **Almacenamiento**: Los libros y autores procesados se guardan en una base de datos SQL compatible (PostgreSQL, MySQL, MariaDB, SQL Server, H2).

### Desafío de Alura

Este proyecto es una solución al desafío del challenge de Alura, donde se nos retó a crear una aplicación para gestionar una base de datos de libros y autores utilizando tecnologías modernas.

## Características 

- **Buscar libro por título**: Encuentra libros por su título.
- **Listar libros registrados**: Muestra todos los libros registrados en la base de datos.
- **Listar autores registrados**: Muestra todos los autores registrados en la base de datos.
- **Listar autores vivos en un determinado año**: Encuentra autores que estaban vivos en un año específico.
- **Listar libros por idioma**: Filtra libros por su idioma.
