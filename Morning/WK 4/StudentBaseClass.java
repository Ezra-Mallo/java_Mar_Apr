/** 
 * @author Ezra Mallo
 * @since 27-03-2025
 * @version 1.0.0 
 * @param fName is a text representing student's first name.
 * @param lName is a text representing student's last name.
 * @param mName is a character representing student's middle name initials.
 * @param stdNum is a text representing student's number.
 * @param age is a text representing student's current age.

 * 
*/
public class StudentBaseClass
{
    private String firstName;
    private String lastName;
    private char middleName;
    private String studentNumber;
    public int age;


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
        System.out.printf("%s %s %c with ID %s is %d years old\n", firstName, lastName, middleName, studentNumber, age);
    }


    //getters or accessors
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

    // Setters or mutators
    public void setFirstName(String fName)
    {
        firstName = fName;
    }

    public void setLastName(String lName)
    {
        lastName = lName;
    }

    public void setFirstName(char mName)
    {
        middleName = mName;
    }

    public void setAge(int ag)
    {
        age = ag;
    }

    public void setStudentNumber(String stdNum)
    {
        studentNumber = stdNum;
    }

}