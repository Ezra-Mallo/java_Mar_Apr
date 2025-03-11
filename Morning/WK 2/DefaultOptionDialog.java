import javax.swing.JOptionPain;
import javax.swing.JOptionPane;

public class DefaultOptionDialog
{
    public static void main(String[] arg)
    {
        String fName, lName;
        String myDefault = "John";
        fName = JOptionPane.showInputDialog(null, "Enter your first Name:", myDefault);

        lName = JOptionPane.showInputDialog( "Enter your first Name:");

    }
}