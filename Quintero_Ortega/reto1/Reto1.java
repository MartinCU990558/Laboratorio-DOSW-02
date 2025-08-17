package Quintero_Ortega.reto1;

import java.util.ArrayList;
import java.util.List;

public class Reto1 {
    private List<Estudiante> estudiantes;

    public Reto1() {
        estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Juan Ortega", 21, "juan.ortega-m@mail.escuelaing.edu.co", 6));
        estudiantes.add(new Estudiante("María Quintero", 20, "maria.quintero-a@mail.escuelaing.edu.co", 6));
    }
 
    public void imprimirBienvenida() {
        String mensaje = Mensaje.generarBienvenida(estudiantes);
        System.out.println(mensaje);
    }
 
    public static void main(String[] args) {
        Reto1 reto = new Reto1();
        reto.imprimirBienvenida();
    }
}
