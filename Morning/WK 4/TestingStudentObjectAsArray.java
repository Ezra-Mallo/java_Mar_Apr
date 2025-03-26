public class TestingStudentObjectAsArray
{
    public static void main(String[] args)
    {
        Student[] students = new Student[6];

        students[0] = new Student("Akashdeep", "LNU", "1001", 20, 98);
        students[1] = new Student("Chahana", "Moktan", "1002", 21, 77);
        students[2] = new Student("Hartik", "Sountra", "1003", 22, 68);
        students[3] = new Student("Jaskaran", "Singh", "1004", 23, 58);
        students[4] = new Student("Manmohit", "Singh", "1005", 24, 48);
        students[5] = new Student("Prince", "Rana", "1006", 25, 38);
        
        System.out.println("\n--------------using [for loop]-------------------------------");
        for (int k = 0; k < 6; k++)
        {
            students[k].displayStudentDetails();
        }
        System.out.println("\n--------------using [foreach loop]-------------------------------");

        for (Student student : students)
        {
            student.displayStudentDetails();
        }


    }
}