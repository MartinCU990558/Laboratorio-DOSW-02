# Laboratorio-DOSW-02
# Maratón Git 2025-2

**Integrantes:**
- Carolina Cepeda Valencia
- Manuel Alejandro Guarnizo

**Nombre de la rama:** feature/Cepeda_Guarnizo_2025-2
---
## Retos Completados

### Reto 1 : Mensaje de Bienvenida!

**Evidencia**
![captura](imag/reto1.png)

Hicimos una clase estudiante, metimos cada uno en una lista y manejamos el uso Map en la clase mensaje
para que este recolectara la información de cada uno.

### Reto 2: Carrera en Paralelo
**Evidencia**
![captura](imag/reto2.png)
Hicimos dos ramas , en las cuales manejamos el uso de diferentes funciones y streams, encontrando
el maximo y minimo de la lista, si el numero mayor era multiplo o divisor de 2, etc.
A la hora de resolver el merge, añadimos las funcionalidades a la rama principal, y resolvimos los conflictos
de manera manual, ya que se trataba de dos funciones diferentes que hacían lo mismo.

### Reto 3: El eco misterioso
**Evidencia**
![captura](imag/reto3.png)
Manejamos el uso de String builder y StringBuffer, para manejar el eco de la frase que se le pasaba por consola.
A la hora de resolver el merge, se trataba de dos funciones diferentes que hacían lo mismo, por lo que se resolvió de manera manual, añadiendo las funcionalidades a la rama principal.

### Reto 4: El tesoro de las llaves duplicadas
**Evidencia**
![captura](imag/reto4.png)
Se hace el uso de HashMap ignorando claves duplicadas, y se hace uso de hashTable para mostrar el funcionamiento de metodos similares
con diferentes colecciones.A la hora de resolver el merge, se hace la inclusión de las funcionalidades de ambas ramas,priorizando los
valores de hashtable en caso de conflicto.

![captura](imag/reto4.jpg)
Hacemos uso de una función main para mostrar el funcionamiento de la clase.
### Reto 5 :Batalla de conjuntos
**Evidencia**
![captura](imag/reto5.png)
Manejamos el uso de conjuntos, y a la hora de resolver el merge, se trataba de dos funciones diferentes que hacían practicamente lo mismo, por lo que se resolvió de manera manual, añadiendo las funcionalidades a la rama principal.
### Reto 6: La maquina de decisiones
**Evidencia**
![captura](imag/reto6.png)
Manejamos el uso de la interfaz run para manejar ka ejecución de cada acción, a la hora de resolver el merge conflict decidimos manejarlo con un mapa para que se maneje como un menu de todas las acciones que se pueden realizar, y cada una de estas acciones se ejecuta dependiendo de la opción que elija el usuario.
![captura](imag/reto6.jpg)

## Cuestionario

6. Qué diferencia hay entre HashMap y HashTable? 
    La diferencia es que un Hashmap no es sincronizado, lo que significa que no es seguro para el acceso  por múltiples hilos, mientras que un Hashtable si lo es. Además, HashMap permite un valor nulo para la clave y el valor, mientras que Hashtable no permite valores nulos.

7. Qué ventajas tiene Collectors.toMap() frente a un bucle tradicional para llenar un mapa? 
    Las ventajas de usar Collectors.toMap() es que es más conciso y legible, ya que permite crear un mapa directamente a partir de una colección sin necesidad de escribir un bucle de forma explícita. Además, se pueden aplicar funciones de transformación y filtrado de manera más sencilla, lo que mejora la eficiencia y claridad del código.

8. Si usas List con objetos y luego aplicas stream().map() que tipo de operación estas haciendo? 
    Estás realizando una operación de transformación, donde cada objeto de la lista se convierte en otro tipo de objeto o se extrae un atributo específico de cada objeto.

9. Que hace el método stream().filter() y que retorna? 
    El método stream().filter() aplica un filtro a los elementos del flujo, permitiendo pasar solo aquellos que cumplen con una condición específica. Retorna un nuevo stream que contiene solo los elementos que cumplen con el criterio de filtrado.

10.Describe el paso a paso de cómo crear una rama desde develop si es una funcionalidad nueva. 
    1. Asegúrate de estar en la rama develop ejecutando `git checkout develop`.
    2. Actualiza la rama develop con los últimos cambios del repositorio remoto ejecutando `git pull origin develop`.
    3. Crea una nueva rama para la funcionalidad nueva ejecutando `git checkout -b feature/nombre_de_la_funcionalidad`.
    4. Realiza los cambios necesarios en el código.
    5. Agrega los cambios al área de preparación con `git add .`.
    6. Realiza un commit con un mensaje descriptivo usando `git commit -m "Descripción de los cambios"`.
    7. Sube la nueva rama al repositorio remoto con `git push origin feature/nombre_de_la_funcionalidad`.

11. ¿Cuál es la diferencia entre crear una rama con git branch y con git checkout -b? 
    La diferencia es que `git branch` solo crea una nueva rama sin cambiar a ella, mientras que `git checkout -b` crea una nueva rama y cambia inmediatamente a esa rama, permitiendo comenzar a trabajar en ella de inmediato.

12. ¿Por qué es recomendable crear ramas feature/ para nuevas funcionalidades en lugar de trabajar en main directamente? 
    Es recomendable crear ramas feature/ para nuevas funcionalidades porque permite un desarrollo más organizado y aislado. Esto evita conflictos en la rama principal y facilita la revisión de código, pruebas y la integración de nuevas funcionalidades sin afectar el código estable.