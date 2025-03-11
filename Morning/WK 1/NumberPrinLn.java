public class NumberPrinLn
{
    public static void main(String[] arg)
    {
        byte myByte;            // variable declaration
        short myShort;          // variable declaration
        int myInt = 70000;      // variable initialization
        double height = 5.1;   
        final float PI = 3.142f;  

        myByte = 127;
        myShort = 32000;

        System.out.println("My Byte is " + myByte);
        System.out.println("My Short is " + myShort);
        System.out.println("My Int is " + myInt);
        System.out.println("My height is " + height);
        System.out.println("My PI is " + PI);

        myByte = 120;
        myShort = 32500;
        myInt = 150000000;
        height = 5.5;   
        /* this is not possible because it should be constant all thorugh the 
        course of the execution due to the final
        */
        //PI = 3.14;  
        
        System.out.println();
        System.out.println("-----------------------------------");
        
        System.out.println("My Byte is " + myByte);
        System.out.println("My Short is " + myShort);
        System.out.println("My Int is " + myInt);
        System.out.println("My height is " + height);
        System.out.println("My PI is " + PI);

    }
}