public class EmployeeClassWithConstructor
{
    private int empNumber = 1000;
    private String firstName ="No first name";
    private String lastName ="No last name";
    private char initials = '-';
    private float height= 0.0f;
    public int salary = 0;


    public  EmployeeClassWithConstructor(int emplN, String fN, String lN, char i, float ht, int sal)
    {
        this.empNumber = emplN;
        this.firstName =fN;
        this.lastName = lN;
        this.initials = i;
        this.height = ht;
        this.salary = sal;

    }


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
}