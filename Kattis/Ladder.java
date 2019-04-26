import java.util.*;
/**
 * Write a description of class Ladder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ladder
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        //System.out.println("Enter the high and angle: ");
        int high = in.nextInt();
        int angle = (in.nextInt());
        double a1 = Math.sin(angle*Math.PI/180);
        
        int length = (int) (Math.ceil((high/a1)));
        System.out.println(length);
    }
}
