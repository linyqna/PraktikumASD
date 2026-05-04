package Stack.Jobsheet10;

public class ConversionStack09 {
    int[] binaryStack;
    int size;
    int top;

    public ConversionStack09() {
        this.size = 32;
        binaryStack = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void masuk(int data) {
        if (isFull()) {
            System.out.println("Stack is already full-filled!");
        } else {
            top++;
            binaryStack[top] = data;
        }
    }

    public int keluar() {
        if (isEmpty()) {
            System.out.println("Stack is still empty!");
            return -1;
        } else {
            int data = binaryStack[top];
            top--;
            return data;
        }
    }
}
