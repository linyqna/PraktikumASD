package BruteForceDevideConquer.Jobsheet05;

import java.util.Scanner;

public class MainSum09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Input element number: ");
        int element = inp.nextInt();

        Sum09 sm = new Sum09(element);
        for (int i = 0; i < element; i++) {
            System.out.print("Input the #" + (i + 1) + " profit: ");
            sm.profits[i] = inp.nextDouble();        
        }
        inp.close();

        System.out.println("Profit total using BF: " + sm.totalBF());
        System.out.println("Profit total using DC: " + sm.totalDC(sm.profits, 0, element - 1));
    }
}
