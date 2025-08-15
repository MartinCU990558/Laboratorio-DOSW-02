package reto1;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Greeting_message {
    private ArrayList<Student> students = new ArrayList<Student>();

    public static void print_message(ArrayList<Student> students) {
        System.out.println("¡Hola bienvenidos! Nosotros somos la pareja conformada por " +
                students.stream().map(n -> n.getName() +
                " estudiante de la escuela de " + n.getSemester() + " semestre de " + n.getAge()+ " años").collect(Collectors.joining(" y ")) +
                ",\n nuestros correos institucionales son "+
                students.stream().map(Student::getEmail).collect(Collectors.joining(" y ")));
    }

}