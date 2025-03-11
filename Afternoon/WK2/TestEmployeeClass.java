public class TestEmployeeClass
{
    public static void main(String [] args)
    {
        /*
        Employee defaultEmployee;
        defaultEmployee = new Employee();
        */
        // same as the above
        Employee defaultEmployee = new Employee();
        
              

        displayInformation(
            defaultEmployee.getEmpNumber(),
            defaultEmployee.getLastName(),
            defaultEmployee.getFirstName(),
            defaultEmployee.getInitials(),
            defaultEmployee.getHeight(), 
            defaultEmployee.salary);

        
        //first emplyee instance
        Employee firstEmployee = new Employee();

        firstEmployee.setEmpNumber(1001);
        firstEmployee.setFirstName("Aryan");
        firstEmployee.setLastName("Beri");
        firstEmployee.setInitials('A');
        firstEmployee.setHeight(5.4f);
        firstEmployee.salary = 5000;
        

        displayInformation(
            firstEmployee.getEmpNumber(),
            firstEmployee.getLastName(),
            firstEmployee.getFirstName(),
            firstEmployee.getInitials(),
            firstEmployee.getHeight(), firstEmployee.salary);




        
        //second emplyee instance
        Employee secondEmployee = new Employee();

        secondEmployee.setEmpNumber(1002);
        secondEmployee.setFirstName("Upashana");
        secondEmployee.setLastName("Khanal");
        secondEmployee.setInitials('B');
        secondEmployee.setHeight(5.5f);
        secondEmployee.salary = 5500;

        displayInformation(
            secondEmployee.getEmpNumber(),
            secondEmployee.getLastName(),
            secondEmployee.getFirstName(),
            secondEmployee.getInitials(),
            secondEmployee.getHeight(),
            firstEmployee.salary);


            displayInformation(
                defaultEmployee.getEmpNumber(),
                defaultEmployee.getLastName(),
                defaultEmployee.getFirstName(),
                defaultEmployee.getInitials(),
                defaultEmployee.getHeight(),
                defaultEmployee.salary);
    
    }

    public static void displayInformation(int empNo, String fName, String lName,char  ini, float h, int sal)
    {

        System.out.printf("Employee with empNumber [%d] is [%s] [%s], [%c.] and the height is [%.2f]. Salary = [%s] \n",
        empNo,
        lName,
        fName,
        ini,
        h, 
        sal);

        System.out.println("---------------------------------------------------------------------------------\n");
        
    }
}
