public class TestStudentObjectAsArray
{
    public static void main (String[] args)
    {
        Student[] studentsArray = new Student[6];


        studentsArray[0] = new Student("Aryan", "Beri", "1001", 20, 98);
        studentsArray[1] = new Student("Amrit", "Kaler", "1002", 21, 78);
        studentsArray[2] = new Student("Gursimranjit", "LNU", "1003", 23, 68);
        studentsArray[3] = new Student("James", "Acobo", "1004", 22, 58);
        studentsArray[4] = new Student("Kartic", "Bavoria", "1005", 24, 48);
        studentsArray[5] = new Student("Krish", "Amin", "1006", 25, 38);

        System.out.println("-------------------------using [for loop]-------------------------------");        
        for (int k = 0; k < 6; k++)
        {
            studentsArray[k].displayStudentDetails();
        }

        System.out.println("\n-------------------------using [foreach loop]-------------------------------");        
        for(Student oneStudent : studentsArray)
        {
            oneStudent.displayStudentDetails();
        }
    }
}    
