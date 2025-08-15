package reto1;

public class Student {
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