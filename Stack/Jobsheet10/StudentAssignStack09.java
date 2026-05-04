package Stack.Jobsheet10;

public class StudentAssignStack09 {
    Student09[] stack;
    int top, size;

    StudentAssignStack09(int size) {
        this.size = size;
        top = -1;
        stack = new Student09[size];
    }

    boolean isFull() {
        if (top == size-1) {
            return true;            
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    void push(Student09 std) {
        if (!isFull()) {
            top++;
            stack[top] = std;
        } else {
            System.out.println("Stack is already full!");
        }
    }

    Student09 pop() {
        if (!isEmpty()) {
            Student09 std = stack[top];
            top--;
            return std;
        } else {
            System.out.println("There is no data in Stack!");
            return null;
        }
    }

    Student09 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("There is no data in Stack!");
            return null;
        }
    }

    Student09 bottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("There is no data in Stack!");
            return null;
        }
    }

    int count() {
        return top + 1;
    }

    void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nim + "\t" + stack[i].name + "\t" + stack[i].kelas);
        }
        System.out.println(" ");
    }
}
