import javax.swing.JOptionPane;

public class DropDownOption
{
    public static void main(String[] args)
    {
        /**
         * This displays the input dialogue box with a list of options
         */

         
        String[] options = {"SWDV", "NWAD", "Any other"};
       
        String input = (String) JOptionPane.showInputDialog(null,  "Choose your option:",  "Input",             JOptionPane.QUESTION_MESSAGE, null,      options,      options[0]            );
         
    }
}