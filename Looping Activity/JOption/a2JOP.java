import javax.swing.JOptionPane;

public class a2JOP {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(
                null,
                "Even numbers from 2 to 100 ",
                "Even Numbers from 2 to 100", JOptionPane.INFORMATION_MESSAGE);

        String result = "";

        for (int i = 2; i <= 100; i += 2) {
            result = result + i + ", ";

            if (i % 20 == 0) {
                result = result + "\n";
            }
        }

        JOptionPane.showMessageDialog(
                null,
                result,
                "Even Numbers from 2 to 100", JOptionPane.INFORMATION_MESSAGE);
    }
}