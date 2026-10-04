import java.util.Scanner;
import java.io.*;

public class Labquiz2 {
    public static void main(String[] args)
    {
        System.out.println("Welcome to Adobo Cooking Show");
        String name;
        Double kilograms;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        name = inputDevice.nextLine();
        System.out.print("How many kilo of pork will you cook? ");
        kilograms = inputDevice.nextDouble();


        Double soy = kilograms * (1.0 / 2.0);
        Double vinegar = kilograms * (1.0 / 3.0);


        System.out.println("The ratio of soy sauce for " + kilograms + " kg is = " + String.format("%.2f", soy));
        System.out.println("The ratio of vinegar for " + kilograms + " kg is = " + String.format("%.2f", vinegar));
    }
}

