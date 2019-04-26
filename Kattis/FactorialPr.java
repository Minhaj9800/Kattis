import java.util.*;
/**
 * Write a description of class Factorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FactorialPr
{

    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        //System.out.println("Enter the Testing Number between 1 to 10: ");
        int test = in.nextInt();
        int result = 1;
        int number = 0;
        for(int i = 1; i <= test; i++)
        {
            number = in.nextInt();
            System.out.println(factorilaDigit(number));
        }
    }

    public static String factorilaDigit(int n)
    {
        int value = 1;
        for(int j = 1; j <= n; j++)
        {
            value = value*j ;
        }

        String str = ""+value; 
        int length = str.length();
        //System.out.println(result);

        if(length > 1)
        {
            str = ""+str.charAt(length-1);
        }
        else
        {
            str = str;
        }
        return str;
    }

}

