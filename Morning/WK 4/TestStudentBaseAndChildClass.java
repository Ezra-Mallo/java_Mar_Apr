public class TestStudentBaseAndChildClass
{
    public static void main (String[] args)
    {
        StudentBaseClass newStudent = new StudentBaseClass("Ezra", "Mallo",'C',"1001",25);
        UnderGraduateStudent underGradStudent = new UnderGraduateStudent("Ayan", "Vahora", 'S', "1002", 20, "SWDV", 98);

        newStudent.displayStudentDetails();
        underGradStudent.displayStudentDetails();

    }
}