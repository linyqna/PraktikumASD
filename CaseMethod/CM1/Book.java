package CaseMethod.CM1;

public class Book {
    String code, title;
    int year;
    String status;

    public Book(String code, String title, int year) {
        this.code = code;
        this.title = title;
        this.year = year;
    }

    public void printBook() {
        System.out.println("Code: " + code + "|| Title: " + title + "|| Year of Publication: " + year);
    }
}
