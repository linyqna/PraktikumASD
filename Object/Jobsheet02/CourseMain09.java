package Object.Jobsheet02;

public class CourseMain09 {
    public static void main(String[] args) {
        Course09 course1 = new Course09();
        course1.name = "Algortm";
        course1.courseCode = "56756757";
        course1.sks = 2;
        course1.numberOfHours = 2;

        course1.showInformation();
        course1.updateSKS(1);
        course1.reduceHours(1);
        course1.showInformation();

        Course09 course2 = new Course09("Pract. Algortm", "98079087", 3, 3);
        course2.showInformation();
        course2.updateSKS(4);
        course2.addHours(1);
        course2.showInformation();
    }
}
