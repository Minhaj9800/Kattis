import java.util.*;
/**
 * Write a description of class Tarifa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tarifa
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        //System.out.print("Enter the Maximum MB(X) for each month: ");
        int maxUsage = in.nextInt();
        final int usage = maxUsage;
        //System.out.print("Enter the usage MB of some months: ");
        int months = in.nextInt();
        int nextMonth = 0;
        for(int i = 0; i < months; i++)
        {
            int value = in.nextInt();
            int leftUsage = maxUsage - value;
            maxUsage = leftUsage + usage;
            nextMonth = maxUsage ;
        }
        System.out.println(nextMonth);
    }
}
