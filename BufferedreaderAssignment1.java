import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedreaderAssignment1 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Decision Control Structure: Assignment 1");
            System.out.print("Enter the year: ");
        try {
            String input = reader.readLine();
            int year = Integer.parseInt(input);

            boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

            if (isLeap) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " year is not a leap year.");
            }
        }
            catch (IOException e){
                System.out.println("an error accourred while reading input");
            }
            catch (NumberFormatException e){
                System.out.println("Invalid import! please enter a valid numerical year.");
            }
        }

    }


