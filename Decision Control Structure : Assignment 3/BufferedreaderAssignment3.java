import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedreaderAssignment3 {
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("College Scholarship Application");

            System.out.print("Enter your NSAT score: ");
            String nsatinput = reader.readLine();
            double nsat = Double.parseDouble(nsatinput);

            System.out.print("Enter your parents monthly salary: ");
            String salaryinput = reader.readLine();
            double salary = Double.parseDouble(salaryinput);

            System.out.print("Enter your entrance exam score: ");
            String examscoreinput = reader.readLine();
            double examscore = Double.parseDouble(examscoreinput);

            double average = (nsat + examscore) / 2.0;

            if (salary > 10000 || nsat < 90 || examscore < 85 ){
                System.out.print("Application Status: REJECTED");
            }else if (salary < 3500 && average > 91){
                System.out.print("Application Status: ACCEPTED");
            }else {
                System.out.print("Application Status: For Further Study");
            }


        }catch (IOException e){
            System.out.print("Invalid Input!");
        }catch (NumberFormatException e){
            System.out.print("Invalid Input!");
        }
    }
}
