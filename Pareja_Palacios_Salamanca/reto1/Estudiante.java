public class estudiante {
    String nombre;
    int edad;
    String correo;
    int semestre;

    // Constructor
    public Estudiante(String nombre, int edad, String correo, int semestre) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.semestre = semestre;
    }


    // Getters
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getCorreo() {
        return correo;
    }
    public int getSemestre() {
        return semestre;
    }
}