package BasicProgramming.Jobsheet01;

import java.util.Scanner;

public class selection {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Program to Calculate Final Grade");
        System.out.println("================================");

        System.out.print("Input Assignment Score  : ");
        int assg = inp.nextInt();
        System.out.print("Input Quiz Score        : ");
        int quiz = inp.nextInt();
        System.out.print("Input Mid Exam Score    : ");
        int midex = inp.nextInt();
        System.out.print("Input Final Exam Score  : ");
        int finalex = inp.nextInt();

        System.out.println("================================");
        System.out.println("================================");

        if (assg > 100 || quiz > 100 || midex > 100 || finalex > 100 || assg < 0 || quiz < 0 || midex < 0 || finalex < 0) {
            System.out.println("Score doesn't valid. Please enter the correct score.");
        } else {
            double finalsc = (assg * 0.2) + (quiz * 0.2) + (midex * 0.3) + (finalex * 0.3);
            
            String grade = null;
            if (finalsc > 80 && finalsc <= 100) {
                grade = "A";
            } else if (finalsc > 73 && finalsc <= 80) {
                grade = "B+";
            } else if (finalsc > 65 && finalsc <= 73) {
                grade = "B";
            } else if (finalsc > 60 && finalsc <= 65) {
                grade = "C+";
            } else if (finalsc > 50 && finalsc <= 60) {
                grade = "C";
            } else if (finalsc > 39 && finalsc <= 50) {
                grade = "D";
            } else if (finalsc <= 39) {
                grade = "E";
            } 

            System.out.println("Final Score     :" + finalsc);
            System.out.println("Letter Score    :" + grade);

            System.out.println("================================");
            System.out.println("================================");

            if (finalsc > 50) {
                System.out.println("You PASS");
            } else {
                System.out.println("You did NOT PASS");
            }
        }
    }
}
