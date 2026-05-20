package CaseMethod.CM2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        DLL dll = new DLL();
        int menu, countAntrean = 1;
        
        do {
            System.out.println("\n======================================");
            System.out.println("\tROYAL DELISH QUEUE SYSTEM");
            System.out.println("======================================");
            System.out.println("1. Add Queue");
            System.out.println("2. Print Queue");
            System.out.println("3. Remove Queue and Messages");
            System.out.println("4. Order Report");
            System.out.println("0. Exit");
            System.out.print("Select Menu: ");
            menu = inp.nextInt();
            inp.nextLine();
            System.out.println(" ");

            switch (menu) {
                case 1:
                    System.out.print("Buyer Name: ");
                    String name = inp.nextLine();
                    System.out.print("Phone Number: ");
                    String number = inp.nextLine();
                    
                    RoyalDelish.Buyer newBuyer = new RoyalDelish.Buyer(name, number);
                    dll.addLast1(countAntrean, newBuyer);
                    
                    System.out.println(name + " has been successfully added to antrean number: " + countAntrean);
                    countAntrean++;
                    break;
                
                case 2:
                    dll.print1();
                    break;

                case 3:
                    System.out.print("Order Code: ");
                    int code = inp.nextInt();
                    inp.nextLine();
                    System.out.print("Order Name: ");
                    String order = inp.nextLine();
                    System.out.print("Price: ");
                    int price = inp.nextInt();

                    RoyalDelish.Order newOrder = new RoyalDelish.Order(code, order, price);
                    dll.addLast2(newOrder);

                    String nama = dll.head1.customer.name;
                    String beli = dll.tail2.data.orderName;
                    System.out.println(nama + " has been ordered " + beli + ".");
                    dll.removeFirst1();
                    break;

                case 4:
                    dll.print2();
                    break;

                case 0:
                    System.out.println("Program finished. Thank you!");
                    break;
            
                default:
                    System.out.println("Invalid input!");
                    break;
            }
        } while (menu != 0);
    }
}
