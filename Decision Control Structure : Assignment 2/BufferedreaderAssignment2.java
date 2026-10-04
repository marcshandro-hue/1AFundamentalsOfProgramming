import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedreaderAssignment2 {
    public static void main(String[] args) {
        BufferedReader rds = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter your hourly pay rate:");
            String hourlypayInput = rds.readLine();
            double hourlyrate = Double.parseDouble(hourlypayInput);

            System.out.print("Enter total hours worked: ");
            String hoursworkinput = rds.readLine();
            double hourswork = Double.parseDouble(hoursworkinput);

            double grosspay = (hourswork * hourlyrate);

            double taxrate;

            if (grosspay <= 2000){
                taxrate = 0.10;
            } else if (grosspay <= 4000){
                taxrate = 0.12;
            } else if (grosspay <= 10000){
                taxrate = 0.15;
            }else {
                taxrate = 0.20;
            }
            double witholdingtax = grosspay * taxrate;
            double netpay = grosspay - witholdingtax;

            System.out.println("Payroll Summary");
            System.out.printf("Gross Pay: Php %.2f%n", grosspay);
            System.out.printf("Withholding Tax: Php %.2f%n", witholdingtax);
            System.out.printf("Net Pay: Php %.2f%n", netpay);

        } catch (IOException e) {
            System.out.println("Invalid input!");
        } catch (NumberFormatException e){
            System.out.println("Invalid Input!");
        }


    }
}
