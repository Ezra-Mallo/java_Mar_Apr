public class TestEmployeeClassWithConstructor
{
    public static void main(String [] args)
    {
        /*
        Employee defaultEmployee;
        defaultEmployee = new Employee();
        */
        // same as the above
        EmployeeClassWithConstructor firstEmployee = new EmployeeClassWithConstructor(1003,"Dev", "Karan",'C',5.6f, 6000 );
        EmployeeClassWithConstructor secondEmployee = new EmployeeClassWithConstructor(1004,"Harman", "Singh",'D',5.7f, 6500 );

        TestEmployeeClass.displayInformation(
            firstEmployee.getEmpNumber(),
            firstEmployee.getLastName(),
            firstEmployee.getFirstName(),
            firstEmployee.getInitials(),
            firstEmployee.getHeight(),
            firstEmployee.salary);


            
        TestEmployeeClass.displayInformation(
            secondEmployee.getEmpNumber(),
            secondEmployee.getLastName(),
            secondEmployee.getFirstName(),
            secondEmployee.getInitials(),
            secondEmployee.getHeight(),
            secondEmployee.salary);
    }
}
        