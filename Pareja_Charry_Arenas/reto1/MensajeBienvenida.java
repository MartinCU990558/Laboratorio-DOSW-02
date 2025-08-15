package Pareja_Charry_Arenas.reto1;

public class MensajeBienvenida {
    public static String crear(Estudiante e) {
        return "Bienvenido " + e.nombre + ", edad " + e.edad +
                ", correo " + e.correo + ", semestre " + e.semestre;
    }
}
