package CaseMethod.CM1;

public class LibraryData {
    Student[] students;
    Book[] books;
    Loan[] loans;

    int idx1;
    int idx2;
    int idx3;

    public LibraryData(int size1, int size2, int size3) {
        students = new Student[size1];
        books = new Book[size2];
        loans = new Loan[size3];
    }

    public void add1(Student sdt) {
        if (idx1 < students.length) {
            students[idx1] = sdt;
            idx1++;
        } else {
            System.out.println("List is full.");
        }
    }

    public void display1() {
        for (int i = 0; i < idx1; i++) {
            students[i].printStudent();
        }
    }

    public void add2(Book book) {
        if (idx2 < books.length) {
            books[idx2] = book;
            idx2++;
        } else {
            System.out.println("List is full.");
        }
    }

    public void display2() {
        for (int i = 0; i < idx2; i++) {
            books[i].printBook();
        }
    }

    public void add3(Loan loan) {
        if (idx3 < loans.length) {
            loans[idx3] = loan;
            idx3++;
        } else {
            System.out.println("List is full.");
        }
    }

    public void display3() {
        for (int i = 0; i < idx3; i++) {
            loans[i].printLoan();
        }
    }

    public void calculateLoan() {
        for (int i = 0; i < idx3; i++) {
            loans[i].calculateFine();
        }
    }

    public void fineSort() {
        for (int i = 1; i < idx3; i++) {
            Loan tmp = loans[i];
            int j = i;

            while (j > 0 && loans[j-1].fine < tmp.fine) {
                loans[j] = loans[j-1];
                j--;
            }
            loans[j] = tmp;
        }
    }

    public void countExceed() {
        int count = 0;

        for (int i = 0; i < idx3; i++) {
            int overdue = loans[i].loanPeriod - loans[i].loanLimit;

            if (overdue > 0) {
                count++;
            }
        }
        System.out.println("Number of Student Exceed: " + count);
    }

    public void showSort() {
        fineSort();
        display3();
    }

    public void nimSort() {
    for (int i = 1; i < idx3; i++) {
        Loan temp = loans[i];
        int j = i;

        while (j > 0 && loans[j - 1].students.nim.compareTo(temp.students.nim) > 0) {
            loans[j] = loans[j - 1];
            j--;
        }
        loans[j] = temp;
        }
    }

    public int searchStd(String nim, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;

            if (loans[mid].students.nim.equals(nim)) {
                return (mid);
            } else if (loans[mid].students.nim.compareTo(nim) > 0) {
                return searchStd(nim, left, mid-1);
            } else {
                return searchStd(nim, mid+1, right);
            }
        }
        return -1;
    }

    public void showSearch(String nim) {
        nimSort();
        int pos = searchStd(nim, 0, idx3-1);

        if (pos != -1) {
            loans[pos].printLoan();

            int i = pos - 1;
            while (i >= 0 && loans[i].students.nim.equals(nim)) {
                loans[i].printLoan();
                i--;
            }

            int j = pos + 1;
            while (j < idx3 && loans[j].students.nim.equals(nim)) {
                loans[j].printLoan();
                j++;
            }

        } else {
            System.out.println("Data " + nim + " is not found.");
        }
    }
}
