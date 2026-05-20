package CaseMethod.CM2;

public class Node {
    public static class NodeBuyer {
        RoyalDelish.Buyer customer;
        NodeBuyer prev1, next1;
        public int antrean;

        public NodeBuyer() {}

        public NodeBuyer(int antrean, RoyalDelish.Buyer customer) {
            this.antrean = antrean;
            this.customer = customer;
            prev1 = null;
            next1 = null;
        }

        public NodeBuyer(RoyalDelish.Buyer customer, NodeBuyer prev1, NodeBuyer next1) {
            this.customer = customer;
            this.prev1 = prev1;
            this.next1 = next1;
        }
    }

    public static class NodeOrder {
        RoyalDelish.Order data;
        NodeOrder prev2, next2;

        public NodeOrder() {}

        public NodeOrder(RoyalDelish.Order data) {
            this.data = data;
            prev2 = null;
            next2 = null;
        }

        public NodeOrder(RoyalDelish.Order data, NodeOrder prev2, NodeOrder next2) {
            this.data = data;
            this.prev2 = prev2;
            this.next2 = next2;
        }
    }
}
