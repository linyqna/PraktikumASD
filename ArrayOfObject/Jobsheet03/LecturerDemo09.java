package ArrayOfObject.Jobsheet03;

import java.util.Scanner;

public class LecturerDemo09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Lecturer09[] arrayOfLecturer = new Lecturer09[3];

        String code, name, pl;
        boolean gender;
        int age;

        for (int i = 0; i < arrayOfLecturer.length; i++) {
            System.out.println("Input The " + (i + 1) + " Lecturer Data");
            System.out.print("Code  : ");
            code = inp.nextLine();
            System.out.print("Name  : ");
            name = inp.nextLine();
            System.out.print("Gender: ");
            pl = inp.nextLine();
            gender = pl.equalsIgnoreCase("male");
            System.out.print("Age   : ");
            age = inp.nextInt();
            inp.nextLine();
            System.out.println("---------------------");

            arrayOfLecturer[i] = new Lecturer09(code, name, gender, age);
        } inp.close();

        LecturerData09 data = new LecturerData09();

        data.dataAllLecturer(arrayOfLecturer);
        data.numberOfLecturerPerGender(arrayOfLecturer);
        data.averageAgeOfLecturersPerGender(arrayOfLecturer);
        data.theOldestLecturerInfo(arrayOfLecturer);
        data.theYoungestLecturerInfo(arrayOfLecturer);
    }
}
