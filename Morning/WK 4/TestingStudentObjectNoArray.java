public class TestingStudentObjectNoArray
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Akashdeep", "LNU", "1001", 20, 98);
        Student student2 = new Student("Chahana", "Moktan", "1002", 21, 77);
        Student student3 = new Student("Hartik", "Sountra", "1003", 22, 68);
        Student student4 = new Student("Jaskaran", "Singh", "1004", 23, 58);
        Student student5 = new Student("Manmohit", "Singh", "1005", 24, 48);
        Student student6 = new Student("Prince", "Rana", "1006", 25, 38);

        student1.displayStudentDetails();
        student2.displayStudentDetails();
        student3.displayStudentDetails();
        student4.displayStudentDetails();
        student5.displayStudentDetails();
        student6.displayStudentDetails();

    }
}