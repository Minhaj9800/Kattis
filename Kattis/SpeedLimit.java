import java.util.*;
/**
 * Write a description of class SpeedLimit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpeedLimit
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        //System.out.println("Enter the input: ");
        int input = in.nextInt(); int result = 0;
        do
        {
            int [] speedPrHr = new int [10];
            int [] elapsedTime = new int[10];
            for(int i = 0; i < input; i++)
            {
                speedPrHr [i] = in.nextInt();
                elapsedTime [i] = in.nextInt();
            }
            result = speedPrHr [0]*elapsedTime [0];

            for(int i = 1; i < input; i++)
            {
                result += speedPrHr [i]*(elapsedTime [i]-elapsedTime [i-1]);
            }
            System.out.printf("\n%d miles",result);
            input = in.nextInt();
        }

        while(input > 0);
    }
}
