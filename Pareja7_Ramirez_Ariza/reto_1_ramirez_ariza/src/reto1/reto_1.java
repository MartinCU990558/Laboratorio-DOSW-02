package reto1;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class reto_1 {

    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();
        Student A = new Student("Sofia Ariza",19,"sofia@mail.com", 6);
        Student B = new Student("Tomas Ramirez",19,"thomas@mail.com", 6);

        students.add(A);
        students.add(B);

        Greeting_message.print_message(students);
    }
}