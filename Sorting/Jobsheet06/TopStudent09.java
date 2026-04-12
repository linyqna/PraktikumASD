package Sorting.Jobsheet06;

public class TopStudent09 {
    Student09[] listSdt;
    int idx;

    TopStudent09(int size) {
        listSdt = new Student09[size];
    }

    public void add(Student09 student) {
        if (idx <= listSdt.length) {
            listSdt[idx] = student;
            idx++;
        } else {
            System.out.println("List is full.");
        }
    }

    public void print() {
        for (int i = 0; i < idx; i++) {
            listSdt[i].print();
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < idx-1; i++) {
            for (int j = 0; j < idx-i-1; j++) {
                if (listSdt[j].gpa > listSdt[j+1].gpa) {
                    Student09 tmp = listSdt[j];
                    listSdt[j] = listSdt[j+1];
                    listSdt[j+1] = tmp;
                }
            }
        }
    }

    public void selectionSort() {
        for (int i = 0; i < idx-1; i++) {
            int min = i;
            for (int j = i+1; j < idx; j++) {
                if (listSdt[j].gpa < listSdt[min].gpa) {
                    min = j;
                }
            }
            Student09 tmp = listSdt[min];
            listSdt[min] = listSdt[i];
            listSdt[i] = tmp;
        }
    }

    public void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Student09 tmp = listSdt[i];
            int j = i;

            while (j > 0 && listSdt[j-1].gpa < tmp.gpa) {
                listSdt[j] = listSdt[j-1];
                j--;
            }
            listSdt[j] = tmp;
        }
    }
}
