package Queue.Jobsheet11;

public class StudentApproval {
    String nim, name, prodi, kelas;

    public StudentApproval(String name, String nim, String prodi, String kelas) {
        this.name = name;
        this.nim = nim;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    void print() {
        System.out.println(nim + " - " + name + " - " + prodi + " - " + kelas);
    }
}
