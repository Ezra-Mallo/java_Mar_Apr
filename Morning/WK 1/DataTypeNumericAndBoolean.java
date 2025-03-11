public class DataTypeNumericAndBoolean
{
    public static void main(String[] args)
    {
        /*
        int num1 = 30;
        int num2 = 35;
        int num3 = 50;
        */

        // lines 6 to 8 is same as line 12
        int num1 = 30, num2 = 35, num3 = 50;
        byte myByte = 120;
        short myShort= 32_000;
        int myInt = 72_000;
        long myLong = 150_000_000;
        float myFloat = 12.123456f;
        double myDouble = 150.123456789012345;
        
        boolean isGreater;

        isGreater = num1 > num2;

        System.out.println("Num1 > Num2 :" + isGreater);
        System.out.println("-------------------------");

        System.out.println(num1 + " > " + num2 + ":" + isGreater);
        System.out.println("-------------------------");

        System.out.print(num1 + " > " + num2 + ":" + isGreater);
        System.out.println("-------------------------");
        

        System.out.printf("%d > %d : %b",num1, num2, isGreater);
        System.out.print("-------------------------");
       
        System.out.printf("%d > %d : %b %n",num1, num2, isGreater);
        System.out.print("-------------------------");

        System.out.printf("%d > %d : %b %n",num1, num2, isGreater);
        System.out.println("-------------------------");


        System.out.printf("myByte value = %d, %n myShort = %d, %nmyInt = %d, %n myLong = %d, %n myFloat =  %f, %n myDouble = %f",
        myByte, myShort, myInt, myLong, myFloat, myDouble);
        

    }
}