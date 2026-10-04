import java.io.*;

public class FifthJava {
    public static void main(String[] args)
    {
        BufferedReader dataln = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.print("Enter your age: ");
            String ageinput = dataln.readLine();
            int age = Integer.parseInt(ageinput);
            System.out.print("Enter your height in meters: ");
            String heightinput = dataln.readLine();
            Double height = Double.parseDouble(heightinput);
            System.out.print("You are " + age + " years old and " + height + "m tall. ");
        }
        catch(IOException e)
        {
            System.err.println("Error reading input stream.");
        } catch(NumberFormatException e)
        {
            System.err.println("Invalid number format! Please enter digits only.");
        }


    }
}
