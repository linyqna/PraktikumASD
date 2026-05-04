package Stack.Jobsheet10;

import java.util.Scanner;

public class StudentDemo09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        StudentAssignStack09 stack = new StudentAssignStack09(5);

        int menu;

        System.out.println(stack.isEmpty());
        
        do {
            System.out.println("\n=======================");
            System.out.println("\tMenu:");
            System.out.println("=======================");
            System.out.println("1. Submit Assignment");
            System.out.println("2. Grade Assignment");
            System.out.println("3. View Top Assignment");
            System.out.println("4. View All Assignment");
            System.out.println("5. View The First Submit");
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
                    System.out.print("Class: ");
                    String kelas = inp.nextLine();
                    Student09 std = new Student09(name, nim, kelas);
                    stack.push(std);
                    System.out.printf("%s assignment has been successfully submitted!\n", std.name);
                    break;

                case 2: 
                    Student09 graded = stack.pop();
                    if (graded != null) {
                        System.out.println("Grading assignment from " + graded.name);
                        System.out.print("Submit grade (0-100): ");
                        int score = inp.nextInt();
                        graded.grading(score);
                        System.out.printf("Assignment grade of %s is %d\n", graded.name, score);
                    }
                    break;

                case 3: 
                    Student09 peek = stack.peek();
                    if (peek != null) {
                        System.out.println("The last assignment comes from " + peek.name);
                    }
                    break;

                case 4: 
                    System.out.println("List All Assignment");
                    System.out.println("Name\tNIM\tClass");
                    stack.print();
                    break;

                case 5: 
                    Student09 bottom = stack.bottom();
                    System.out.println("The first assignment comes from " + bottom.name);
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
