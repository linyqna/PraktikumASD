package Stack.Jobsheet10;

public class Student09 {
    String name, nim, kelas;
    int grade;

    Student09(String name, String nim, String kelas) {
        this.name = name;
        this.nim = nim;
        this.kelas = kelas;
        this.grade = -1;
    }

    void grading(int grade) {
        this.grade = grade;
    }
}
