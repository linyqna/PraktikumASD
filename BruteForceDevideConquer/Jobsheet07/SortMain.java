package BruteForceDevideConquer.Jobsheet07;

import java.util.Scanner;

public class SortMain {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Input number of data: ");
        int n = inp.nextInt();

        int[] data = new int[n];

        // input data
        for (int i = 0; i < n; i++) {
            System.out.print("Data ke-" + (i + 1) + ": ");
            data[i] = inp.nextInt();
        }

        MergeSort ms = new MergeSort();

        System.out.println("\nBefore sorting:");
        ms.printArray(data);

        // proses merge sort
        ms.mergeSort(data);

        System.out.println("\nAfter sorting:");
        ms.printArray(data);

        inp.close();
    }
}
