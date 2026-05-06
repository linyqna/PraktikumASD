package Queue.Jobsheet11;

import java.util.Scanner;

public class StudentQueueMain {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        StudentQueue queue = new StudentQueue(5);

        int menu;

        do {
            System.out.println("\n=== Academic Service Menu ===");
            System.out.println("1. Enqueue Student");
            System.out.println("2. Dequeue Student");
            System.out.println("3. Display Front");
            System.out.println("4. Display All Data");
            System.out.println("5. Queue Size");
            System.out.println("6. Display Rear");
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

                    Student std = new Student(name, nim, prodi, kelas);
                    queue.enqueue(std);
                    break;

                case 2: 
                    Student stdServed = queue.dequeue();
                    if (stdServed != null) {
                        System.out.println("Student being served:");
                        stdServed.print();
                    }
                    break;

                case 3: 
                    queue.peek();
                    break;

                case 4: 
                    queue.print();
                    break;

                case 5: 
                    System.out.println("Queue size: " + queue.size);
                    break;

                case 6: 
                    queue.rear();
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
