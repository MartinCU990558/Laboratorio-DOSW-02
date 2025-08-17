package Quintero_Ortega.reto1;

import java.util.List;
import java.util.stream.Collectors;

public class Mensaje {
    public static String generarBienvenida(List<Estudiante> estudiantes) {
        return estudiantes.stream()
            .map(est -> String.format(
                "¡Bienvenido %s! Edad: %d, Correo: %s, Semestre: %d",
                est.getNombre(), est.getEdad(), est.getCorreo(), est.getSemestre()
            ))
            .collect(Collectors.joining("\n"));
    }
}
