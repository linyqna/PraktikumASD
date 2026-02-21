package Object.Jobsheet02;

public class StudentMain09 {
    public static void main(String[] args) {
        Student09 mhs1 = new Student09();
        mhs1.name = "Muhammad Ali Farhan";
        mhs1.nim = "22241720171";
        mhs1.grade = "SI 2J";
        mhs1.gpa = 3.55;

        mhs1.informationDisplay();
        mhs1.changeClass("SI 2K");
        mhs1.updateGPA(7.60);
        mhs1.informationDisplay();

        Student09 mhs2 = new Student09("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateGPA(7.30);
        mhs2.informationDisplay();

        Student09 mhsFitriani = new Student09("Fitriani", "254107060102", 4.0, "SIB 1G");
        mhsFitriani.informationDisplay();
    }
}
