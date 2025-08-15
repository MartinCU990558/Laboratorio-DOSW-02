import java.util.ArrayList;
import java.util.stream.Collectors;

public class reto_1 {
    public static class Student {
        private String name;
        private int age;
        private String email;
        private int semester;

        public Student(String name, int age, String email, int semester) {
            this.name = name;
            this.age = age;
            this.email = email;
            this.semester = semester;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getEmail() {
            return email;
        }

        public int getSemester() {
            return semester;
        }

    }

    public static class Greeting_message {
        private ArrayList<Student> students = new ArrayList<Student>();

        public static void print_message(ArrayList<Student> students) {
            System.out.println("¡Hola bienvenidos! Nosotros somos la pareja conformada por " +
                    students.stream().map(n -> n.getName() +
                    " de la escuela de " + n.getSemester() + " semestre de " + n.getAge()+ " años").collect(Collectors.joining(" y ")) +
                     ",\n nuestros correos institucionales son "+
                    students.stream().map(Student::getEmail).collect(Collectors.joining(" y ")));
        }

    }

    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();
        Student A = new Student("Sofia Ariza",19,"sofia@mail.com", 6);
        Student B = new Student("Tomas Ramirez",19,"thomas@mail.com", 6);

        students.add(A);
        students.add(B);

        Greeting_message.print_message(students);
    }
}