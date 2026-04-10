package Sorting.Jobsheet06;

public class LecturerData09 {
    Lecturer09 [] listLct;
    int idx;

    LecturerData09(int size) {
        listLct = new Lecturer09[size];
    }
    
    public void add(Lecturer09 ltc) {
        if (idx <= listLct.length) {
            listLct[idx] = ltc;
            idx++;
        } else {
            System.out.println("List is full.");
        }
    }

    public void print() {
        for (int i = 0; i < idx; i++) {
            listLct[i].print();
        }
    }

    public void sortingASC() {
        for (int i = 0; i < idx-1; i++) {
            for (int j = 0; j < idx-i-1; j++) {
                if (listLct[j].age > listLct[j+1].age) {
                    Lecturer09 tmp = listLct[j];
                    listLct[j] = listLct[j+1];
                    listLct[j+1] = tmp;
                }
            }
        }
    }

    public void sortingDSC() {
        for (int i = 0; i < idx-1; i++) {
            int min = i;
            for (int j = i+1; j < idx; j++) {
                if (listLct[j].age > listLct[min].age) {
                    min = j;
                }
            }
            Lecturer09 tmp = listLct[min];
            listLct[min] = listLct[i];
            listLct[i] = tmp;
        }
    }
}
