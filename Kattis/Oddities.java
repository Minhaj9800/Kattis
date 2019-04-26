import java.util.*;
/**
 * Write a description of class Oddities here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Oddities
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        //System.out.println("Enter the number of test cases: ");
        int num = in.nextInt();
        int test = 0;
        for(int i = 0; i < num; i++)
        {
            test = in.nextInt();

            if(test%2 == 0)
            {
                System.out.println(test+" is even");
            }
            else
            {
                System.out.println(test+" is odd");
            }
        }
    }
}

