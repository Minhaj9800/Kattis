import java.util.*;
/**
 * Write a description of class Pot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pot
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of integers: ");
        int numbers = in.nextInt();
        int result = 0;
        for(int i = 0; i < numbers; i++)
        {
            int integers = in.nextInt();
            int power = integers % 10;// getting the power9last digit of number)
            int newInteger = integers/10;// get the rest of the numbers.
            result +=  Math.pow(newInteger,power);
        }
        System.out.println(result);
    }
}
