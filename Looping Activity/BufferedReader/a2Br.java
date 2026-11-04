import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a2Br {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Even numbers from 2 to 100");
            System.out.print("Press Enter to start: ");
            br.readLine();

            for (int i = 2; i <= 100; i += 2) {
                System.out.print(i + "\t");

                if (i % 20 == 0) {
                    System.out.println();
                }
            }

        } catch (IOException e) {
            System.out.println("Error input!");
        }
    }
}