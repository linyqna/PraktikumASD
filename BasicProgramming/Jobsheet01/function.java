package BasicProgramming.Jobsheet01;

public class function {

    static final int PRICE_AGLAONEMA = 75000;
    static final int PRICE_YAM = 50000;
    static final int PRICE_ALOCASIA = 60000;
    static final int PRICE_ROSE = 10000;

    public static int calculateIncome(int[] stock) {
        return (stock[0] * PRICE_AGLAONEMA) +
               (stock[1] * PRICE_YAM) +
               (stock[2] * PRICE_ALOCASIA) +
               (stock[3] * PRICE_ROSE);
    }

    public static String getStatus(int income) {
        if (income > 1500000) {
            return "Very Good";
        } else {
            return "Need Evaluation";
        }
    }

    public static void main(String[] args) {

        int[][] stock = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        String[] branchName = {
            "Royal Garden 1",
            "Royal Garden 2",
            "Royal Garden 3",
            "Royal Garden 4"
        };

        System.out.println("=== Royal Garden Branch Income Report ===\n");

        for (int i = 0; i < stock.length; i++) {

            int income = calculateIncome(stock[i]);
            String status = getStatus(income);

            System.out.println(branchName[i]);
            System.out.println("Income : IDR " + income);
            System.out.println("Status : " + status);
            System.out.println("------------------------------");
        }
    }
}
