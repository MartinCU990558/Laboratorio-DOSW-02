# Maratón Git 2025-2

**Integrantes:**

- Elizabeth Correa 
- Juan Pablo Contreras


**Nombre de la rama:** feature/CorreaElizabeth_ContrerasJuan_2025-2

---

## Retos Completados

### Reto 1: Configuración y creación de rama

### Objetivo
- Crear un mensaje de bienvenida usando **programación funcional** en Java:
  - Estructura de datos: `List<Student>`
  - Operaciones: `stream()`, `map()`, `collect(Collectors.joining())`

### Flujo de ramas
- **Rama del reto:** `feature/CorreaElizabeth_ContrerasJuan_2025-2`.

### Lo que hicimos
- **Modelo `Student`**: nombre, correo, edad, semestre (getters simples).
- **Mensaje `Message.print(List<Student>)`**:
  - Con `stream().map()` formateamos cada estudiante como  
    `"<Nombre> estudiante de la escuela de <Semestre> de <Edad> años"`.
  - Unimos con `Collectors.joining(" y ")` para producir una sola frase.
  - Repetimos el patrón para los **correos** y los unimos con `" y "`.
- **Ejecución en `Main`**:
  - Construimos `List<Student>` con los dos integrantes.
  - Llamamos `new Message().print(estudiantes)` y mostramos el resultado.
  
**Evidencia:**
![Captura](imagenes/captura1.png)
Output obtenido tras correr el programa
![Captura](imagenes/captura2.png)
Código: se creó la clase estudiante y la clase mensaje. La clase estudiante tiene los atributos de nombre, edad, correo y semestre. Se hicieron métodos get de cada atributo. La clase mensaje utiliza el stream, map y collect.


🏁 Reto #2: Carrera en Paralelo

En este reto simulamos una carrera de commits donde cada integrante tomó su propio carril de desarrollo (subrama), pero ambos partimos desde la misma línea de salida (la rama feature/reto2).

El objetivo fue practicar la colaboración en paralelo, resolución de conflictos y uso de expresiones lambda en Java, mientras íbamos uniendo resultados en un mismo código final.

📌 Enunciado

Estudiante A

Cambió el nombre del archivo de Reto2.java a CarreraParalela.java.

Subió la estructura base de la clase al feature del reto (feature/reto2).

Ambos

Crearon sus subramas:

feature/reto2_carril_uno

feature/reto2_carril_dos

Estudiante B (Carril 1)

Implementó con lambda una función para calcular el número máximo de una lista.

Estudiante A (Carril 2)

Implementó con lambda una función para calcular el número mínimo y obtener la cantidad de datos.

Primer Choque (Merge Conflict)

Ambos crearon una función con el mismo nombre para procesar la lista.

Se resolvió el conflicto combinando: mínimo, máximo y cantidad en un objeto Resultado.

Segunda Vuelta

Carril 1 añadió si el número mayor era múltiplo de 2 (if ternario).

Carril 2 añadió si el número mayor era divisor de 2 (if ternario).

Tercer Choque

Carril 1 añadió validación de si la cantidad era par (if ternario).

Carril 2 añadió validación de si la cantidad era impar (if ternario).

Se resolvió el merge integrando ambas verificaciones.

Gran Meta (Función Final)

Se fusionaron todas las funciones en una que recibe dos listas y devuelve un objeto Resultados con:

Número mayor por lista

Número menor por lista

Cantidad de elementos por lista

Si el mayor es múltiplo/divisor de 2

Si la cantidad es par o impar

Se hizo commit final y merge de las ramas carril a feature/reto2.

## Reto 3 -- El eco misterioso

En este reto trabajamos en equipo para simular el extraño comportamiento de una cueva que devuelve un eco “especial” según cómo se le hable.

El ejercicio nos permitió practicar:
 - Uso de StringBuilder y StringBuffer.
 - Creación de ramas feature y subramas.
 - Resolución de conflictos en un merge.
 - Uso de lambdas y stream() en Java.

Estudiante A debía crear un método en la rama feature/reto3_builder_Correa_Contreras_2025-2 usando StringBuilder que:
Reciba un mensaje y lo repita 3 veces concatenado con un espacio

Estudiante B debía crear un método en la rama feature/reto3_buffer_Correa_Contreras_2025-2 usando StringBuffer que:
Reciba un mensaje  y Lo invierta

Primer choque (Merge Conflict):
Ambos creamos un método con el mismo nombre, pero con transformaciones diferentes.

El reto consistía en resolver el conflicto de forma correcta creando un método final que:
Recibiera un mensaje, lo repitiera 3 veces con espacios usando StringBuilder y stream(), luego invirtiera el resultado usando StringBuffer, el método debía invocarse con una lambda.

### Lo que hicimos

- **Primero creamos el método que recibiera el mensaje y lo repita 3 veces**
- **Después creamos el método que recibiera el mensaje y lo devolviera en reversa**
- **Por último creamos un método que usara los 2 métodos para retornar el mensaje 3 veces y en reversa.**

**Evidencia**

## Reto 4 — El tesoro de las Llaves duplicadas

### Objetivo
- Construir un **HashMap** (rápido, sin sincronización) y un **Hashtable** (sincronizado), **ignorando claves duplicadas** (conservar el **primer** valor visto).
- **Combinar** ambos mapas priorizando los valores del **Hashtable** cuando haya conflicto.
- Añadir mejoras:
  - **A**: imprimir claves en **MAYÚSCULAS**.
  - **B**: imprimir en **orden ascendente** por clave.
- Crear una **función final** que haga todo con `Collectors.toMap()`, `stream().map()` y `sorted()`.

### Flujo de ramas 
- **Rama del reto:** `feature/reto_4_CorreaElizabeth_ContrerasJuan_2025-2`
- **Subrama A (HashMap + mayúsculas):** `feature/reto4_hashmap_CorreaElizabeth_ContrerasJuan_2025-2`
- **Subrama B (Hashtable + ordenado):** `feature/reto4_hashtable_CorreaElizabeth_ContrerasJuan_2025-2`



### Lo que hicimos 

- **Inciso A (HashMap)**: desde `List<KV>`, llenar `HashMap` ignorando duplicados con `putIfAbsent` (conserva el **primer** valor).
- **Inciso B (Hashtable)**: igual que A pero en `Hashtable` (sincronizado).
- **Combinar (conflicto planificado)**: `combinarMapas(HashMap, Hashtable)` → copiar el HashMap y luego **pisar** con entradas del Hashtable (prioridad Hashtable).
- **Mejora A**: imprimir claves en MAYÚSCULAS con `stream().map()` + `sorted(...)`.
- **Mejora B**: imprimir **ordenado** por clave con `stream().sorted(...)`.
- **Versión final**: `combineUppercaseAndPrintSorted(...)`  
  1) combinar con prioridad Hashtable,  
  2) pasar claves a MAYÚSCULAS,  
  3) recolectar en TreeMap (orden ascendente),  
  4) imprimir.

**Evidencia:**
![Captura](imagenes/captura30.png)

- salida de codigo
![Captura](imagenes/captura31.png)

- evidencia merges
![Captura](imagenes/captura32.png)


## Reto 6 — La máquina de decisiones

### Objetivo
- Implementar una **máquina de comandos** que use `switch-case` y un `Map<String, Runnable>` para mapear **comandos** → **acciones** con **lambdas**.
- Registrar **8 comandos** divididos por estudiante y luego **unificarlos**:
  - **A:** `SALUDAR`, `DESPEDIR`, `CANTAR`, `DANZAR`
  - **B:** `BROMEAR`, `GRITAR`, `SUSURRAR`, `ANALIZAR`
- Demostrar el funcionamiento llamando los comandos (ejemplo del enunciado).

### Flujo de ramas
- **Rama del reto:** `feature/reto_6_CorreaElizabeth_ContrerasJuan_2025-2`
- **Subrama A:** `feature/reto6_A_CorreaElizabeth_ContrerasJuan_2025-2`
- **Subrama B:** `feature/reto6_B_CorreaElizabeth_ContrerasJuan_2025-2`

### Lo que hicimos
- **Registro A (lambdas)**: en `registrarAcciones(...)`, se agregaron acciones para `SALUDAR`, `DESPEDIR`, `CANTAR`, `DANZAR`.
- **Registro B (lambdas)**: en **el mismo método y misma firma** (`registrarAcciones(...)`) se agregaron acciones para `BROMEAR`, `GRITAR`, `SUSURRAR`, `ANALIZAR` → **conflicto planificado** al merge.
- **Unificación**: se resolvió el conflicto dejando **una sola función** `registrarAcciones()` con los **8 comandos**.
- **Dispatcher**: `ejecutarComando(String)` usa `switch-case` (8 casos) y ejecuta `acciones.get(cmd).run()` si el comando está registrado; si no, informa.



**Evidencia:**
- salida de código 
![Captura](imagenes/captura33.png)

- evidencia merges (conflicto/resolución en `registrarAcciones(...)`)  
![Captura](imagenes/captura34.png)


