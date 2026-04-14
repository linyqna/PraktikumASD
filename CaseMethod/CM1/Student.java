package CaseMethod.CM1;

public class Student {
    String name, prodi, nim;

    public Student(String nim, String name, String prodi) {
        this.nim = nim;
        this.name = name;
        this.prodi = prodi;
    }

    public void printStudent() {
        System.out.println("NIM: " + nim + "|| Name: " + name + "|| Program Study: " + prodi);
    }
}
