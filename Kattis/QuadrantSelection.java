import java.util.*;
/**
 * Write a description of class QuadrantSelection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuadrantSelection
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        //System.out.print("Enter the value for x and y: ");
        int x = in.nextInt();
        int y = in.nextInt();

        if(x > 0 && y > 0)
        {
            System.out.println("1");
        }
        else if(x < 0 && y > 0)
        {
            System.out.println("2");
        }
        else if(x > 0 && y < 0)
        {
            System.out.println("4");
        }
        else
        {
            System.out.println("3");
        }
    }

}
