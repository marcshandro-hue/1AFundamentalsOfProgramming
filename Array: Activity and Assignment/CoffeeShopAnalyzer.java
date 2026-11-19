public class CoffeeShopAnalyzer {
    public static void main(String[] args) {
        // Gawa muna tayo ng arrays para sa benta at mga araw ng linggo
        int[] weeklySales = {120, 145, 130, 155, 180, 210, 195};
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // I-display natin yung benta bawat araw
        System.out.println(" Daily Sales ");
        for (int i = 0; i < weeklySales.length; i++) {
            // Sabay nating kinukuha yung araw at yung katumbas niyang benta gamit ang i
            System.out.println(daysOfWeek[i] + " sales: " + weeklySales[i]);
        }

        // Kwentahin yung kabuuang benta at average
        int totalSales = 0;
        // Gumamit tayo ng for-each loop para isa-isang i-add yung benta sa total
        for (int dailySale : weeklySales) {
            totalSales += dailySale;
        }

        // Ginawang double yung totalSales para hindi maputol yung decimal pag nag-divide
        double averageSales = (double) totalSales / weeklySales.length;

        System.out.println("\n Weekly Summary ");
        System.out.println("Total Sales: " + totalSales + " cups");
        System.out.println("Average Daily Sales: " + averageSales + " cups");

        //Hanapin kung anong araw yung pinakamalakas at pinakamatumal
        int maxSales = weeklySales[0];
        int minSales = weeklySales[0];
        String bestDay = daysOfWeek[0];
        String worstDay = daysOfWeek[0];

        // Simula tayo sa index 1 kasi naka-set na sa Monday (index 0) yung unang value
        for (int i = 1; i < weeklySales.length; i++) {
            if (weeklySales[i] > maxSales) {
                maxSales = weeklySales[i];
                bestDay = daysOfWeek[i];
            }
            if (weeklySales[i] < minSales) {
                minSales = weeklySales[i];
                worstDay = daysOfWeek[i];
            }
        }

        System.out.println("\n Bests and Worsts ");
        System.out.println("Best day was " + bestDay + " with " + maxSales + " cups.");
        System.out.println("Slowest day was " + worstDay + " with " + minSales + " cups.");
    }
}
