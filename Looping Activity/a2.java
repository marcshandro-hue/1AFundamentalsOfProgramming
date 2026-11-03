public class a2 {
    public static void main(String[] args) {
        System.out.println("Even Numbers from 2 to 100:");
        System.out.println();

        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + "\t");

            if (i % 20 == 0) {
                System.out.println();
            }
        }
    }
}