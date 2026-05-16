package DoubleLinkedList.Jobsheet13.Experiment;

public class DoubleLinkedList {
    Node head;
    Node tail;

    DoubleLinkedList() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(Student data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void addlast(Student data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void insertAfter(String key, Student data) {
        Node newNode = new Node(data);
        Node tmp = head;
        while (tmp != null) {
            if (tmp.data.nim.equalsIgnoreCase(key)) {
                if (tmp == tail) {
                    addlast(data);
                } else {
                    newNode.next = tmp.next;
                    newNode.prev = tmp;
                    tmp.next.prev = newNode;
                    tmp.next = newNode;
                }
            }
            tmp = tmp.next;
        }
        if (tmp == null) {
            System.out.println("Insertion failed. Data (" + key + ") not found!");
        }
    }

    void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                tmp.data.print();
                tmp = tmp.next;
            }
            System.out.println(" ");
        } else {
            System.out.println("Double Linked List is currently empty!");
        }
    }
}
