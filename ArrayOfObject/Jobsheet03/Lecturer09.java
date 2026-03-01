package ArrayOfObject.Jobsheet03;

public class Lecturer09 {
    String code;
    String name;
    boolean gender;
    int age;

    public Lecturer09(String code, String name, boolean gender, int age) {
        this.code = code;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    void printInfo() {
        System.out.println("===Lecturer Data===");
        System.out.println("Code  : " + code);
        System.out.println("Name  : " + name);
        System.out.print("Gender: ");
        if (gender == true) {
            System.out.println("Male");
        } if (gender == false) {
            System.out.println("Female");
        }
        System.out.println("Age   : " + age);
        System.out.println("---------------------");
    }
}
