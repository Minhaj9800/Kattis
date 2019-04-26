import java.util.*;
/**
 * Write a description of class Spavanac here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spavanac
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        final int mins = 45;
        //System.out.println("Enter the Hour and Minutes: ");
        int hour =  in.nextInt();
        int minute = in.nextInt();
        int timesT;
        int newHr;
        int newMin;
        if(hour > 0 && hour < 24)
        {
            timesT = ((hour*60)+minute)-mins;

            newHr = timesT/60;
            newMin = timesT%60;
        }
        else
        {
           timesT = ((24*60)+minute)-mins;
           newHr = timesT/60;
           newMin = timesT%60;
        }
        System.out.println(newHr+" "+newMin);

    }

}
