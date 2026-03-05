package Quiz.Quiz1_Fitriani_1G;

public class AccessoriesData09 {
    void display(Accessories09[] arrayOfAccessories) {
        System.out.println("==All Accessories Data==");
        System.out.println("---------------------");
        for (Accessories09 b : arrayOfAccessories) {
            b.display();
        }
    }
    
    void calculateTotalSales(Accessories09[] arrayOfAccessories) {
        Accessories09 sold = arrayOfAccessories[0];
        Accessories09 price = arrayOfAccessories[0];
        
        int total = 0;

        for (Accessories09 b : arrayOfAccessories) {
            total = b.sold * b.price;
            System.out.println("Total sales: " + total);
        }
    }

    void checkStock(Accessories09[] arrayOfAccessories) {
        Accessories09 stock = arrayOfAccessories[0];
        
        for (Accessories09 b : arrayOfAccessories) {
            System.out.println("===Stock Status===");
            if (b.stock > 5) {
                System.out.println("Stock status is MANY");
            } else {
                System.out.println("Stock status is LIMITED");
            }
        }
    }

    void searchCheapestAccessories(Accessories09[] arrayOfAccessories) {
        Accessories09 cheapest = arrayOfAccessories[0];

        for (Accessories09 b : arrayOfAccessories) {
            if (b.price > cheapest.price) {
                cheapest = b;
            } 
        }

        System.out.println("==The Cheapest Accessory==");
        cheapest.display();
    }
}
