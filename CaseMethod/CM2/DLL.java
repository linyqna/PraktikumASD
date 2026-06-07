package CaseMethod.CM2;

import CaseMethod.CM2.Node.NodeBuyer;

public class DLL {
    Node.NodeBuyer head1, tail1;
    Node.NodeOrder head2, tail2;

    DLL() {
        head1 = null;
        tail1 = null;
        head2 = null;
        tail2 = null;
    }

    boolean isEmpty1() {
        return head1 == null;
    }

    void addLast1(int antrean, RoyalDelish.Buyer customer) {
        Node.NodeBuyer newNode = new Node.NodeBuyer(antrean, customer);
        if (isEmpty1()) {
            head1 = tail1 = newNode;
        } else {
            tail1.next1 = newNode;
            newNode.prev1 = tail1;
            tail1 = newNode;
        }
    }

    void print1() {
        if (!isEmpty1()) {
            Node.NodeBuyer tmp = head1;
            System.out.printf("%-15s %-10s %-20s%n", "No. Antrean", "Name", "Phone Number");
            while (tmp != null) {
                System.out.printf("%-15d %-10s %-20s%n", tmp.antrean, tmp.customer.name, tmp.customer.phoneNumber);
                tmp = tmp.next1;
            }
            System.out.println(" ");
        } else {
            System.out.println("Antrean is still empty!");
        }
    }

    void removeFirst1() {
        if (isEmpty1()) {
            System.out.println("Antrean is still empty!");
        } else if (head1 == tail1) {
            head1 = tail1 = null;
        } else {
            head1 = head1.next1;
            head1.prev1 = null;
        }
    }

    boolean isEmpty2() {
        return head2 == null;
    }

    void addLast2(RoyalDelish.Order data) {
        Node.NodeOrder newNode = new Node.NodeOrder(data);
        if (isEmpty2()) {
            head2 = tail2 = newNode;
        } else {
            tail2.next2 = newNode;
            newNode.prev2 = tail2;
            tail2 = newNode;
        }
    }

    void sortingOrder() {
        if (!isEmpty2()) {
            Node.NodeOrder tmp = head2.next2;
            while (tmp != null) {
                RoyalDelish.Order key = tmp.data;
                Node.NodeOrder check = tmp.prev2;
                while (check != null && check.data.orderName.compareToIgnoreCase(key.orderName) > 0) {
                    check.next2.data = check.data;
                    check = check.prev2;
                }
                if (check == null) {
                    head2.data = key;
                } else {
                    check.next2.data = key;
                }
                tmp = tmp.next2;
            }
        }
    }

    void print2() {
        sortingOrder();
        if (!isEmpty2()) {
            Node.NodeOrder tmp = head2;
            System.out.printf("%-10s %-10s %-10s %-10s%n", "Order Code", "Order Name", "Price", "Amount");
            while (tmp != null) {
                System.out.printf("%-10d %-10s %-10d %-10d%n", tmp.data.orderCode, tmp.data.orderName, tmp.data.price, tmp.data.amount);
                tmp = tmp.next2;
            }
            System.out.println(" ");
        } else {
            System.out.println("Antrean is still empty!");
        }
    }

    void count() {
        if (isEmpty1()) {
            System.out.println("Antrean is still empty!");
        } else if (head2 == tail2) {
            Node.NodeOrder tmp = head2;
            System.out.println("The total price of all order is " + tmp.data.price);
        } else {
            Node.NodeOrder tmp = head2;
            int count = 0;
            count = count + tmp.data.price;
            System.out.println("The total price of all order is " + count);
        }
    }

    void removeLast() {
        if (isEmpty1()) {
            System.out.println("Double Linked List is currently empty!");
        } else if (head1 == tail1) {
            head1 = tail1 = null;
        } else {
            tail1 = tail1.prev1;
            tail1.next1 = null;
        }
    }

    void removeIdx(int idx) {
        if (isEmpty1()) {
            System.out.println("Double Linked List is currently empty!");
            return;
        }
        if (idx < 0) {
            System.out.println("Index doesn't valid!");
        }
        if (idx == 0) {
            removeFirst1();
        } else {
            NodeBuyer tmp = head1;
            for (int i = 0; i < idx; i++) {
                tmp = tmp.next1;
                if (tmp == null) {
                    System.out.println("Index is out of boundaries!");
                    return;
                }
            }
            if (tmp == tail1) {
                removeLast();
            } else {
                tmp.prev1.next1 = tmp.next1;
                tmp.next1.prev1 = tmp.prev1;
            }
        }
    }
}
