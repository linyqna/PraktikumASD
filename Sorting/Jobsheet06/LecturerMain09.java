package Sorting.Jobsheet06;

public class LecturerMain09 {
    public static void main(String[] args) {
        LecturerData09 lect = new LecturerData09(10);

        lect.add(new Lecturer09("001", "Ab", true, 32));
        lect.add(new Lecturer09("002", "Ac", false, 25));
        lect.add(new Lecturer09("003", "Ad", true, 40));
        lect.add(new Lecturer09("004", "Ae", false, 45));
        lect.add(new Lecturer09("005", "Af", true, 21));
        lect.add(new Lecturer09("006", "Ag", true, 37));
        lect.add(new Lecturer09("007", "Ah", false, 29));
        lect.add(new Lecturer09("008", "Ai", false, 27));
        lect.add(new Lecturer09("009", "Aj", true, 28));
        lect.add(new Lecturer09("010", "Ak", true, 32));

        System.out.println("Original list: ");
        lect.print();

        System.out.println("__________________________");
        System.out.println("__________________________");

        lect.sortingASC();
        System.out.println("Sorting list by age (ASC): ");
        lect.print();

        System.out.println("__________________________");
        System.out.println("__________________________");


        lect.sortingDSC();
        System.out.println("Sorting list by age (DSC):  ");
        lect.print();
    }
}
