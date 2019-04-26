import java.util.*;
/**
 * Write a description of class R2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class R2
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        //System.out.print("Enter the value for R1 and S: ");
        int r1 = in.nextInt();
        int s = in.nextInt();
        
        int r2 = 2*s - r1;
        System.out.print(r2);
    }
}
