package Queue.Jobsheet11;

import java.util.Scanner;

public class QueueMain {
    static void menu() {
        System.out.println("Menu:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("0. Exit");
        System.out.println("==========================");
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Input maximum number of data: ");
        int n = inp.nextInt();
        Queue Q = new Queue(n);
        int menu = -1;

        do {
            menu();
            menu = inp.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("Input new data: ");
                    int newData = inp.nextInt();
                    Q.enqueue(newData);
                    break;
                
                case 2:
                    int outData = Q.dequeue();
                    if (outData != 0) {
                        System.out.println("Remove data: " + outData);
                        break;
                    }
                    break;

                case 3:
                    Q.print();
                    break;

                case 4:
                    Q.peek();
                    break;
            
                case 5:
                    Q.clear();
                    break;

                case 0:
                    Q.exit();
                    break;
            }
        } while (menu ==1 || menu == 2 || menu == 3 || menu == 4 || menu == 5);
        inp.close();
    }
}
