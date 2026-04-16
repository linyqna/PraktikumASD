package CaseMethod.CM1;

public class Book {
    String code, title, publisher;
    int year;
    String status;

    public Book(String code, String title, int year, String publisher) {
        this.code = code;
        this.title = title;
        this.year = year;
        this.publisher = publisher;
    }

    public void printBook() {
        System.out.println("Code: " + code + "|| Title: " + title + "|| Year of Publication: " + year + "|| Publisher: " + publisher);
    }
}
