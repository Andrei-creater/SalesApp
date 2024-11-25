package app;

public class Main {
    public static void main(String[] args) {

        String product1 = "smartphone";
        int quantity1 = 15;
        double price1 = 809.56;
        int days1 = 5;

        double totalSales1 = quantity1 * price1;
        double salesByDay1 = totalSales1 / days1;

        String product2 = "laptop";
        int quantity2 = 7;
        double price2 = 1498.12;
        int days2 = 7;

        double totalSales2 = quantity2 * price2;
        double salesByDay2 = totalSales2 / days2;

        System.out.printf("Product No 1: %s,%ntotal sales for %d days is EUR %.2f,%nsales by day is EUR %.2f.%n",
                product1, days1, totalSales1, salesByDay1);

        System.out.printf("Product No 2: %s,%ntotal sales for %d days is EUR %.2f,%nsales by day is EUR %.2f.%n",
                product2, days2, totalSales2, salesByDay2);
    }
}
