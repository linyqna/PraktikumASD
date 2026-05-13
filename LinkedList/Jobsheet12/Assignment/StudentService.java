package LinkedList.Jobsheet12.Assignment;

public class StudentService {
    String nim, name, prodi, kelas;

    public StudentService() {}

    public StudentService(String nim, String name, String prodi, String kelas) {
        this.name = name;
        this.nim = nim;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    void print() {
        System.out.printf("%-10s %-10s %-20s %-10s%n", nim, name, prodi, kelas);
    }
}
