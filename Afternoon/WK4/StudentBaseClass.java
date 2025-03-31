/**
 * This is StudentBaseClass object with the following parameters.
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
 */

public class StudentBaseClass
{
    private String firstName;
    private String lastName;
    private char middleName;
    private String studentNumber;
    private int age;



    public StudentBaseClass(String fName, String lName, char mName, String stdNum, int ag)
    {
        this.firstName = fName;
        this.lastName = lName;
        this.middleName = mName;
        this.studentNumber = stdNum;
        this.age = ag;
    }



    public void displayStudentDetails()
    {
        System.out.printf("\n%s %s %c with ID %s is %d year old.", firstName, lastName, middleName, studentNumber, age);
    }

    //Getters/ accessors
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }

    public char getMiddleName()
    {
        return middleName;
    }

    public String getStudentNumber()
    {
        return studentNumber;
    }

    public int getAge()
    {
        return age;
    }
}