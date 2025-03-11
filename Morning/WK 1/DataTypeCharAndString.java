public class DataTypeCharAndString
{
    public static void main(String[] args)
    {
        char myLetterM1 = 'M';
        char myLetterM2 = 77;
        char myLetterA1 = 'A';
        char myLetterA2 = 65;
        String myFName = "Ayan";
        String myLName = "Vahora";



        System.out.printf("My Letter A1 = %c %n", myLetterA1);        
        System.out.printf("My Letter A2 = %c %n", myLetterA2);
        System.out.println("-------------------------");


        System.out.printf("My Letter M1 = %c \n", myLetterM1);        
        System.out.printf("My Letter M2 = %c \n", myLetterM2);
        System.out.println("-------------------------");


        System.out.printf("My name is %s%s \n", myFName, myLName);
        System.out.printf("My name is %s\t%s \n", myFName, myLName);
        System.out.printf("My name is %s\t\t\t%s \n", myFName, myLName);



    }
}