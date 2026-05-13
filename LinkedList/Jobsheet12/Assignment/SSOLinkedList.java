package LinkedList.Jobsheet12.Assignment;

public class SSOLinkedList {
    Node head;
    Node tail;
    int size = 0, limit = 10;

    boolean isEmpty() {
        return (head == null);
    }

    boolean isFull() {
        return size >= limit;
    }

    void addFirst(StudentService std) {
        Node newNode = new Node(std, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
        System.out.println("Data is succesfully added!");
    }

    void addLast(StudentService std) {
        Node newNode = new Node(std, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        System.out.println("Data is succesfully added!");
    }

    void insertAfter(StudentService std, String key) {
        if (isEmpty()) {
            System.out.println("LinkedList is empty, cannot use Insert After method!");
            return;
        } else {
            Node newNode = new Node(std, null);
            Node temp = head;
            boolean found = false;
            do {
                if (temp.data.name != null && temp.data.name.equalsIgnoreCase(key)) {
                    newNode.next = temp.next;
                    temp.next = newNode;
                    if (newNode.next == null) {
                        tail = newNode;
                    }
                    found = true;
                    break;
                }
                temp = temp.next;
                size++;
                System.out.println("Data is succesfully added!");
            } while (temp != null);

            if (!found) {
                System.out.println("Student " + key + " not found.");
            }
        }
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("LinkedList is empty");
        } else if (head == tail) {
            head = tail = null;
            size--;
            System.out.println("Data succesfully removed!");
        } else {
            head = head.next;
            size--;
            System.out.println("Data succesfully removed!");
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("LinkedList is empty");
        } else if (head == tail) {
            head = tail = null;
            size--;
            System.out.println("Data succesfully removed!");
        } else {
            Node tmp = head;
            while (tmp.next != tail) {
                tmp = tmp.next;
            }
            tmp.next = null;
            tail = tmp;
            size--;
            System.out.println("Data succesfully removed!");
        }
    }
    
    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
            size--;
            System.out.println("Data succesfully removed!");
        }
    }

    public void removeName(String key) {
        if (isEmpty()) {
            System.out.println("LinkedList is empty!");
        } else {
            Node temp = head;
            boolean found = false;
            while (temp != null) {
                if (temp.data.name.equalsIgnoreCase(key) && temp == head) {
                    removeFirst();
                    break;
                } else if (temp.data.name.equalsIgnoreCase(key)) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    found = true;
                    break;
                }
                temp = temp.next;
            }
            if (found) {
                size--;
                System.out.println("Data succesfully removed!");
            } else {
                System.out.println("Data not found!");
            }
        }
    }

    void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("LinkedList Data:");
            System.out.printf("%-10s %-10s %-20s %-10s%n", "NIM", "Name", "Study Program", "Class");
            while (tmp != null) {
                tmp.data.print();
                tmp = tmp.next;
            }
        } else {
            System.out.println("LinkedList is empty!");
        }
    }

    void printNextTo(String key) {
        if (isEmpty()) {
            System.out.println("LinkedList is empty!");
            return;
        } else {
            Node tmp = head;
            boolean found = false;
            while (tmp != null) {
                if (tmp.data.name.equalsIgnoreCase(key)) {
                    found = true;
                    if (tmp.next != null) {
                        System.out.println("Student next to " + key + " is:");
                        tmp.next.data.print();
                    } else {
                        System.out.println(key + " is the last student. No one is next to them.");
                    }
                    break; 
                }
                tmp = tmp.next;
            }
            if (!found) {
                System.out.println("Student named " + key + " not found.");
            } 
        }
    }

    void front() {
        if (!isEmpty()) {
            System.out.println("Front LinkedList Data:");
            head.data.print();
        } else {
            System.out.println("LinkedList is empty!");
        }
    }

    void rear() {
        if (!isEmpty()) {
            System.out.println("Rear LinkedList Data:");
            tail.data.print();
        } else {
            System.out.println("LinkedList is empty!");
        }
    }

    void totalSize() {
        System.out.println("Total Number of Student in LinkedList: " + size);
    }
}
