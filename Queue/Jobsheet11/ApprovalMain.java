package Queue.Jobsheet11;

import java.util.Scanner;

public class ApprovalMain {
    public static void main(String[] args) {
       Scanner inp = new Scanner(System.in);

        ApprovalQueue queue = new ApprovalQueue(10);

        int menu; 

        do {
            System.out.println("\n======================================");
            System.out.println("Student Course Registration Form (KRS:");
            System.out.println("======================================");
            System.out.println("1. Add Student");
            System.out.println("2. Process KRS (2 student)");
            System.out.println("3. Display All Data");
            System.out.println("4. Display Front Queue(2 student)");
            System.out.println("5. Display Last Queue (1 student)");
            System.out.println("6. Number on Queue");
            System.out.println("7. Number Processed");
            System.out.println("8. Clear");
            System.out.println("0. Exit");
            System.out.print("Select menu: ");
            menu = inp.nextInt();
            System.out.println(" ");
            inp.nextLine();

            switch (menu) {
                case 1: 
                    System.out.print("Name: ");
                    String name = inp.nextLine();
                    System.out.print("NIM: ");
                    String nim = inp.nextLine();
                    System.out.print("Study Program: ");
                    String prodi = inp.nextLine();
                    System.out.print("Class: ");
                    String kelas = inp.nextLine();

                    StudentApproval std = new StudentApproval(name, nim, prodi, kelas);
                    queue.enqueue(std);
                    break;

                case 2: 
                    queue.process();
                    break;

                case 3: 
                    queue.print();
                    break;

                case 4: 
                    queue.peek2();;
                    break;

                case 5: 
                    queue.rear();
                    break;

                case 6: 
                    System.out.println("Number in Queue: " + queue.size);
                    break;

                case 7: 
                    System.out.println("Number Processed: " + queue.processed);
                    break;

                case 8: 
                    queue.clear();
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
