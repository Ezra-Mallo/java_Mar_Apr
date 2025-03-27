public class TestStudentObjectNoArray
{
    public static void main (String[] args)
    {
        Student student1 = new Student("Aryan", "Beri", "1001", 20, 98);
        Student student2 = new Student("Amrit", "Kaler", "1002", 21, 78);
        Student student3 = new Student("Gursimranjit", "LNU", "1003", 23, 68);
        Student student4 = new Student("James", "Acobo", "1004", 22, 58);
        Student student5 = new Student("Kartic", "Bavoria", "1005", 24, 48);
        Student student6 = new Student("Krish", "Amin", "1006", 25, 38);

        student1.displayStudentDetails();
        student2.displayStudentDetails();
        student3.displayStudentDetails();
        student4.displayStudentDetails();
        student5.displayStudentDetails();
        student6.displayStudentDetails();


    }
}