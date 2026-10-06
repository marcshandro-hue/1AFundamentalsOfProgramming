import java.util.Scanner;

public class ScannerAssingment3 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("College Scholarship Application");

            System.out.print("Enter your NSAT score: ");
            double nsat = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter you parents monthly salary: ");
            double salary = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter you entrance exam score: ");
            double examscore = Double.parseDouble(scanner.nextLine());

            double average = (nsat + examscore) / 2;

            if (nsat < 90 || salary > 10000 || examscore < 85){
                System.out.print("Application Status: REJECTED");
            } else if (salary < 3500 && average > 91) {
                System.out.print("Application Status: ACCEPTED");
            }else
                System.out.print("Application Status: For Further Study");

        }catch (NumberFormatException e ){
            System.out.print("Invalid Input!");
        }
    }
}
