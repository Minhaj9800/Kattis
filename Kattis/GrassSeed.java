import java.util.*;
/**
 * Write a description of class GrassSeed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GrassSeed
{
    public static void main (String [] args)
    {
        Scanner in = new Scanner(System.in);

        //System.out.println("Enter the cost and number of lawns: ");
        double cost = in.nextDouble();
        int lawns = in.nextInt();
        double width = 0;
        double length = 0;
        double area = 0;
        for(int i = 0; i < lawns; i++)
        {
            width = in.nextDouble();
            length = in.nextDouble();
            area += width*length;
        }
        double totalCost = (area*cost);
        System.out.printf("%.7f", totalCost);
    }
}
