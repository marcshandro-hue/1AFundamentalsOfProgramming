import javax.swing.JOptionPane;

public class JOptionAssignment4 {
    public static void main(String[] args){

        try {

            JOptionPane.showMessageDialog(null, "Jedi Knight Military Academy Application");

            String heightinput = JOptionPane.showInputDialog("Enter your height: ");
            double height = Double.parseDouble(heightinput);

            String ageinput = JOptionPane.showInputDialog("Enter your age:");
            double age = Double.parseDouble(ageinput);

            String citizenshipcode = JOptionPane.showInputDialog("Enter citizenship code (C - Citizen of Endor, N - Non-citizen): ");

            String recommendeecode = JOptionPane.showInputDialog("Enter recommendee code (R - Recommendee, N - Non-recommendee): ");

            boolean isrecommendee = recommendeecode.equalsIgnoreCase("R");

            boolean meetstandardcriteria = (height >= 200) && (age >= 21 && age <= 25) && citizenshipcode.equalsIgnoreCase("C");

            if (isrecommendee || meetstandardcriteria) {
                JOptionPane.showMessageDialog(null,"Application Status: ACCEPTED");
            } else {
                JOptionPane.showMessageDialog(null,"Application Status: REJECTED");
            }
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Invalid Input!");
        }
    }
}
