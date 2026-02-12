package BasicProgramming.Jobsheet01;

import java.util.Scanner;

public class duty2 {
    static Scanner inp = new Scanner(System.in);

    public static void inputSchedule(String[][] schedule, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nSchedule " + (i + 1));
            System.out.print("Course Name: ");
            schedule[i][0] = inp.nextLine();

            System.out.print("Room: ");
            schedule[i][1] = inp.nextLine();

            System.out.print("Day: ");
            schedule[i][2] = inp.nextLine();

            System.out.print("Time: ");
            schedule[i][3] = inp.nextLine();
        }
    }

    public static void displayAll(String[][] schedule, int n) {
        System.out.println("\n===== FULL SCHEDULE =====");
        System.out.printf("%-20s %-15s %-10s %-10s\n",
                "Course", "Room", "Day", "Time");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-20s %-15s %-10s %-10s\n",
                    schedule[i][0], schedule[i][1],
                    schedule[i][2], schedule[i][3]);
        }
    }

    public static void displayByDay(String[][] schedule, int n) {
        System.out.print("\nEnter day: ");
        String day = inp.nextLine();

        System.out.println("\nSchedule on " + day + ":");

        for (int i = 0; i < n; i++) {
            if (schedule[i][2].equalsIgnoreCase(day)) {
                System.out.println(schedule[i][0] + " | " +
                                   schedule[i][1] + " | " +
                                   schedule[i][3]);
            }
        }
    }

    public static void displayByCourse(String[][] schedule, int n) {
        System.out.print("\nEnter course name: ");
        String course = inp.nextLine();

        for (int i = 0; i < n; i++) {
            if (schedule[i][0].equalsIgnoreCase(course)) {
                System.out.println("\nCourse Found:");
                System.out.println("Room : " + schedule[i][1]);
                System.out.println("Day  : " + schedule[i][2]);
                System.out.println("Time : " + schedule[i][3]);
            }
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter number of schedules: ");
        int n = Integer.parseInt(inp.nextLine());

        String[][] schedule = new String[n][4];

        inputSchedule(schedule, n);
        displayAll(schedule, n);
        displayByDay(schedule, n);
        displayByCourse(schedule, n);

        inp.close();
    }
}
