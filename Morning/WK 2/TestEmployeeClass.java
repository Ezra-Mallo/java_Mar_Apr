public class TestEmployeeClass
{
    public static void main(String[] args)
    {
        //Create first instance of the Employee object
        Employee defaultEmployee;
        defaultEmployee = new Employee();

        String fName = new String();

        displayEmployee(
            defaultEmployee.getEmpNumber(),  
            defaultEmployee.getLastName(), 
            defaultEmployee.getFirstName(), 
            defaultEmployee.getInitials(),  
            defaultEmployee.getHeight(),
            defaultEmployee.salary
            );

        //Create 2nd instance of the Employee object
        Employee firstEmployee = new Employee();

        firstEmployee.setEmpNumber(1001);
        firstEmployee.setLastName("Singh");
        firstEmployee.setFirstName("Akashdeep");
        firstEmployee.setInitials('A');
        firstEmployee.setHeight(5.4f);
        firstEmployee.salary = 6000;
        

        displayEmployee(
            firstEmployee.getEmpNumber(),  
            firstEmployee.getLastName(), 
            firstEmployee.getFirstName(), 
            firstEmployee.getInitials(),  
            firstEmployee.getHeight(),
            firstEmployee.salary);

    }

    public static void displayEmployee(int empNum, String lName, String fName, char ini, float height, int sal )
    {
        

        System.out.printf("Employee with empNumber [%d] is [%s], [%s] [%c]. The height is [%.2f]. You salary is %d\n",
        empNum,  
        lName,
        fName,
        ini,
        height,
        sal);

        System.out.println("---------------------------------------------------------------");
    }
}