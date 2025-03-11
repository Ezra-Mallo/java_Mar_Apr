import javax.swing.JOptionPane;

public class DropDownDialog
{
    public static void main(String[] args)
    {
        String[] options = {"1. SWDV","2. NWAD","Any other"};
        String input;

        input = (String) JOptionPane.showInputDialog(
            null,
            "Choose you option:",
            "Your Selection!",
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]);

    }
}