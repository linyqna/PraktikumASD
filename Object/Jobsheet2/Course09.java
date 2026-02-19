package Object.Jobsheet2;

public class Course09 {
    String courseCode;
    String name;
    int sks;
    int numberOfHours;

    void showInformation() {
        System.out.println("Course Code             : " + courseCode);
        System.out.println("Course Name             : " + name);
        System.out.println("Course Credit           : " + sks);
        System.out.println("Total Meeting (h/week)  : " + numberOfHours);
    }

    void updateSKS(int sksNew) {
        sksNew = sks;
        System.out.println("The Course Credit have been changed.");
    }

    void addHours(int hours) {
        hours += numberOfHours;
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
