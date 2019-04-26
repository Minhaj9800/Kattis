import java.util.*;
/**
 * Write a description of class QuadrantSelection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuadrantSelection2
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value for x and y: ");
        //int x = in.nextInt();
        //int y = in.nextInt();
        /*
         * This is probably best
        if (x > 0)
        {
            if (y > 0)
            {
                System.out.println("1");
            }
            else
            {
                System.out.println("4");
            }
        }
        else
        {
            if (y > 0)
            {
                System.out.println("2");
            }
            else
            {
                System.out.println("3");
            }
        }//*/

        /*
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
        }//*/
        
        //System.out.println((x > 0) ? (y > 0) ? 1 : 4 : (y > 0) ? 2 : 3);
        
        // This is bad:
        System.out.println((in.nextInt() > 0) ? (in.nextInt() > 0) ? 1 : 4 : (in.nextInt() > 0) ? 2 : 3);
        
        // This is worse:
        int x, y;
        System.out.println(((x = in.nextInt()) > 0) ? ((y = in.nextInt()) > 0) ? 1 : 4 : ((y = in.nextInt()) > 0) ? 2 : 3);
    }

}
