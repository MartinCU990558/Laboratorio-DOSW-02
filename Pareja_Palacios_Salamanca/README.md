# Laboratorio-DOSW-02


**Integrantes:**
- Daniel Palacios
- David Salamanca

**Nombre de la rama:** feature/PalaciosDaniel_SalamancaDavid_2025-2

---

## Configuración Repositorio
**Evidencia:**
- Configuración Correo Eletrónico en Repositorio Local:
    
    ![Evidencia Paso Correspondiente](img/1.png)

- Clonar el Repositorio

    ![Evidencia Paso Correspondiente](img/2.png)

- Creacion de Rama de Principal

    ![Evidencia Paso Correspondiente](img/3.png)

- Push

    ![Evidencia Paso Correspondiente](img/4.png)

- Validación de la Estructura Creada

    ![Evidencia Paso Correspondiente](img/5.png)

---

## Reto 1
**Evidencia:**

- Codigo Reto 1

    ![Evidencia Paso Correspondiente](img/Codigo1.png)

- Resultado Reto 1

    ![Evidencia Paso Correspondiente](img/Resp1.png)

## Reto 2
**Evidencia:**

### Primer Choque

- Implementaciones iniciales para las ramas de cada estudiante

    ![Evidencia Paso Correspondiente](img/6.png)

- Conflicto generado al momento de hacer merge

    ![Evidencia Paso Correspondiente](img/7.png)

- Configuración de archivo resultante en el merge que genero conflictos para el primer choque

    ![Evidencia Paso Correspondiente](img/8.png)

### Segundo Choque

- Implementaciones iniciales para las ramas de cada estudiante
    
    ![Evidencia Paso Correspondiente](img/9.png)

- Conflicto generado al momento de hacer merge

  ![Evidencia Paso Correspondiente](img/10.png)

- Resultado Implementación

  ![Evidencia Paso Correspondiente](img/11.png)

### Tercer Choque e Implementación Final

- Resultado Implementación Final - Junto al Log

  ![Evidencia Paso Correspondiente](img/12.png)

  ![Evidencia Paso Correspondiente](img/13.png)

## Reto 3
**Evidencia:**

- Implementación Inicial

  ![Evidencia Paso Correspondiente](img/14.png)

- Resultado implementación después de solucionar conflictos de merge

  ![Evidencia Paso Correspondiente](img/15.png)

## Reto 4
**Evidencia:**

- Implementación inicial en sus ramas correspondientes

  ![Evidencia Paso Correspondiente](img/16.png)
  ![Evidencia Paso Correspondiente](img/17.png)

- Implementación actualizada según instrucciones dadas

  ![Evidencia Paso Correspondiente](img/18.png)
  ![Evidencia Paso Correspondiente](img/19.png)

- Implementación completa después de merge

  ![Evidencia Paso Correspondiente](img/20.png)

---

## Cuestionario
1. **Cúal es la diferencia entre git merge y git rebase**

   La diferencia del merge y el rebase es que el merge toma lo que hay en otra Branch junto a todo el historial de commits de esa branch y lo une con lo que está en la Branch actual mientras que rebase es tomar lo que hay en otra rama y aplicarla a la actual, pero este lo que hace es reaplicar los commits de una rama sobre otra y así creando un historial lineal

2. **Si dos ramas modifican la misma línea de un archivo ¿Qué sucede al hacer merge?**

   Cuando dos ramas modifican la misma línea de un archivo se crea un conflicto entre las dos ramas por lo que cuando se realiza el merge toda realizar una adecuación del código ya sea reordenando las dos ramas o eligiendo una de las dos implementaciones que generan conflicto y obviando la otra.

3. **¿Cómo puedes ver gráficamente el historial de merges y ramas en consola?**

   Puedes visualizar gráficamente el historial de commits, merges y ramas en la consola usando el comando git log con diferentes opciones como:  git log --oneline --graph –all o git log --oneline --graph --all --decorate

4. **Explica la diferencia entre un commit y un push?**

   Realizar un commit es declarar un cambio dentro del repositorio local, pero al realizar el push este actualiza también con los mismos cambios el repositorio remoto

5. **Para que sirve git stash y git pop?**

   El git stash sirve para guardar temporalmente cambios que no se les han realizado commits para poder realizar cambios sin perder lo trabajado previamente, por otra parte, el git pop sirve para recuperar los cambios guardados mas recientemente en el stash y aplicarlos en el directorio actual.

6. **¿Qué diferencia hay entre HashMap y HashTable?**

   La diferencia principal entre HashMasp y HashTable es que HashMap es más rápido, pero no es muy optimo en multi hilo mientras que el HashTable es más lento, pero todos sus métodos están sincronizados por lo que es seguro de usar para entornos multi hilo.

7. **¿Qué ventajas tiene Collectors.toMap() frente a un bucle tradicional para llenar un mapa?**

   Tiene varias ventajas usar Collectors.toMap() entre estas están: permite una mejor legibilidad en el código, permite un mejor manejo de duplicados, permite la personalización del tipo de mapa, permite crear mapas inmutables de manera directa y permite formas de optimización mediante streams.

8. **¿Si usas List con objetos y luego aplicas stream().map() que tipo de operación estas haciendo?**

   Al usar estas operaciones en ese orden la operación que se están realizando es mapeo o transformación sobre los elementos del stream.

9. **¿Que hace el método stream().filter() y que retorna?**

   El metodo stream().filter() es una operación intermedia  de streams de java que se usa para filtrar elementos en un stream basándose en una condición especifica dada y retorna un stream con los elementos que se filtraron que cumplen la condición dada.

10. **Describe el paso a paso de cómo crear una rama desde develop si es una funcionalidad nueva.**

    El paso a paso para crear una rama desde develop si es una funcionalidad nueva es el siguiente:

    - Sincronizar con el Repositorio Remoto

    - Crear la Nueva Rama usando como convención feature/descripción_breve _de_la_funcion

    - Desarrollar la Funcionalidad

11. **¿Cuál es la diferencia entre crear una rama con git branch y con git checkout -b?**

   La diferencia entre crear una rama con git Branch es que esto la crea, pero no interactúas con ella después mientras que con git checkout -b creas la rama y después de crearla le realizas checkout para poder así realizar cambios directamente después de su creación.

12. **¿Por qué es recomendable crear ramas feature/ para nuevas funcionalidades en lugar de trabajar en main directamente?**

   Esto es recomendable debido a que permite primero una mejor organización dentro de ambiente de trabajo y por otra parte permite una mayor facilidad para experimentar con nuevas funcionalidades sin afectar el funcionamiento de la rama principal la cual se espera que sea la mas estable