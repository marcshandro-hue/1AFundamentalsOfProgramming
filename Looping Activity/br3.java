import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class br3 {
    public static void main(String[] args) throws IOException {
        double balance = 20000.00;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Welcome, Mucho Dinero!");
        System.out.println("Initial Balance: P" + balance+"\n");

        for (;;) {
            try {
            System.out.print("Enter transaction amount (0 to exit): ");
            double amount = Double.parseDouble(reader.readLine());

            if (amount == 0) {
                break;
            }

            if (amount > 0) {
                balance += amount;
                System.out.println("Successfully deposited P" + amount);
            } else {
                double withdrawalAmount = -amount;

                if (balance >= withdrawalAmount) {
                    balance -= withdrawalAmount;
                    System.out.println("Successfully withdrew P" + withdrawalAmount);
                } else {
                    System.out.println("INSUFFICIENT FUNDS!");
                }
            }

            System.out.println("Outstanding Balance: P" + balance+"\n");

        } catch (IOException e) {
            System.out.println("Error reading input. Please try again.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid number.");
        }
    }

        System.out.println("\nProgram exited.");
        System.out.println("Final Outstanding Balance: P" + balance);
    }
}