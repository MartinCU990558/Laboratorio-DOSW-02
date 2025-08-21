package Pareja_Charry_Arenas.reto1;

import java.util.Arrays;
import java.util.List;

public class reto1 {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = Arrays.asList(
                new Estudiante("Marlio Jose Charry Espitia", 19, "marlio.charry-e@mail.escuelaing.edu.co", 6),
                new Estudiante("Julian Arenas", 23, "julian.arenas-a@mail.escuelaing.edu.co", 7)
        );

        List<String> mensajes = estudiantes.stream()
                .map(MensajeBienvenida::crear)
                .toList();

        mensajes.forEach(System.out::println);
    }
}
