import java.util.Scanner;

public class ScannerAssignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your hourly pay rate: ");
            double hourlypay = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter total hours worked: ");
            double hourswork = Double.parseDouble(scanner.nextLine());

            double grosspay = hourlypay * hourswork;
            double taxrate;
            if (grosspay <= 2000) {
                taxrate = 0.10;
            } else if (grosspay <= 4000) {
                taxrate = 0.12;
            } else if (grosspay <= 10000) {
                taxrate = 0.15;
            } else {
                taxrate = 0.20;
            }
            double withholdingtax = grosspay * taxrate;
            double netpay = grosspay - withholdingtax;

            System.out.println("Payroll Summary");
            System.out.printf("Gross Pay: Php %.2f%n", grosspay);
            System.out.printf("Withholding Tax: Php %.2f%n", withholdingtax);
            System.out.printf("Net Pay: Php %.2f%n", netpay);

        } catch (NumberFormatException e) {
            System.out.println("Invalid Input!");
        }
    }
}


