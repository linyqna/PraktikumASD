package BruteForceDevideConquer.Jobsheet05;

import java.util.Scanner;

public class MainFactorial09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = inp.nextInt();
        inp.close();

        Factorial09 fk = new Factorial09();
        System.out.println("The factorial of " + num + " using BF: " + fk.factorialBF(num));
        System.out.println("The factorial of " + num + " using DC: " + fk.factorialDC(num));
    }
}
