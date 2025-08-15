package Cepeda_Guarnizo.reto1;
import java.util.List;
import java.util.stream.Collectors;

public class mensaje {

    public String mensajeListo(List<estudiante> estudiantes) {
        String estudiantesInfo = estudiantes.stream()
                .map(e -> e.getNombre() + " estudiante de la escuela de "
                        + e.getSemestre() + " semestre de "
                        + e.getEdad() + " años")
                .collect(Collectors.joining(" y "));

        String correos = estudiantes.stream()
                .map(estudiante::getCorreo)
                .collect(Collectors.joining(" y "));

        return "¡Hola Bienvenidos! Nosotros somos la pareja conformada por "
                + estudiantesInfo
                + ", nuestros correos institucionales son "
                + correos;
    }
}
