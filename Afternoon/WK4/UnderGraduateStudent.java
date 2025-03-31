/**
 * This is UnderGraduateStudent object with the following parameters.
 * @author Ezra Mallo
 * @version 1.0.0
 * @since 27-03-2025
 * @return nil
 * 
 * @param fname is a text representing Student's first name
 * @param lname is a text representing Student's last name
 * @param mname is a char representing Student's middle name  initials
 * @param stdNum is a text representing Student's number
 * @param age is a number representing Student's age
 * @param maj is a number representing Student's major
 * @param sc is a number representing Student's score in Java Programming
 * 

 */

 public class UnderGraduateStudent extends StudentBaseClass
{
    private String major;
    private float scoreJavaProg;
    private char grade;


    public UnderGraduateStudent(String fName, String lName, char mName, String stdNum, int ag, String maj, float sc)
    {
        super(fName,  lName,  mName, stdNum, ag);
        this.major = maj;
        this.scoreJavaProg = sc;
        this.grade = processGrade(sc);    
    }



    public char processGrade(double sc)
    {
        char myVal;
        if(sc >= 80 && sc <= 100)
        {
            myVal = 'A';
        }
        else if(sc >= 70 && sc < 80)
        {
            myVal = 'B';
        }        
        else if(sc >= 60 && sc < 70)
        {
            myVal = 'C';
        }        
        else if(sc >= 50 && sc < 60)
        {
            myVal = 'D';
        }        
        else if(sc >= 40 && sc < 50)
        {
            myVal = 'E';
        }        
        else  
        {
            myVal = 'F';
        }   
        
        return myVal;
    }

    @Override
    public void displayStudentDetails()
    {
        System.out.println("\n-------------------------------------------------------------------\n");        
        super.displayStudentDetails();
        System.out.printf("\nAn undergraduate Student on major %s, scored %.2f in Java Programming which is %c.\n",major, scoreJavaProg, grade);
        System.out.println("-------------------------------------------------------------------\n");        
    } 
}