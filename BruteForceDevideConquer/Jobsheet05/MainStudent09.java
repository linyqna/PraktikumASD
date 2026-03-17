package BruteForceDevideConquer.Jobsheet05;

import java.util.Scanner;

public class MainStudent09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the number of Student: ");
        int n = inp.nextInt();

        int[] uts = new int[n];
        int[] uas = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("---- Student #" + (i + 1) + " ----");
            System.out.print("Midterm Score : ");
            uts[i] = inp.nextInt();
            System.out.print("Final Score   : ");
            uas[i] = inp.nextInt();
            System.out.println("=====================");
        }

        Student09 data = new Student09(uts, uas);

        int max = data.maxUTS(0, n - 1);
        int min = data.minUTS(0, n - 1);
        double avg = data.avgUAS();

        System.out.println("\n=== RESULT ===");
        System.out.println("Highest Midterm Score : " + max);
        System.out.println("Lowest Midterm Score  : " + min);
        System.out.println("Final Score average   : " + avg);

        inp.close();
    }
}
