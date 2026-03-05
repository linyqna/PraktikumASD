package Quiz.Quiz1_Fitriani_1G;

public class Accessories09 {
    String name;
    String category;
    int price;
    int sold;
    int stock;

    public Accessories09() {}

    public Accessories09(String name, String category, int price, int sold, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.sold = sold;
        this.stock = stock;
    } 

    void display() {
        System.out.println("===Accessory Data===");
        System.out.println("Name    : " + name);
        System.out.println("Category: " + category);
        System.out.println("Price   : " + price);
        System.out.println("Sold    : " + sold);
        System.out.println("Stock   : " + stock);
        System.out.println("---------------------");
    }
}
