package Queue.Jobsheet11;

public class StudentQueue {
    Student[] data;
    int front, rear, size, max;

    public StudentQueue(int n) {
        max = n;
        data = new Student[max];
        size = 0;
        front = 0;
        rear = -1;
    }

    boolean isFull() {
        if (size == max) {
            return true;            
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    void peek() {
        if (!isEmpty()) {
            System.out.println("Front data: ");
            data[front].print();
        } else {
            System.out.println("Queue is empty!");
        }
    }

    void print() {
        if (!isEmpty()) {
            int i = front;
            while (i != rear) {
                data[i].print();
                i = (i+1) % max;
            }
            data[i].print();
            System.out.println("Number of element: " + size);
        } else {
            System.out.println("Queue is empty!");
            return;
        }
    }

    void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("All data has been successfully removed!");
        } else {
            System.out.println("Queue is already empty!");
        }
    }

    void enqueue(Student dt) {
        if (!isFull()) {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max-1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
            System.out.printf("%s is successfully added at index %d\n", dt.name, rear);
        } else {
            System.out.println("Queue is full!");
        }
    }

    Student dequeue() {
        Student dt = null;
        if (!isEmpty()) {
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max -1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        } else {
            System.out.println("Queue is empty!");
        }
        return dt;
    }
}
