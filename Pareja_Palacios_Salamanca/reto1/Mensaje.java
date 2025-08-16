public class Mensaje {

    private String mensaje;

    //constructor
    public Mensaje(String saludo){
        this.mensaje = "¡Hola Bienvenidos! Nosotros somos la pareja conformada por "+saludo;
    }

    //getter
    public String getMensaje(){
        return this.mensaje;
    }

}