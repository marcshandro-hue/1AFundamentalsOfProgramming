import javax.swing.JOptionPane;

public class JOP1 {
    public static void main(String[] args) {
        int totalNumbers = 10;
        int[] numbers = new int[totalNumbers];

        for (int i = 0; i < totalNumbers; i++) {
            String input = JOptionPane.showInputDialog(
                    null,
                    "Enter number " + (i + 1) + " of " + totalNumbers + ":",
                    "Number Input",
                    JOptionPane.QUESTION_MESSAGE
            );
            if (input == null) {
                JOptionPane.showMessageDialog(
                        null,
                        "Program cancelled by user.",
                        "Cancelled",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }
            try {
                numbers[i] = Integer.parseInt(input.trim());
            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(
                        null,
                        "Invalid input! Please enter a valid whole number.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
                i--;
            }
        }
        int highest = numbers[0];
        int lowest = numbers[0];

        for (int i = 1; i < totalNumbers; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }
        JOptionPane.showMessageDialog(
                null,
                "Results Summary:\n\n" +
                        "Highest Number: " + highest + "\n" +
                        "Lowest Number:  " + lowest,
                "Highest and Lowest Finder",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}