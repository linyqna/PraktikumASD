package CaseMethod.FinalExam;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        ListData list = new ListData();
        Scanner inp = new Scanner(System.in);

        Vehicle09[] vehicleDB = {
            new Vehicle09("B1234AA", "Andi", "2 wheels", 150, 2018, 5),
            new Vehicle09("D5678BB", "Budi", "4 wheels", 1200, 2020, 3),
            new Vehicle09("N9012CC", "Citra", "2 wheels", 300, 2019, 7),
            new Vehicle09("L3456DD", "Dewi", "4 wheels", 800, 2021, 6),
            new Vehicle09("AG7890EE", "Eka", "4 wheels", 3000, 2017, 1)
        };

        int menu;

        do {
            System.out.println("\n======================================");
            System.out.println("\tVEHICLE'S TAX PAYMENT SYSTEM");
            System.out.println("======================================");
            System.out.println("1. Tax Payment");
            System.out.println("2. Display All Transaction");
            System.out.println("3. Sort Transactions by Name");
            System.out.println("0. Exit");
            System.out.print("Choose menu (0-3): ");
            menu = inp.nextInt();
            inp.nextLine();
            System.out.println(" ");

            switch (menu) {
                case 1:
                    list.payTax(vehicleDB, inp);
                    break;

                case 2:
                    list.displayTrans();
                    break;

                case 3:
                    list.sortByNameAsc();
                    list.displayTrans();
                    break;

                case 0:
                    System.out.println("Program finished. Thank you!");
                    break;

                default:
                    System.out.println("Invalid input!");
            }
        } while (menu != 0);
    }
}
