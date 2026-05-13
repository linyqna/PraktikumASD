package LinkedList.Jobsheet12.Assignment;

public class StudentService {
    String nim, name, kelas;
    double gpa;

    public StudentService() {}

    public StudentService(String nim, String name, String kelas, double gpa) {
        this.name = name;
        this.nim = nim;
        this.kelas = kelas;
        this.gpa = gpa;
    }

    void print() {
        System.out.println(nim + " - " + name + " - " + kelas + " - " + gpa);
    }
}
