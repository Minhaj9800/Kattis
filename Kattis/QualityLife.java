import java.util.*;
/**
 * Write a description of class QualityLife here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QualityLife
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        //System.out.println("Enter the number of Trials: ");
        int trial = in.nextInt();
        double quality,period;
        double result = 0;
        for(int i = 0; i < trial; i++)
        {
            quality = in.nextDouble();
            period = in.nextDouble();
            result += (quality)*(period);
        }
        double fResult = result;
        System.out.printf("%.3f", result);
    }
}
