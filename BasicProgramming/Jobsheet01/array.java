package BasicProgramming.Jobsheet01;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String[] course = {
            "Pancasila", "KTI", "CTPS",
            "Matdas", "English", "Daspro",
            "Daspro Pract", "K3"};
        int n = course.length;

        int[] sks = {2, 2, 2, 2, 2, 2, 3, 3};
        
        double[] score = new double[n];
        String[] grade = new String[n];
        double[] weight = new double[n];

        double totalsc = 0;
        int totalsks = 0;

        System.out.println("=================================");
        System.out.println("Program to Calculate Semester GPA");
        System.out.println("=================================");

        System.out.println("--------Input Course Grade-------");

        for (int i = 0; i < course.length; i++) {
            System.out.print("Input " + course[i] + " Score: ");
            score[i] = inp.nextDouble();

            if (score[i] > 80 && score[i] <= 100) {
                grade[i] = "A";
                weight[i] = 4;
            } else if (score[i] > 73 && score[i] <= 80) {
                grade[i] = "B+";
                weight[i] = 3.5;
            } else if (score[i] > 65 && score[i] <= 73) {
                grade[i] = "B";
                weight[i] = 3;
            } else if (score[i] > 60 && score[i] <= 65) {
                grade[i] = "C+";
                weight[i] = 2.5;
            } else if (score[i] > 50 && score[i] <= 60) {
                grade[i] = "C";
                weight[i] = 2;
            } else if (score[i] > 39 && score[i] <= 50) {
                grade[i] = "D";
                weight[i] = 1;
            } else if (score[i] <= 39) {
                grade[i] = "E";
                weight[i] = 0;
            }

            totalsc += weight[i] * sks[i];
            totalsks += sks[i];
        }

        inp.close();

        System.out.println("\n=================================");
        System.out.println("-----Value Convertion Result-----");
        System.out.println("=================================");

        System.out.printf("%-15s %-10s %-5s %-12s\n", 
        "Course", "Final Score", "Letter Score", "Score Weight");
        System.out.println("---------------------------------");

        for (int i = 0; i < course.length; i++) {
            System.out.printf("%-15s %-10s %-15s %-12s\n", 
            course[i], score[i], grade[i], weight[i]);
        }

        System.out.println("=================================");
        double ip = totalsc / totalsks;
        System.out.println("GPA : " + ip);
        System.out.println("=================================");
    }
}
