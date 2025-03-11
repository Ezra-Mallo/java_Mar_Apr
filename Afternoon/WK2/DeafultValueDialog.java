import javax.swing.JOptionPane;

public class DeafultValueDialog
{
    public static void main(String[] args)
    {
        String fname;
        String defaultValue= "enter first name";

        fname = JOptionPane.showInputDialog("Enter first name: ");
        fname = JOptionPane.showInputDialog(null,"Enter first name: ",defaultValue);

    }
}