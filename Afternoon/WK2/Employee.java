public class Employee
{
    private int empNumber = 1000;
    private String firstName ="No first name";
    private String lastName ="No last name";
    private char initials = '-';
    private float height= 0.0f;
    public int salary = 0;


    //---------------------------  empNumber  ---------------------------------------------
    //the is a mutator method used to change/assign a new value to the private data field empNumber
    public void setEmpNumber(int empNo)
    {
        empNumber = empNo;
    }

    //the is a accessor methods used to retrieve the value of the private data field empNumber
    public int getEmpNumber()
    {
        return empNumber;
    }

    //---------------------------  firstName  ---------------------------------------------
    //the is a mutator method used to change/assign a new value to the private data field empNumber
    public void setFirstName(String fName)
    {
        firstName = fName;
    }

    //the is a accessor methods used to retrieve the value of the private data field empNumber
    public String getFirstName()
    {
        return firstName;
    }

    //---------------------------  lastName  ---------------------------------------------
    //the is a mutator method used to change/assign a new value to the private data field empNumber
    public void setLastName(String lName)
    {
        lastName = lName;
    }

    //the is a accessor methods used to retrieve the value of the private data field empNumber
    public String getLastName()
    {
        return lastName;
    }


    //---------------------------  initials  ---------------------------------------------
    //the is a mutator method used to change/assign a new value to the private data field empNumber
    public void setInitials(char init)
    {
        initials = init;
    }

    //the is a accessor methods used to retrieve the value of the private data field empNumber
    public char getInitials()
    {
        return initials;
    }

    //---------------------------  height  ---------------------------------------------
    //the is a mutator method used to change/assign a new value to the private data field empNumber
    public void setHeight(float h)
    {
        height = h;
    }

    //the is a accessor methods used to retrieve the value of the private data field empNumber
    public float getHeight()
    {
        return height;
    }
/*
 * 
 *         //---------------------------  Salary  ---------------------------------------------
    //the is a mutator method used to change/assign a new value to the private data field empNumber
    public void setSalary(int sal)
    {
        salary = sal;
    }

    //the is a accessor methods used to retrieve the value of the private data field empNumber
    public int getSalary()
    {
        return salary;
    }
 */

}