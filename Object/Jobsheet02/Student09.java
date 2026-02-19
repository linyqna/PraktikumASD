package Object.Jobsheet02;

public class Student09 {
    String name;
    String nim;
    String grade;
    double gpa;

    public Student09() {
    }

    public Student09(String nm, String nim, double gpa, String grd) {
        name = nm;
        this.nim = nim;
        this.gpa = gpa;
        grade = grd;
    }

    void informationDisplay() {
        System.out.println("Nama: " + name);
        System.out.println("NIM: " + nim);
        System.out.println("GPA: " + gpa);
        System.out.println("Class: " + grade);
    }

    void changeClass (String newClass) {
        grade = newClass;
    }

    void updateGPA (double newGPA) {
        //gpa = newGPA;
        if (newGPA > 4.0 || newGPA < 0.0) {
            System.out.println("GPA is invalid. Must between 0.0 and 4.0");
        } else {
            newGPA = gpa;
        }
    } 

    String performanceValue() {
        if (gpa >= 3.5) {
            return "Very good performance";
        } else if (gpa >= 3.0) {
            return "Good Performance";
        } else if (gpa >= 2.0) {
            return "Fairly performance";
        } else {
            return "Poor performance";
        }
    }
}
