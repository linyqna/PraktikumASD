package Stack.Jobsheet10;

import java.util.Scanner;

public class ExcuseLetterDemo {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int menu;

        ExcuseLetterStack stack = new ExcuseLetterStack(5);

        do {
            System.out.println("\n=======================");
            System.out.println("\tMenu:");
            System.out.println("=======================");
            System.out.println("1. Submit Excuse Letter");
            System.out.println("2. Process Excuse Letter");
            System.out.println("3. View Latest Excuse Letter");
            System.out.println("4. Search by Name");
            System.out.println("0. Exit");
            System.out.print("Select menu: ");
            menu = inp.nextInt();
            System.out.println(" ");
            inp.nextLine();

            switch (menu) {
                case 1: 
                    System.out.print("Name: ");
                    String name = inp.nextLine();
                    System.out.print("ID: ");
                    String nim = inp.nextLine();
                    System.out.print("Class: ");
                    String kelas = inp.nextLine();
                    System.out.print("Type (S/I): ");
                    char type = inp.next().charAt(0);
                    System.out.print("Duration (days): ");
                    int duration = inp.nextInt();
                    
                    ExcuseLetter09 letter = new ExcuseLetter09(name, nim, kelas, type, duration);
                    stack.push(letter);
                    break;

                case 2: 
                    ExcuseLetter09 processed = stack.pop();
                    if (processed != null) {
                        System.out.printf("Processing letter from %s\n", processed.name);
                    }
                    break;

                case 3: 
                    ExcuseLetter09 top = stack.peek();
                    if (top != null) {
                        System.out.println("The lastest excuse letter comes from " + top.name + "(" + top.type + ")");
                    }
                    break;

                case 4: 
                    System.out.print("Enter name to search: ");
                    String search = inp.nextLine();
                    stack.search(search);
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
