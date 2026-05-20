package CaseMethod.CM2;

public class RoyalDelish {
    public static class Buyer {
        String name;
        String phoneNumber;

        public Buyer() {}
        
        public Buyer(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
    }

    public static class Order {
        int orderCode;
        String orderName;
        int price;

        public Order() {}

        public Order(int orderCode, String orderName, int price) {
            this.orderCode = orderCode;
            this.orderName = orderName;
            this.price = price;
        }
    }
}
