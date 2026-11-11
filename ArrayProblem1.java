public class ArrayProblem1 {
    public static void main(String[] args) {               // Ang pangunahing paraan (method) kung saan nagsisimula ang pagtakbo ng Java

    double[] temperatures = new double[5];              // Task 1: Gumagawa at naglalaan ng 1D double array na may pangalang temperatures na may sukat na 5

    temperatures[0] = 32.5;                             // Task 2: Nagtatakda ng 32.5 sa index 0 (temperatura ng unang araw)
    temperatures[1] = 34.0;                             // Task 2: Nagtatakda ng 34.0 sa index 1 (temperatura ng ikalawang araw)
    temperatures[2] = 31.8;                             // Task 2: Nagtatakda ng 31.8 sa index 2 (temperatura ng ikatlong araw)
    temperatures[3] = 33.2;                             // Task 2: Nagtatakda ng 33.2 sa index 3 (temperatura ng ikaapat na araw)
    temperatures[4] = 35.1;                             // Task 2: Nagtatakda ng 35.1 sa index 4 (temperatura ng ikalimang araw)

    System.out.println(" Original Temperatures ");   // Nagpi-print ng pamagat para sa orihinal na listahan ng mga temperatura

    for (int i = 0; i < temperatures.length; i++) {     // Task 3: Gumagamit ng standard for loop at .length property para ikutin ang array
        System.out.println("Day " + (i + 1) + ": " + temperatures[i]); // Ini-print ang bawat araw at ang nararapat na temperature nito sa console
    }                                                   // Sinasara ang for loop block

    temperatures[2] = 32.0;                             // Task 4: Binabago ang temperature sa index 2 (ikatlong araw) mula 31.8 patungong 32.0

    System.out.println("\nUpdated Temperature");     // Nagpi-print ng title para sa updated na output
    System.out.println("Day 3: " + temperatures[2]);    // Task 5: Ini-print ang bagong binagong temperature para sa pangatlong araw sa console

}
}
