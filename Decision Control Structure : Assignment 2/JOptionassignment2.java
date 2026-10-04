import javax.swing.JOptionPane;

public class JOptionassignment2 {
    public static void main(String[] args){

        String hourlypayinput = JOptionPane.showInputDialog("Enter your hourly pay rate: ");
        String hoursworkinput = JOptionPane.showInputDialog("Enter total hours worked: ");
        try{
        double hourlypay = Double.parseDouble(hourlypayinput);
        double hourswork = Double.parseDouble(hoursworkinput);
        double grosspay = hourlypay * hourswork;
        
        double taxrate;
        if (grosspay <= 2000){
            taxrate = 0.10;
        } else if (grosspay <= 4000) {
            taxrate = 0.12;
        }else if (grosspay <= 10000) {
            taxrate = 0.15;
        }else {
            taxrate = 0.20;
        }
        double withholdingtax = grosspay * taxrate;
        double netpay = grosspay - withholdingtax;

        JOptionPane.showMessageDialog(null,"Payroll Summary" +
                "\nGross pay: Php " + String.format("%.2f", grosspay) +
                "\nWithholding Tax: Php " + String.format("%.2f", withholdingtax) +
                "\nNet Pay: Php " + String.format("%.2f", netpay));

        } catch (NumberFormatException e){
        System.out.print("Invalid input!");
        }
    }
}
