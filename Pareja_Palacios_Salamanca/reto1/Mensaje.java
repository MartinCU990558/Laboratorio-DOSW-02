public class Mensaje {

    private String mensaje;

    //constructor
    public Mensaje(Estudiante estudiante){
        this.mensaje = estudiante.nombre;
    }

    //getter
    public getMensaje(){
        return mensaje;
    }

}