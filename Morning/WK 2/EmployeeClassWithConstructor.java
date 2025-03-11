public class EmployeeClassWithConstructor
{
    private int empNumber = 1000;
    private String firstName = "No first Name";
    private String lastName = "No last Name";
    private char initials = '-';
    private float  height= 0.0f;
    public int salary = 5000;

    public EmployeeClassWithConstructor(int empNo,String fName, String lName, char init, float h, int sal)
    {
        this.empNumber = empNo;
        this.firstName = fName;
        this.lastName = lName;
        this.initials = init;
        this.height = h;
        this.salary = sal;
    }

    
    //---------------------  empNumber  ----------------------------------------
    //mutators or setter. Used to change the value of the private data field
    public void setEmpNumber(int empNo)
    {
        empNumber = empNo;
    }

    //Accessor or getter. Used for retrieving the value of the private data field
    public int getEmpNumber()
    {
        return empNumber;
    }
   
    //---------------------  firstName  ----------------------------------------
    //mutators or setter. Used to change the value of the private data field
    public void setFirstName(String fName)
    {
        firstName = fName;
    }

    //Accessor or getter. Used for retrieving the value of the private data field
    public String getFirstName()
    {
        return firstName;
    }

    //---------------------  lastName  ----------------------------------------
    //mutators or setter. Used to change the value of the private data field
    public void setLastName(String lName)
    {
        lastName = lName;
    }

    //Accessor or getter. Used for retrieving the value of the private data field
    public String getLastName()
    {
        return lastName;
    }

    //---------------------  initials  ----------------------------------------
    //mutators or setter. Used to change the value of the private data field
    public void setInitials(char init)
    {
        initials = init;
    }

    //Accessor or getter. Used for retrieving the value of the private data field
    public char getInitials()
    {
        return initials;
    }

    //---------------------  height  ----------------------------------------
    //mutators or setter. Used to change the value of the private data field
    public void setHeight(float h)
    {
        height = h;
    }

    //Accessor or getter. Used for retrieving the value of the private data field
    public float getHeight()
    {
        return height;
    }    
}
