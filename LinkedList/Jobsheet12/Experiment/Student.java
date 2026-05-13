package LinkedList.Jobsheet12.Experiment;

public class Student {
    String nim, name, kelas;
    double gpa;

    public Student() {}

    public Student(String nim, String name, String kelas, double gpa) {
        this.name = name;
        this.nim = nim;
        this.kelas = kelas;
        this.gpa = gpa;
    }

    void print() {
        System.out.println(nim + " - " + name + " - " + kelas + " - " + gpa);
    }
}
