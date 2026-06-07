package Tree.Jobsheet14;

public class Student09 {
    String nim, name, kelas;
    double gpa;

    public Student09() {}

    public Student09(String nim, String name, String kelas, double gpa) {
        this.nim = nim;
        this.name = name;
        this.kelas = kelas;
        this.gpa = gpa;
    }

    void print() {
        System.out.println(nim + " - " + name + " - " + kelas + " - " + gpa);
    }
}
