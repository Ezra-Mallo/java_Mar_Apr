public class UnderGraduateStudent extends StudentBaseClass
{
    private String major;
    private float scoreJavaProg;
    private char grade;

    public UnderGraduateStudent(String fName, String lName, char mName, String stdNum, int ag, String maj, float sc)
    {
        super(fName, lName, mName, stdNum, ag);
        this.major = maj;
        this.scoreJavaProg = sc;
        this.grade = processGrade(sc);
    }


    @Override
    public void displayStudentDetails()
    {
        System.out.println();
        System.out.println("This call the method from base class using super.displayStudentDetail().");
        super.displayStudentDetails();

        System.out.println("This implements the overide on the super.displayStudentDetail.");
        System.out.printf("An Undergraduate on  major %s, scored %.2f in Java programming which is %c.\n", major, scoreJavaProg, grade);
    }



    public char processGrade(double sc)
    {
        char myVal;

        if (sc >=80 && sc <=100)
        {
            myVal =  'A';
        }
        else if (sc >=70 && sc < 80)
        {
            myVal =  'B';
        }
        else if (sc >=60 && sc < 70)
        {
            myVal =  'C';
        }
        else if (sc >=50 && sc < 60)
        {
            myVal =  'D';
        }
        else if (sc >=40 && sc < 50)
        {
            myVal =  'E';
        }
        else
        {
            myVal =  'F';
        }
        return myVal;
    }



}