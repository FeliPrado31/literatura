# 📚 LiterAlura - Catálogo de Libros

¡Bienvenido a **LiterAlura**! Una aplicación de catálogo de libros desarrollada en Java con Spring Boot. Aquí puedes buscar libros, explorar autores y descubrir obras en diferentes idiomas. ¡Sumérgete en el mundo de la literatura con esta herramienta fácil de usar! 🚀

---

## 🌟 **Sobre el Proyecto**

**LiterAlura** es una aplicación que te permite explorar un catálogo de libros utilizando la API gratuita de [Gutendex](https://gutendex.com/). Con esta herramienta, puedes:

- Buscar libros por título.
- Explorar autores y sus obras.
- Filtrar libros por idioma.
- Descubrir autores que vivieron en un año específico.

¡Todo esto mientras mantienes un registro de tus libros favoritos en una base de datos! 🗃️

---

## 🛠️ **Tecnologías Utilizadas**

Este proyecto fue desarrollado utilizando las siguientes tecnologías y herramientas:

- **Lenguaje de Programación**: Java ☕
- **Framework**: Spring Boot 🌱
- **Base de Datos**: PostgreSQL 🐘
- **API Externa**: [Gutendex](https://gutendex.com/) 📡
- **Gestión de Dependencias**: Maven 🛠️
- **IDE**: IntelliJ IDEA 🖥️

---

## ⚙️ **Funcionalidades**

### 1. **Buscar Libro por Título** 🔍
- Ingresa el título de un libro y la aplicación buscará en la API de Gutendex.
- Si el libro no está registrado en la base de datos, se guardará automáticamente.

### 2. **Listar Libros Registrados** 📖
- Muestra todos los libros que has guardado en la base de datos.

### 3. **Listar Autores Registrados** 👤
- Explora la lista de autores que han sido registrados junto con sus libros.

### 4. **Buscar Autores Vivos en un Año Específico** 🎂
- Ingresa un año y descubre qué autores estaban vivos en ese momento.

### 5. **Listar Libros por Idioma** 🌍
- Filtra los libros por idioma (por ejemplo, "es" para español, "en" para inglés).

---

## 🚀 **Cómo Ejecutar el Proyecto**

Sigue estos pasos para ejecutar **LiterAlura** en tu entorno local:

1. **Clona el Repositorio**:
   ```bash
   git clone https://github.com/feliprado/literatura.git
   ```

2. **Configura la Base de Datos**:
    - Asegúrate de tener PostgreSQL instalado y en ejecución.
    - Crea una base de datos llamada `literalura`.
    - Configura las credenciales en el archivo `application.properties`.

3. **Compila y Ejecuta el Proyecto**:
    - Abre el proyecto en IntelliJ IDEA o tu IDE favorito.
    - Ejecuta la clase `LiterAluraApplication` para iniciar la aplicación.

4. **Usa la Aplicación**:
    - Sigue las instrucciones en la consola para explorar las funcionalidades.

---

## 📂 **Estructura del Proyecto**

El proyecto está organizado de la siguiente manera:

```
literalura/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── alura/
│   │   │           └── LiterAlura/
│   │   │               ├── model/          # Entidades (Autor, Libro)
│   │   │               ├── repository/     # Repositorios (AutorRepository, LivroRepository)
│   │   │               ├── service/        # Lógica de negocio (ConsumoApi, ConverteDados)
│   │   │               ├── principal/      # Menú principal (Principal.java)
│   │   │               └── LiterAluraApplication.java
│   │   └── resources/                      # Configuración (application.properties)
│   └── test/                               # Pruebas unitarias
└── README.md
```

---

## 📝 **Licencia**

Este proyecto fue desarrollado por [FeliPrado](https://github.com/feliprado31) como parte del desafío **Praticando Spring Boot: Challenge LiterAlura**. 🎓



---

¡Gracias por visitar **LiterAlura**! Espero que disfrutes explorando el mundo de los libros con esta aplicación. 📖✨

--- 
