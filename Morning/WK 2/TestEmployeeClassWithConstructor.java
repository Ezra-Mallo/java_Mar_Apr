public class TestEmployeeClassWithConstructor
{
    public static void main(String[] args)
    {
        EmployeeClassWithConstructor firstEmployee = new EmployeeClassWithConstructor(
            1002,"Ansh","Pascricha",'B', 5.6f, 6500);
        
        
        
        TestEmployeeClass.displayEmployee(
            firstEmployee.getEmpNumber(),  
            firstEmployee.getLastName(), 
            firstEmployee.getFirstName(), 
            firstEmployee.getInitials(),  
            firstEmployee.getHeight(),
            firstEmployee.salary
            );



    }



}
