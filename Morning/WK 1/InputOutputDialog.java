import javax.swing.JOptionPane;

public class InputOutputDialog 
{
    public static void main(String[] args)
    {
        String fName, lName;
        String storeVal;
        int age, score;
        
        fName = JOptionPane.showInputDialog("Enter your first Name:");
        lName = JOptionPane.showInputDialog("Enter your last Name:");

        //JOptionPane.showInputDialog storeds value as string. Use type convertion to capture Number
        storeVal = JOptionPane.showInputDialog("Enter your Age:");                
        age = Integer.parseInt(storeVal);

        score = Integer.parseInt(JOptionPane.showInputDialog("Enter your Score:"));

        JOptionPane.showMessageDialog(null, "Hello " + fName + " " + lName + " You are " + 
        age + " yrs old. And your score is " + score);
    }
}