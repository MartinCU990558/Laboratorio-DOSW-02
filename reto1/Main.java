package reto1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Student> estudiantes = Arrays.asList(
                new Student("Elizabeth Correa", "elizabeth.correa-s@mail.escuelaing.edu.co", 20, "7mo"),
                new Student("Juan Pablo Contreras", "juan.contreras-p@mail.escuelaing.edu.co", 19, "6to")
        );

        Message message = new Message();
        String resultado = message.print(estudiantes);
        System.out.println(resultado);
    }
}

class Student {
    private String name;
    private String mail;
    private Integer age;
    private String semester;

    public Student(String name, String mail, int edad, String semester) {
        this.name = name;
        this.mail = mail;
        this.age = edad;
        this.semester = semester;
    }

    public String getName(){
        return name;
    }

    public String getMail(){
        return mail;
    }

    public int getAge(){
        return age;
    }

    public String getSemester(){
        return semester;
    }
}

class Message {

    public String print(List<Student> estudiantes){
        String nombres = estudiantes.stream()
                .map(e -> e.getName() + " estudiante de la escuela de " + e.getSemester() + " de " + e.getAge() + " años")
                .collect(Collectors.joining(" y "));

        String correos = estudiantes.stream()
                .map(Student::getMail)
                .collect(Collectors.joining(" y "));

        return "¡Hola Bienvenidos! Nosotros somos la pareja conformada por " + nombres +
                ", nuestros correos institucionales son " + correos;
    }
}
