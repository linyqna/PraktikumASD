package ArrayOfObject.Jobsheet03;

import java.util.Scanner;

public class CourseDemo09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String code, name, dummy = null;
        int n, sks, numberOfHours;

        System.out.print("Input Total Number of Course: ");
        n = inp.nextInt();

        Course09[] arrayOfCourse = new Course09[n];

        for (int i = 0; i < arrayOfCourse.length; i++) {
            System.out.println("Input The " + (i + 1) + " Course");
            System.out.print("Code              : ");
            code = inp.nextLine();
            inp.nextLine();
            System.out.print("Name              : ");
            name = inp.nextLine();
            System.out.print("SKS               : ");
            sks = inp.nextInt();
            inp.nextLine();
            System.out.print("Number of Hours   : ");
            dummy = inp.nextLine();
            numberOfHours = Integer.parseInt(dummy);
            System.out.println("--------------------------------");

            arrayOfCourse[i] = new Course09();
            arrayOfCourse[i].addData(code, name, sks, numberOfHours);
        } inp.close();

        for (int i = 0; i < arrayOfCourse.length; i++) {
            arrayOfCourse[i].printInfo();
        }
    }
}
