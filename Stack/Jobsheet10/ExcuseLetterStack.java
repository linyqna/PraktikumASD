package Stack.Jobsheet10;

public class ExcuseLetterStack {
    ExcuseLetter09[] stack;
    int top, size;

    ExcuseLetterStack(int size) {
        this.size = size;
        top = -1;
        stack = new ExcuseLetter09[size];
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

    void push(ExcuseLetter09 data) {
        if (!isFull()) {
            top++;
            stack[top] = data;
        } else {
            System.out.println("Stack is already full!");
        }
    }

    ExcuseLetter09 pop() {
        if (!isEmpty()) {
            ExcuseLetter09 data = stack[top];
            top--;
            return data;
        } else {
            System.out.println("There is no data in Stack!");
            return null;
        }
    }

    ExcuseLetter09 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("There is no data in Stack!");
            return null;
        }
    }

    void search(String name) {
        boolean found = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].name.equalsIgnoreCase(name)) {
                System.out.println("Data found:");
                System.out.println("Name\tNIM\tClass");
                System.out.println(stack[i].id + " - " + stack[i].name + " - " + stack[i].kelas);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Data not found!");
        }
    }
}
