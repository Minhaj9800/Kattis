import java.util.*;
/**
 * Write a description of class BatterUp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BatterUp
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        //System.out.print("Enter the number of at-bats(grater than 1 and less than or equal 100):");
        int bases = in.nextInt(); in.nextLine();

        //System.out.print("Enter the numbers of time at bat: ");
        double total = 0;
        int count = 0;
        for(int i = 0; i < bases; i++)
        {
            int value = in.nextInt();

            if(value != -1)
            {
                total += value;
                count++;
            }
        }

        System.out.println(total/count);
    }
}
