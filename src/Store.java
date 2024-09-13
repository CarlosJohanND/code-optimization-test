public class Store {
    public static void main(String[] args) {
        /*No entendi que era cada dato :( */
        int p1 = 15;
        int p2 = 10;
        int p3 = 5;

        int total1 = p1 * 2;
        int total2 = p2 * 3;
        int total3 = p3 * 4;

        int totalSales = total1 + total2 + total3;

        if (totalSales > 50) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}
