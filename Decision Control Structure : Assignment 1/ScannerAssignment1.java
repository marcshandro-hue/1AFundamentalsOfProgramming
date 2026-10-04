import java.util.Scanner;

public class ScannerAssignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Decision Control Structure: Assignment 2");
        System.out.print("Enter the year: ");
        String input = scanner.next();

        try {
            int year = Integer.parseInt(input);
            boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

            if (isLeap) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid year.");
        }

        scanner.close();
    }
}
