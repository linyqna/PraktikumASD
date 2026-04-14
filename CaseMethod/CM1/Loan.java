package CaseMethod.CM1;

public class Loan {
    Student students;
    Book books;

    int loanPeriod;
    int loanLimit;
    int overdue;
    int fine;

    public Loan() {}

    public Loan(Student students, Book books, int loanPeriod) {
        this.students = students;
        this.books = books;
        this.loanPeriod = loanPeriod;
    } 

    public void calculateFine() {
        int lateFee = 2000;
        loanLimit = 5;
        overdue = loanPeriod - loanLimit;

        if (overdue <= 0) {
            fine = 0;
            overdue = 0;
        } else {
            fine = lateFee * overdue;
        }
    }

    public void printLoan() {
        System.out.println("NIM: " + students.nim + "|| Name: " + students.name + "|| Late return of books: " + overdue + "|| Fine: " + fine);
    }
}
