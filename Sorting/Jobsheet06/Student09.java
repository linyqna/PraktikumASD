package Sorting.Jobsheet06;

public class Student09 {
    String nim;
    String name;
    String kelas;
    double gpa;

    public Student09() {}

    public Student09(String nim, String name, String kelas, double gpa) {
        this.nim = nim;
        this.name = name;
        this.kelas = kelas;
        this.gpa = gpa;
    }

    public void print() {
        System.out.println("NIM     : " + nim);
        System.out.println("Name    : " + name);
        System.out.println("Class   : " + kelas);
        System.out.println("GPA     : " + gpa);
        System.out.println("------------------");
    }
}
