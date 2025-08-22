# Laboratorio-DOSW-02

**Integrantes:**
- María Belén Quintero Aldana  
- Juan Sebastián Ortega Muñoz  

**Nombre de la rama:** feature/QuinteroMaria_OrtegaJuan_2025-2  

---

## Retos Completados

### Reto 1: Configuración y creación de rama
**Evidencia:**
![Captura](imagenes/reto1.png)  
![Captura](imagenes/reto1salida.png)  

En este reto configuramos Git con nuestros nombres y correos, y creamos la rama `feature/QuinteroMaria_OrtegaJuan_2025-2`.


---

### Reto 2: Commit colaborativo
**Evidencia:**  
![Captura](imagenes/reto2_log.png)  
Realizamos un commit colaborativo en la misma rama, verificando el log para asegurarnos de que aparecían ambos aportes.  

---

### Reto 3: (nombre del reto)
**Evidencia:**  
![Captura](imagenes/reto3.png)  
Descripción breve de lo que hicieron.  

---

### Reto 4: (nombre del reto)
**Evidencia:**  
![Captura](imagenes/reto4.png)  
Descripción breve de lo que hicieron.  

---

### Reto 5: (nombre del reto)
**Evidencia:**  
![Captura](imagenes/reto5.png)  
Descripción breve de lo que hicieron.  

---

### Reto 6: (nombre del reto)
**Evidencia:**  
![Captura](imagenes/reto6.png)  
Descripción breve de lo que hicieron.  

---

### Reto 7: (nombre del reto)
**Evidencia:**  
![Captura](imagenes/reto7.png)  
Descripción breve de lo que hicieron.  

---

### Reto 8: (nombre del reto)
**Evidencia:**  
![Captura](imagenes/reto8.png)  
Descripción breve de lo que hicieron.  

---

## Preguntas Teóricas


## Preguntas Teóricas

**Pregunta 8. Si usas List con objetos y luego aplicas stream().map() que tipo de operación estas haciendo?**

Una operación de transformación. Convierte cada elemento del stream en otro valor (puede ser del mismo tipo o distinto). Retorna un nuevo Stream con los elementos transformados.

**Pregunta 9. Que hace el método stream().filter() y que retorna?** 

Aplica un predicado booleano a cada elemento. Mantiene solo los que cumplen la condición. Retorna un Stream con esos elementos filtrados.

**Pregunta 10. Describe el paso a paso de cómo crear una rama desde develop si es una funcionalidad nueva.**

1. Guardamos o limpiamos el trabajo actual.
	git status
	git add . && git commit -m "WIP" (Solo si tenemos cambios)
2. Actualizamos las referencias remotas
	git fetch --all
3. Nos movemos a develop local y traemos lo ultimo
	git checkout develop
	git pull origin develop
4. Creamos la rama de feature desde develop y nos cambiamos a ella.
	git checkout -b feature/<nombre-corto>
5. Subimos la rama y establecemos upstream.
	git push -u origin feature/<nombre-corto>


**Pregunta 11. ¿Cuál es la diferencia entre crear una rama con git branch y con git checkout -b?**

git branch <rama>: solo crea la rama. Te quedas en la rama actual.

git checkout -b <rama>: crea y cambia a la nueva rama en un solo paso.

**Pregunta 12. ¿Por qué es recomendable crear ramas feature/ para nuevas funcionalidades en lugar de trabajar en main directamente?**

-Aislamiento: los cambios no rompen el código estable.

-Revisión por PR: código revisado antes de integrar.

-CI segura: pruebas corren en la rama antes de tocar main.

-Historial limpio: commits agrupados por feature.

-Reversión fácil: si algo falla, se revierte la rama o el merge.

-Trabajo en paralelo: varios features sin bloqueos.

-Políticas: proteges main con reglas de branch y evitas pushes accidentales.
