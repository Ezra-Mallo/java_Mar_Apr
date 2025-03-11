import javax.swing.JOptionPane;

public class GetUserInfoDialog
{
    public static void main(String [] args)
    {
        String fName, lName;
        String storeValue;
        int age, score;
        float height;
        fName = JOptionPane.showInputDialog("Enter your first name:");
        lName = JOptionPane.showInputDialog("Enter your last name:");
        storeValue = JOptionPane.showInputDialog("Enter your age:");
        
        //the code below convert the StoreValue from String to Integer       
        age = Integer.parseInt(storeValue);
        score  = Integer.parseInt(JOptionPane.showInputDialog("Enter your score:"));
        
        JOptionPane.showMessageDialog(null, "Your name is " + fName + " " + lName + ". You are " + 
        age +" yrs old and your score is "+ score);


        //fName = JOptionPane.showInputDialog("Enter your first name:");
        //fName = JOptionPane.showInputDialog("Enter your first name:");




    }
}