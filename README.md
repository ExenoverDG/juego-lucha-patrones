# Juego de Lucha con Patrones de Diseño

## README.md

# Juego de Lucha con Patrones de Diseño

Proyecto desarrollado en Java utilizando Maven, pruebas unitarias con JUnit, cobertura de pruebas con JaCoCo e integración continua con GitHub Actions.

---

# Descripción del Proyecto

Este proyecto consiste en un juego de lucha simple entre personajes. Cada personaje puede atacar utilizando diferentes estrategias de ataque y también puede ser mejorado mediante decoradores.

El objetivo principal del proyecto es aplicar:

* Patrón Strategy
* Patrón Decorator
* Pruebas unitarias
* Integración continua con GitHub Actions
* Cobertura de pruebas con JaCoCo

---

# Tecnologías Utilizadas

* Java 17
* Maven
* JUnit 5
* JaCoCo
* GitHub Actions
* Visual Studio Code / Codespaces

---

# Estructura del Proyecto

```text
src/
 ├── main/
 │    └── java/com/juego/
 │         ├── juego/
 │         ├── model/
 │         └── patrones/
 │              ├── strategy/
 │              └── decorator/
 │
 └── test/
      └── java/com/juego/juego/
```

---

# Patrones de Diseño Utilizados

## Patrón Strategy

El patrón Strategy permite cambiar dinámicamente la forma en que un personaje ataca.

### Clases principales

* EstrategiaAtaque
* AtaqueNormal
* AtaqueFuerte

### Función

Permite definir diferentes comportamientos de ataque sin modificar la clase principal del personaje.

---

## Patrón Decorator

El patrón Decorator permite agregar habilidades adicionales a un personaje.

### Clases principales

* PersonajeDecorador
* EscudoDecorador
* VenenoDecorador

### Función

Permite añadir características como escudos o veneno sin modificar la estructura base del personaje.

---

# Ejecución del Proyecto

## Compilar el proyecto

```bash
mvn compile
```

## Ejecutar pruebas

```bash
mvn clean test
```

## Ejecutar una prueba específica

```bash
mvn test -Dtest=PersonajeBaseTest
```

## Generar reporte JaCoCo

```bash
mvn jacoco:report
```

## Ver resultados detallados

```bash
cat target/surefire-reports/*.txt
```

---

# GitHub Actions

El proyecto utiliza GitHub Actions para automatizar:

* Compilación
* Ejecución de pruebas
* Generación de cobertura de código

Archivo utilizado:

```text
.github/workflows/ci.yml
```

---

# Reporte JaCoCo

El reporte HTML de cobertura se genera en:

```text
target/site/jacoco/index.html
```

Este reporte muestra:

* Cobertura de clases
* Cobertura de métodos
* Líneas ejecutadas
* Líneas no ejecutadas

---

# Autor

Anderson Garcia Amu
Ferney Maurio Montes
Exenover Díaz Girón


