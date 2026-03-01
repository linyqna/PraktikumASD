package ArrayOfObject.Jobsheet03;

public class StudentDemo09 {
    public static void main(String[] args) {
        Student09[] arrayOfStudent = new Student09[3];
        arrayOfStudent[0] = new Student09();
        arrayOfStudent[0].nim = "244107060033";
        arrayOfStudent[0].name = "AGNES TITANIA KINANTI";
        arrayOfStudent[0].grade = "SIB-1E";
        arrayOfStudent[0].gpa = (float) 3.75;

        arrayOfStudent[1] = new Student09();
        arrayOfStudent[1].nim = "2341720172";
        arrayOfStudent[1].name = "ACHMAD MAULANA HAMZAH";
        arrayOfStudent[1].grade = "TI-2A";
        arrayOfStudent[1].gpa = (float) 3.36;

        arrayOfStudent[2] = new Student09();
        arrayOfStudent[2].nim = "244107023006";
        arrayOfStudent[2].name = "DIRHAMAWAN PUTRANTO";
        arrayOfStudent[2].grade = "TI-2E";
        arrayOfStudent[2].gpa = (float) 3.80;

        System.out.println("NIM     :" + arrayOfStudent[0].nim);
        System.out.println("Name    :" + arrayOfStudent[0].name);
        System.out.println("Class   :" + arrayOfStudent[0].grade);
        System.out.println("GPA     :" + arrayOfStudent[0].gpa);
        System.out.println("---------------------------------");
        System.out.println("NIM     :" + arrayOfStudent[1].nim);
        System.out.println("Name    :" + arrayOfStudent[1].name);
        System.out.println("Class   :" + arrayOfStudent[1].grade);
        System.out.println("GPA     :" + arrayOfStudent[1].gpa);
        System.out.println("---------------------------------");
        System.out.println("NIM     :" + arrayOfStudent[2].nim);
        System.out.println("Name    :" + arrayOfStudent[2].name);
        System.out.println("Class   :" + arrayOfStudent[2].grade);
        System.out.println("GPA     :" + arrayOfStudent[2].gpa);
        System.out.println("---------------------------------");
    }
}
