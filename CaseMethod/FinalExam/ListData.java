package CaseMethod.FinalExam;

import java.util.Scanner;

public class ListData {

    Node head;
    Node tail;

    public void addTrans(Tax09 tax) {

        Node newNode = new Node(tax);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void displayTrans() {

        if (head == null) {
            System.out.println("No transactions yet.");
            return;
        }

        System.out.println("\n================ Transaction Data ================");
        System.out.printf(
                "%-5s %-10s %-15s %-12s %-12s %-12s %-12s\n",
                "Code", "TNKB", "Name", "Nominal", "Fine", "Month", "Total");

        long totalIncome = 0;

        Node current = head;

        while (current != null) {

            Tax09 t = current.data;
            long total = t.getTotal();

            totalIncome += total;

            System.out.printf(
                    "%-5d %-10s %-15s %-12d %-12d %-12d %-12d\n",
                    t.code, t.vehicle.tnkb, t.vehicle.name, t.nominal, t.fine, t.monthPay, total);
            current = current.next;
        }

        System.out.println("===============================================");
        System.out.println(
                "Total Income = Rp " + totalIncome);
    }

    public void sortByNameAsc() {

        if (head == null || head.next == null) {
            return;
        }

        boolean swapped;

        do {

            swapped = false;

            Node current = head;

            while (current.next != null) {

                if (current.data.vehicle.name.compareToIgnoreCase(
                        current.next.data.vehicle.name) > 0) {

                    Tax09 temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;

                    swapped = true;
                }

                current = current.next;
            }

        } while (swapped);

        System.out.println(
                "Data has been successfully sorted by name.");
    }

    public void payTax(Vehicle09[] vehicleDB, Scanner inp) {
        System.out.print("Input TNKB: ");
        String searchTnkb = inp.nextLine();

        Vehicle09 foundVehicle = null;

        for (int i = 0; i < vehicleDB.length; i++) {
            if (vehicleDB[i] != null &&
                    vehicleDB[i].tnkb.equalsIgnoreCase(searchTnkb)) {

                foundVehicle = vehicleDB[i];
                break;
            }
        }

        if (foundVehicle == null) {
            System.out.println("Vehicle not found.");
            return;
        }

        System.out.println("\nVehicle found");
        System.out.println("Name : " + foundVehicle.name);
        System.out.println("Type : " + foundVehicle.type);
        System.out.println("CC : " + foundVehicle.cc);
        System.out.println("Due month : " +
                foundVehicle.monthMustPay);

        System.out.print("Input due month: ");
        int monthPay = inp.nextInt();
        inp.nextLine();

        Tax09 tax = new Tax09(foundVehicle, monthPay);

        addTrans(tax);

        System.out.println("\nTransaction found");
        System.out.println("Tax : Rp " + tax.nominal);
        System.out.println("Fine : Rp " + tax.fine);
        System.out.println("Total : Rp " + tax.getTotal());
    }
}