import java.util.*;
/**
 * Write a description of class ColdPutter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ColdPutter
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        //System.out.print("Enter the numbers of temparature is taken: ");
        int numTemp = in.nextInt(); int temperature;int count = 0;

        for(int i = 0; i < numTemp; i++)
        {
            temperature = in.nextInt();
            
            if(temperature < 0)
            {
               count++;
            }
        }
        System.out.println(count);
    }
}
