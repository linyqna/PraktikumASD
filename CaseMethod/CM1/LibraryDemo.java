package CaseMethod.CM1;

import java.util.Scanner;

public class LibraryDemo {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int menu;

        LibraryData data = new LibraryData(3, 4, 5);

        data.add1(new Student("22001", "Andi", "Informatics Engineering"));
        data.add1(new Student("22002", "Budi", "Informatics Engineering"));
        data.add1(new Student("22003", "Image", "Businsess Information Systems"));

        data.add2(new Book("B001", "Algoritm", 2020));
        data.add2(new Book("B002", "Database", 2019));
        data.add2(new Book("B003", "Programming", 2021));
        data.add2(new Book("B004", "Physics", 2024));

        data.add3(new Loan(data.students[0], data.books[0], 7));
        data.add3(new Loan(data.students[1], data.books[1], 3));
        data.add3(new Loan(data.students[2], data.books[2], 10));
        data.add3(new Loan(data.students[2], data.books[3], 6));
        data.add3(new Loan(data.students[0], data.books[1], 4));

        data.calculateLoan();

        do {
            System.out.println("\n=============================================");
            System.out.println("\tJTI LIBRARY BORROWING SYSTEM");
            System.out.println("=============================================");
            System.out.println("1. Display Student");
            System.out.println("2. Display Books");
            System.out.println("3. Display Borrowings");
            System.out.println("4. Sort by Fines");
            System.out.println("5. Sort by Student ID");
            System.out.println("0. Exit");
            System.out.print("Select menu: ");
            menu = inp.nextInt();
            System.out.println(" ");
            inp.nextLine();

            switch (menu) {
                case 1: 
                    System.out.println("Student List: ");
                    data.display1();
                    break;

                case 2: 
                    System.out.println("Book List: ");
                    data.display2();
                    break;

                case 3: 
                    System.out.println("Loan Data: ");
                    data.display3();
                    break;

                case 4: 
                    System.out.println("Sorting by Fines (DSC): ");
                    data.showSort();
                    break;

                case 5: 
                    System.out.println("Search Student by NIM");
                    System.out.print("Enter NIM: ");
                    String nim = inp.nextLine();

                    data.showSearch(nim);
                    break;

                case 0: 
                    System.out.println("Thank you. Program finished."); 
                    break; 

                default: 
                    System.out.println("Invalid input!");
            }
        } while (menu != 0);
        inp.close();   
    }
}
