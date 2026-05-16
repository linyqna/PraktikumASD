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
        boolean found = false;
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
                found = true;
                break;
            }
            tmp = tmp.next;
        }
        if (!found) {
            System.out.println("Insertion failed. Data (" + key + ") not found!");
        }
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Double Linked List is currently empty!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("Double Linked List is currently empty!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    void removeIdx(int idx) {
        if (isEmpty()) {
            System.out.println("Double Linked List is currently empty!");
            return;
        }
        if (idx < 0) {
            System.out.println("Index doesn't valid!");
        }
        if (idx == 0) {
            removeFirst();
        } else {
            Node tmp = head;
            for (int i = 0; i < idx; i++) {
                tmp = tmp.next;
                if (tmp == null) {
                    System.out.println("Index is out of boundaries!");
                    return;
                }
            }
            if (tmp == tail) {
                removeLast();
            } else {
                tmp.prev.next = tmp.next;
                tmp.next.prev = tmp.prev;
            }
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
