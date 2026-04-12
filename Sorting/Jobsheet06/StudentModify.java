package Sorting.Jobsheet06;

import java.util.Scanner;

public class StudentModify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        TopStudent09 topSdt = new TopStudent09(n);

        for (int i = 0; i < n; i++) {
            System.out.println("Student data #" + (i + 1));

            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Name  : ");
            String name = sc.nextLine();
            System.out.print("Class : ");
            String kelas = sc.nextLine();
            System.out.print("GPA   : ");
            double gpa = sc.nextDouble();
            sc.nextLine();
            topSdt.add(new Student09(nim, name, kelas, gpa));
            System.out.println();
        }

        System.out.println("Original student list: ");
        topSdt.print();

        System.out.println("__________________________");

        topSdt.bubbleSort();
        System.out.println("Sorted student list (by GPA, descending): ");
        topSdt.print();

        System.out.println("__________________________");

        topSdt.selectionSort();
        System.out.println("Sorted student list (by GPA, ascending) using Selection Sort: ");
        topSdt.print();

        System.out.println("__________________________");

        topSdt.insertionSort();
        System.out.println("Sorted student list (by GPA, ascending) using Insertion Sort: ");
        topSdt.print();

        sc.close();
    }
}
