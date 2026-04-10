package Sorting.Jobsheet06;

public class Lecturer09 {
    String id, name;
    boolean gender;
    int age;

    public Lecturer09(String id, String name, boolean gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void print() {
        System.out.println("Lecturer ID : " + id);
        System.out.println("Name        : " + name);
        if (gender == true) {
            System.out.println("Gender      : Male");
        } else {
            System.out.println("Gender      : Female");
        }
        System.out.println("Age         : " + age);
        System.out.println("------------------");
    }
}
