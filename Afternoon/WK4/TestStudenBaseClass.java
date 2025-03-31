public class TestStudenBaseClass
{
    public static void main(String [] args)
    {
        StudentBaseClass newStudent = new StudentBaseClass("Dev", "Kanda", 'K',"1001", 25);
        UnderGraduateStudent underGradStudent = new UnderGraduateStudent("Gursimranjit","LNU", 'S', "1002", 26, "SWDV",98);

        newStudent.displayStudentDetails();
        underGradStudent.displayStudentDetails();
    }
}