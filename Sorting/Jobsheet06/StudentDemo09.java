package Sorting.Jobsheet06;

public class StudentDemo09 {
    public static void main(String[] args) {
        TopStudent09 topSdt = new TopStudent09(5);

        topSdt.add(new Student09("2201", "Alice", "A", 3.9));
        topSdt.add(new Student09("2202", "Bob", "B", 3.7));
        topSdt.add(new Student09("2203", "Charlie", "C", 3.8));
        topSdt.add(new Student09("2204", "David", "D", 3.6));
        topSdt.add(new Student09("2205", "Eve", "E", 4.0));

        System.out.println("Original student list: ");
        topSdt.print();

        System.out.println("__________________________");
        System.out.println("__________________________");

        topSdt.bubbleSort();
        System.out.println("Sorted student list (by GPA, descending): ");
        topSdt.print();

        System.out.println("__________________________");
        System.out.println("__________________________");

        topSdt.selectionSort();
        System.out.println("Sorted student list (by GPA, ascending) using Selection Sort: ");
        topSdt.print();
        
        System.out.println("__________________________");
        System.out.println("__________________________");

        topSdt.insertionSort();
        System.out.println("Sorted student list (by GPA, ascending) using Insertion Sort: ");
        topSdt.print();
    }
}
