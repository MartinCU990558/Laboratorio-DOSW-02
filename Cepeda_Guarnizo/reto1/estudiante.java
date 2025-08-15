package Cepeda_Guarnizo.reto1;

public class estudiante {

    private String nombre;
    private String correo;
    private int edad;
    private int semestre;


    public estudiante(String nombre, String correo, int edad, int semestre){
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
        this.semestre = semestre; 

    }

    public int getSemestre(){
        return semestre;
    }

    public int getEdad(){
        return edad;
    }

    public String getCorreo(){
        return correo;
    }

    public String getNombre(){
        return nombre;
    }
}
