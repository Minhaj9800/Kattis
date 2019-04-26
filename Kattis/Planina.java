import java.util.*;
/**
 * Write a description of class Planina here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Planina
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        //System.out.print("Enter the number of iterations: ");
        int iteration = in.nextInt();
        int width = 2;
        int points = 4;

        for(int i = 1; i <= iteration; i++)
        {
            points += (3*width-1)*(width-1);
            width = (2*width-1);
        }
        System.out.println(points);
    }
}
