import java.util.*;
/**
 * Write a description of class TimeLoop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TimeLoop
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        //System.out.print("Enter how many repeats:");
        int repeat = in.nextInt();
        final String magicWord = "Abracadabra";

        for(int i = 1; i <= repeat; i++)
        {
            System.out.println(i+" "+magicWord);
        }
    }
}
