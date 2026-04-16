package CaseMethod.CM1;

public class Student {
    String name, prodi, nim, phone;

    public Student(String nim, String name, String prodi, String phone) {
        this.nim = nim;
        this.name = name;
        this.prodi = prodi;
        this.phone = phone;
    }

    public void printStudent() {
        System.out.println("NIM: " + nim + "|| Name: " + name + "|| Program Study: " + prodi + "|| Phone Number: " + phone);
    }
}
