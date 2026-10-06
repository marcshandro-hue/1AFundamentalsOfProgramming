import javax.swing.JOptionPane;

public class JOptionAssignment3 {
    public static void main(String[] args){
        try{
            JOptionPane.showMessageDialog(null,"College Scholarship Application!");
            String nsatinput = JOptionPane.showInputDialog("Enter your NSAT score: ");
            String salaryinput = JOptionPane.showInputDialog("Enter your parents monthly salary: ");
            String examscoreinput = JOptionPane.showInputDialog("Enter your entrance exam score: ");

            double nsat = Double.parseDouble(nsatinput);
            double salary = Double.parseDouble(salaryinput);
            double examscore = Double.parseDouble(examscoreinput);

            double average = (nsat + examscore) / 2;

            if (nsat < 90 || salary > 10000 || examscore < 85){
                JOptionPane.showMessageDialog(null,"Application Status: REJECTED");
            } else if (salary < 3500 && average > 91) {
                JOptionPane.showMessageDialog(null,"Application Status: ACCEPTED");
            }else {
                JOptionPane.showMessageDialog(null,"Application Status: For Further Study");
            }

        }catch (NumberFormatException e){
            System.out.print("Invalid Input!");
        }
    }
}
