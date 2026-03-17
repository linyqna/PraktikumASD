package BruteForceDevideConquer.Jobsheet05;

import java.util.Scanner;

public class MainPower09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Input element number: ");
        int element = inp.nextInt();

        Power09[] png = new Power09[element];
        for (int i = 0; i < element; i++) {
            System.out.print("Input base number for " + (i + 1) + "th element: ");
            int basis = inp.nextInt();
            System.out.print("Input exponent for " + (i + 1) + "th element: ");
            int exp = inp.nextInt();

            png[i] = new Power09(basis, exp);
        }
        inp.close();

        System.out.println("POWER RESULT USING BRUTE FORCE:");
        for (Power09 p : png) {
            System.out.println(p.baseNumber + "^" + p.exponent + ": " + p.powerBF(p.baseNumber, p.exponent));
        }
        System.out.println("POWER RESULT USING DIVIDE & CONQUER:");
        for (Power09 p : png) {
            System.out.println(p.baseNumber + "^" + p.exponent + ": " + p.powerDC(p.baseNumber, p.exponent));
        }
    }
}
