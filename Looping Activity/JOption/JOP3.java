import javax.swing.JOptionPane;
public class JOP3 {
    public static void main(String[] args){
        double balance = 20000.00;
        JOptionPane.showMessageDialog(
                null,
                "Welcome, Mucho Dinero!\n" + "Initial Balance: Php " + balance+"\n",
                "Banking", JOptionPane.INFORMATION_MESSAGE);
        for (;;) {
            try {
                String amountinput =JOptionPane.showInputDialog(
                        null,
                        "Enter transaction amount (0 to exit): ",
                        "Banking", JOptionPane.QUESTION_MESSAGE);
                double amount = Double.parseDouble(amountinput);
                if (amount == 0) {
                    break;
                }
                if (amount > 0) {
                    balance += amount;
                    JOptionPane.showMessageDialog(
                            null,
                            "Successfully deposited Php " + amount,
                            "Banking", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    double withdrawalAmount = -amount;
                    if (balance >= withdrawalAmount) {
                        balance -= withdrawalAmount;
                        JOptionPane.showMessageDialog(
                                null,
                                "Successfully withdrew Php " + withdrawalAmount,
                                "Banking", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(
                                null,
                                "INSUFFICIENT FUNDS!",
                                "Banking", JOptionPane.ERROR_MESSAGE);
                    }
                }
                JOptionPane.showMessageDialog(
                        null,
                        "Outstanding Balance: Php " + balance+"\n",
                        "Banking", JOptionPane.INFORMATION_MESSAGE);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Invalid input! Please enter a valid number.",
                        "Banking", JOptionPane.ERROR_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(
                null,
                "Program exited." + "\nFinal Outstanding Balance: Php " + balance,
                "Banking", JOptionPane.INFORMATION_MESSAGE);
    }
}

