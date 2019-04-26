import java.util.*;
/**
 * Write a description of class Sibice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sibice
{
    public static void main (String [] args)
    {
        Scanner in = new Scanner(System.in);

        //System.out.println("Enter the matches number, width,and length: ");
        int num = in.nextInt();
        int width = in.nextInt();
        int height = in.nextInt();

        double maxLength = Math.sqrt((width*width)+(height*height));
        int matches[] = new int [num];
        for( int i = 0; i < num; i++)
        {
             matches[i] = in.nextInt() ;
        }
        
        for(int i = 0; i < num; i++)
        {

            if(matches[i] <= maxLength)
            {
                System.out.println("DA");
            }
            else
            {
                System.out.println("NE");
            }
        }
    }
}

   