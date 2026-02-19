package BasicProgramming.Jobsheet2;

public class StudentMain09 {
    public static void main(String[] args) {
        Student09 mhs1 = new Student09();
        mhs1.name = "Muhammad Ali Farhan";
        mhs1.nim = "22241720171";
        mhs1.grade = "SI 2J";
        mhs1.gpa = 3.55;

        mhs1.informationDisplay();
        mhs1.changeClass("SI 2K");
        mhs1.updateGPA(3.60);
        mhs1.informationDisplay();
    }
}
