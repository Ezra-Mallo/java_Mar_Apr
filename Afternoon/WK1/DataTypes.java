public class DataTypes
{
    public static void main(String[] args)
    {
        byte myByte;            //variable declaration for byte data type
        short myShort;          //variable declaration for short datatype
        int myInt = 600000;     //variable declaration and initialization for myInt with value 600000

        myByte = 120;
        myShort = 32000;


        System.out.println("My Byte is " + myByte);
        System.out.println("My Short is " + myShort);
        System.out.println("My Int is " + myInt);
        
        myInt = 700000;      
        myByte = 125;
        myShort = 30000;


        System.out.println();
        System.out.println("-------------------");

        System.out.println("My Byte is " + myByte);
        System.out.println("My Short is " + myShort);
        System.out.println("My Int is " + myInt);

        

    }
}
