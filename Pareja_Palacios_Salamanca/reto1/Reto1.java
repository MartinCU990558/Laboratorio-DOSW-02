import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Reto1{

    public static void main (String[] args){
        //Creacion de los estudiantes
        Estudiante daniel = new Estudiante("Daniel Palacios", 20, "daniel.palacios-m@mail.escuelaing.edu.co", 6);
        Estudiante david = new Estudiante("David Salamanca", 20, "david.salamanca-a@mail.escuelaing.edu.co", 7);
        List<Estudiante> estudiantes = Arrays.asList(daniel, david);
        String saludo = estudiantes.stream()
                .map(e -> String.format("%s  %d años, %do semestre, %s",
                        e.getNombre(), e.getEdad(), e.getSemestre(), e.getCorreo()))
                .collect(Collectors.joining(" y "));
        //Creacion mensaje
        Mensaje mensaje = new Mensaje(saludo);
        //Mostrar mensaje
        System.out.println(mensaje.getMensaje());
    }
}