public class DataTypeCharAndString
{
    public static void main (String[] args)
    {
        char myLetterA1 = 'A';
        char myLetterA2 = 65;

        char myLetterM1 = 'M';
        char myLetterM2 = 77;

        String fName = "Dev Karan";
        String lName = "Kanada";
        int age = 30;
        int score = 98;




        System.out.println("My Letter A1 = " + myLetterA1);
        System.out.println("My Letter A2 = " + myLetterA2);
        System.out.println("---------------------------------");

        System.out.print("My Letter M1 = " + myLetterM1);
        System.out.print("My Letter M2 = " + myLetterM2);
        System.out.println("---------------------------------");

        //We introduced escape sequence \n
        System.out.print("\nMy Letter M1 = " + myLetterM1);
        System.out.print("\nMy Letter M2 = " + myLetterM2);
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");

        
        System.out.print("Your name is  " + fName + " " + lName + ". You are " + age + " yrs old and your score is " 
        + score); 
        System.out.println(); 

        //demonstrating printf
        System.out.printf("Your name is %s %s. You are %d yrs old and your score is %d\n",fName,lName,age,score );


        System.out.printf("Your name is %s \t\t\t %s. \nYou are %d yrs old and your score is %d\n",fName,lName,age,score );




    }
}