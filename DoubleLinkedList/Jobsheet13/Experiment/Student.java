package DoubleLinkedList.Jobsheet13.Experiment;

public class Student {
    String nim, name, kelas;
    double gpa;

    public Student() {}

    public Student(String nim, String name, String kelas, double gpa) {
        this.nim = nim;
        this.name = name;
        this.kelas = kelas;
        this.gpa = gpa;
    }

    void print() {
        System.out.printf("%-10s %-10s %-10s %-8.2f%n", nim, name, kelas, gpa);
    }
}
