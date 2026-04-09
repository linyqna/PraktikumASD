package Searching.Jobsheet07;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        int amountStudent;
        System.out.print("Student amount: ");
        amountStudent = s.nextInt();

        SearchStudent data = new SearchStudent(amountStudent);

        System.out.println("------------------------------");
        System.out.println("Input student data accordingly from smallest NIM");
        for (int i = 0; i < amountStudent; i++) {
            System.out.println("----------");
            System.out.print("NIM   : ");
            int nim = s.nextInt();
            s.nextLine();
            System.out.print("Name  : ");
            String name = s.nextLine();
            System.out.print("Age   : ");
            int age = s.nextInt();
            System.out.print("GPA   : ");
            double gpa = s.nextDouble();

            Student sdt = new Student(nim, age, name, gpa);
            data.add(sdt);
        }

        System.out.println("------------------------------");
        System.out.println("Entire Student Data");
        data.display();

        System.out.println("________________________");
        System.out.println("________________________");
        System.out.print("Search student by NIM: ");
        int search = s.nextInt();
        System.out.println("Using Sequential Search");
        int position = data.findSeqSearch(search);

        data.showPosition(search, position);
        data.showData(search, position);

        System.out.println("========================");
        System.out.print("Search student by NIM: ");
        System.out.println("Using Binary Search");
        int position1 = data.findBinarySearch(search, 0, amountStudent -1);

        data.showPosition(search, position1);
        data.showData(search, position1);

        s.close();
        sl.close();
    }
}
