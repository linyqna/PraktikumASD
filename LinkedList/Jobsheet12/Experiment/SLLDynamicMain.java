package LinkedList.Jobsheet12.Experiment;

import java.util.Scanner;

public class SLLDynamicMain {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        SingleLinkedList sll = new SingleLinkedList();
        int menu;

        do {
            System.out.println("\n=== STUDENT LINKED LIST MENU ===");
            System.out.println("1. Add (At Index)");
            System.out.println("2. Remove (First)");
            System.out.println("3. Remove (Last)");
            System.out.println("4. Remove (By Name)");
            System.out.println("5. Remove (At Index)");
            System.out.println("6. Search Data (Index Of)");
            System.out.println("7. Print All Data");
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
                    System.out.print("Class: "); 
                    String kls = inp.nextLine();
                    System.out.print("GPA: "); 
                    double gpa = inp.nextDouble();
                    inp.nextLine();
                    Student newStd = new Student(nim, nama, kls, gpa);

                    if (menu == 1) {
                        sll.addFirst(newStd);
                    } else if (menu == 2) {
                        sll.addLast(newStd);
                    } else if (menu == 3) {
                        System.out.print("Enter Target Student Name: "); 
                        String key = inp.nextLine();
                        sll.insertAfter(newStd, key);
                    } else {
                        System.out.print("Enter Target Index: "); 
                        int idx = inp.nextInt();
                        sll.insertAt(idx, newStd);
                    }
                    break;

                case 2:
                    sll.removeFirst();
                    System.out.println("First element removed.");
                    break;

                case 3:
                    sll.removeLast();
                    System.out.println("Last element removed.");
                    break;

                case 4:
                    System.out.print("Enter the Name you want to remove: ");
                    String nameKey = inp.nextLine();
                    sll.remove(nameKey);
                    break;

                case 5:
                    System.out.print("Enter the Index you want to remove: ");
                    int delIdx = inp.nextInt();
                    sll.removeAt(delIdx);
                    break;

                case 6:
                    System.out.print("Enter the Name you are looking for: ");
                    String findName = inp.nextLine();
                    int foundIdx = sll.indexOf(findName);
                    if (foundIdx != -1) {
                        System.out.println(findName + " is located at index: " + foundIdx);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 7:
                    sll.print();
                    break;

                case 0:
                    System.out.println("Program finished. Thank you!");
                    break;

                default: 
                    System.out.println("Invalid input!");
            }
        } while (menu != 0);
        inp.close();
    }
}
