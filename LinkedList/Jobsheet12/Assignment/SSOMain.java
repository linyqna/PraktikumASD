package LinkedList.Jobsheet12.Assignment;

import java.util.Scanner;

public class SSOMain {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        SSOLinkedList sll = new SSOLinkedList();
        int menu;

        do {
            System.out.println("\n== STUDENT SERVICE OPERATION ==");
            System.out.println("1. Add Data");
            System.out.println("2. Remove Data");
            System.out.println("3. Display Data");
            System.out.println("4. Show Data Count");
            System.out.println("0. Exit");
            System.out.print("Select Menu: ");
            menu = inp.nextInt();
            System.out.println(" ");
            inp.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = inp.nextLine();
                    System.out.print("Name: ");
                    String nama = inp.nextLine();
                    System.out.print("Study Program: ");
                    String prodi = inp.nextLine();
                    System.out.print("Class: ");
                    String kls = inp.nextLine();

                    StudentService newStd = new StudentService(nim, nama, prodi, kls);

                    System.out.println("\nWhere do you want to put this data?");
                    System.out.println("1. At the Beginning (First)");
                    System.out.println("2. At the End (Last)");
                    System.out.println("3. After a Specific Name");
                    System.out.print("Your choice: ");
                    int addto = inp.nextInt();
                    inp.nextLine();

                    if (addto == 1) {
                        sll.addFirst(newStd);
                    } else if (addto == 2) {
                        sll.addLast(newStd);
                    } else if (addto == 3) {
                        System.out.print("Enter target name: ");
                        String target = inp.nextLine();
                        sll.insertAfter(newStd, target);
                    } else {
                        System.out.println("Invalid choice.");
                    }
                    break;

                case 2:
                    System.out.println("What data do you want to remove?");
                    System.out.println("1. At the Beginning (First)");
                    System.out.println("2. At the End (Last)");
                    System.out.println("3. At a Specific Name");
                    System.out.println("3. At a Specific Index");
                    System.out.print("Your choice: ");
                    int removefrom = inp.nextInt();
                    inp.nextLine();

                    if (removefrom == 1) {
                        sll.removeFirst();
                    } else if (removefrom == 2) {
                        sll.removeLast();
                    } else if (removefrom == 3) {
                        System.out.print("Enter the Name you want to remove: ");
                        String nameKey = inp.nextLine();
                        sll.removeName(nameKey);
                    } else if (removefrom == 4) {
                        System.out.print("Enter the Index you want to remove: ");
                        int delIdx = inp.nextInt();
                        sll.removeAt(delIdx);
                    }else {
                        System.out.println("Invalid choice.");
                    }
                    break;

                case 3:
                    System.out.println("What data do you want to display?");
                    System.out.println("1. All Data");
                    System.out.println("2. Only First Data (Front)");
                    System.out.println("3. Only Last Data (Rear)");
                    System.out.println("4. After Spesific Name");
                    System.out.print("Your choice: ");
                    int display = inp.nextInt();
                    inp.nextLine();

                    if (display == 1) {
                        sll.print();
                    } else if (display == 2) {
                        sll.front();
                    } else if (display == 3) {
                        sll.rear();
                    } else if (display == 4) {
                        System.out.print("Enter target name: ");
                        String target = inp.nextLine();
                        sll.printNextTo(target);
                    } else {
                        System.out.println("Invalid choice.");
                    }
                    break;

                case 4:
                    sll.totalSize();
                    break;

                case 0:
                    System.out.println("Program finished. Thank you!");
                    break;
            
                default:
                    System.out.println("Invalid input!");
                    break;
            }
            
            
        } while (menu != 0);
        inp.close();
    }
}
