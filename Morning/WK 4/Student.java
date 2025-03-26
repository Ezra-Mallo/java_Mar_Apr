public class Student
{
    private String firstName;
    private String lastName;
    private String studentNumber;
    private int age;
    private double score;
    private char grade;

    public  Student (String fName, String lName, String stNum, int ag, double sc)
    {
        this.firstName = fName;
        this.lastName = lName;
        this.studentNumber = stNum;
        this.age = ag;
        this.score = sc;
        this.grade = processGrade(sc);
    }
    public char getGrade()
    {
        return grade;
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

    public void displayStudentDetails()
    {
        System.out.printf("Student name: %s %s, Student Number : %s, Student Age: %d, Student Score: %.2f, Student grade: %c.\n", firstName, lastName, studentNumber, age, score, grade);
        System.out.printf("---------------------------------------------------------------------------------------------------\n");
        
    }


}