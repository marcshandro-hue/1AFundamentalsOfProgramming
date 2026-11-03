import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class br1 {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int totalNumbers = 10;
        int[] numbers = new int[totalNumbers];

        for (int i = 0; i < totalNumbers; i++) {
            System.out.print("Enter number " + (i + 1) + " of " + totalNumbers + ": ");

            try {
                String input = reader.readLine();

                if (input == null) {
                    System.out.println("Input stream closed.");
                    return;
                }

                numbers[i] = Integer.parseInt(input.trim());

            } catch (IOException e) {
                System.out.println("An Error occurred. Please try again.");
                i--;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid whole number.");
                i--;
            }
        }
        int highest = numbers[0];
        int lowest = numbers[0];

        for (int i = 1; i < totalNumbers; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }

        System.out.println("\n     RESULTS SUMMARY    ");
        System.out.println("\nHighest Number: " + highest);
        System.out.println("Lowest Number:  " + lowest);
    }
}
