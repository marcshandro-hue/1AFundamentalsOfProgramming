import java.io.*;

public class Labquiz1 {
    public static void main(String[] args)
    {
        BufferedReader dataln = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.print("Enter your birth year: ");
            String birthinput = dataln.readLine();
            int birthyear = Integer.parseInt(birthinput);
            String currentyearstring = "2026";
            Integer currentyear = Integer.parseInt(currentyearstring);




            System.out.println("You were born last " + birthyear);
            System.out.println("You are now " + (currentyear-birthyear) + " yrs old.");
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
