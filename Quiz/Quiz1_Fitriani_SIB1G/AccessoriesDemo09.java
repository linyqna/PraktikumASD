package Quiz.Quiz1_Fitriani_SIB1G;

import java.util.Scanner;

public class AccessoriesDemo09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String name;
        String category;
        int price;
        int sold;
        int stock;
        int n;

        System.out.print("Input Total Number of Accessories: ");
        n = inp.nextInt();
        inp.nextLine();

        Accessories09[] arrayOfAccessories = new Accessories09[n];

        for (int i = 0; i < arrayOfAccessories.length; i++) {
            System.out.println("Input The " + (i + 1) + " Accessory");
            System.out.print("Name    : ");
            name = inp.nextLine();
            System.out.print("Category: ");
            category = inp.nextLine();
            System.out.print("Price   : ");
            price = inp.nextInt();
            System.out.print("Sold    : ");
            sold = inp.nextInt();
            System.out.print("Stock   : ");
            stock = inp.nextInt();
            System.out.println("---------------------");
            inp.nextLine();

            arrayOfAccessories[i] = new Accessories09(name, category, price, sold, stock);
        } inp.close();

        AccessoriesData09 aksesori = new AccessoriesData09();

        aksesori.display(arrayOfAccessories);
        aksesori.calculateTotalSales(arrayOfAccessories);
        aksesori.checkStock(arrayOfAccessories);
        aksesori.searchCheapestAccessories(arrayOfAccessories);
    }
}
