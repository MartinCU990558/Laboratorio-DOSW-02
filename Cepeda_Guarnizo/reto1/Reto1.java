package Cepeda_Guarnizo.reto1;
import java.util.ArrayList;
import java.util.List;

public class reto1 {
    private estudiante estudiante1;
    private estudiante estudiante2;
    private List<estudiante> estudiantes;
    private mensaje mensaje;
    private String mensajeYa;

    public reto1() {
        estudiantes = new ArrayList<>();
        estudiante1 = new estudiante("Carolina Cepeda", "carolina.cepeda-v@mail.escualaing.edu.co", 20, 6);
        estudiante2 = new estudiante("Manuel Guarnizo", "manuel.guarnizo-g@mail.escuelaing.edu.co", 19, 6);

        estudiantes.add(estudiante1);
        estudiantes.add(estudiante2);

        mensaje = new mensaje();
        mensajeYa = mensaje.mensajeListo(estudiantes);
    }

    public String getMensajeYa() {
        return mensajeYa;
    }

    public static void main(String[] args) {
        reto1 r = new reto1();
        System.out.println(r.getMensajeYa());
    }
}
