package ArrayOfObject.Jobsheet03;

import java.util.Scanner;

public class StudentDemo09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Student09[] arrayOfStudent = new Student09[3];
        String dummy;

        for (int i = 0; i < arrayOfStudent.length; i++) {
            arrayOfStudent[i] = new Student09();

            System.out.println("Input The " + (i + 1) + " Student Data");
            System.out.print("NIM     : ");
            arrayOfStudent[i].nim = inp.nextLine();
            System.out.print("Name    : ");
            arrayOfStudent[i].name = inp.nextLine();
            System.out.print("Class   : ");
            arrayOfStudent[i].grade = inp.nextLine();
            System.out.print("GPA     : ");
            dummy = inp.nextLine();
            arrayOfStudent[i].gpa = Float.parseFloat(dummy);
            System.out.println("---------------------------"); 
        } inp.close();
        
        for (int i = 0; i < arrayOfStudent.length; i++) {
            arrayOfStudent[i].printInfo();
        }
    }
}
