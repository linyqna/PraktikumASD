package Sorting.Jobsheet06;

public class Sorting09 {
    int [] data;
    int size;

    public Sorting09(int[] data) {
        this.data = data;
        this.size = data.length;
    }

    public void bubbleSort() {
        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j < size-i-1; j++) {
                if (data[j] > data[j+1]) {
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < size-1; i++) {
            int min = i;
            for (int j = i+1; j < size; j++) {
                if (data[j] < data[min]) {
                    min = j;
                }
            }
            int temp = data[min];
            data[min] = data[i];
            data[i] = temp;
        }
    }

    void insertionsort() {
        for (int i = 1; i < size; i++) {
            int key = data[i];
            int j = i-1;
            while (j >= 0 && data[j] > key) {
                data[j+1] = data[j];
                j--;
            }
            data[j+1] = key;
        }
    }

    public void print(){
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
