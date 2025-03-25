//import java.util.Scanner;

public class StringBuilderDemo
{
    public static void main(String[] args)
    {
        /*
        String myTest1 = new String("Hello everyone. Welcome to this Java Proramming Class.");
        String myTest2 = "Hope you are enjoying the class" ;
        System.out.println(myTest1);


        myTest1 =  myTest1 +  myTest2;
        System.out.println(myTest1); 
        */

        StringBuilder myTest1 = new StringBuilder("Hello everyone. Welcome to this Java Proramming Class.");


        //append
        myTest1.append(" Hope you are enyoing the class.");
        System.out.println(myTest1); 



    }
}