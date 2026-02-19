package Object.Jobsheet02;

public class Course09 {
    String courseCode;
    String name;
    int sks;
    int numberOfHours;

    public Course09() {}

    public Course09(String nm, String cd, int sks, int hr) {
        name = nm;
        courseCode = cd;
        this.sks = sks;
        numberOfHours = hr;
    }

    void showInformation() {
        System.out.println("Course Name             : " + name);
        System.out.println("Course Code             : " + courseCode);
        System.out.println("Course Credit           : " + sks);
        System.out.println("Total Meeting (h/week)  : " + numberOfHours);
    }

    void updateSKS(int sksNew) {
        sks = sksNew;
        System.out.println("The Course Credit have been changed.");
    }

    void addHours(int hours) {
        numberOfHours += hours;
        System.out.println("Number of Hours: " + numberOfHours);
    }

    void reduceHours(int hours) {
        if (hours > numberOfHours) {
            System.out.println("The Number of hours left is sufficient to be reduced.");
        } else {
            numberOfHours -= hours;
            System.out.println("Number of Hours: " + numberOfHours);
        }
    }
}
