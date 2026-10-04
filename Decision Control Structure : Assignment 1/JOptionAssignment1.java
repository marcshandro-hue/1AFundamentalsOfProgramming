import javax.swing.JOptionPane;

public class JOptionAssignment1 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Decision Control Structure: Assignment 1");
        String yearinput = JOptionPane.showInputDialog("Enter the year: ");
        try {
            int year = Integer.parseInt(yearinput);
            boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

            if (isLeap) {
                JOptionPane.showMessageDialog(null, year + " is a leap year.");
            } else {
                JOptionPane.showMessageDialog(null, year + " year is not a leap year.");
            }
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, " Invalid Input! Please enter a valid year");
        }
    }
}

