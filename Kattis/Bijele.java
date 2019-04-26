import java.util.*;
/**
 * Write a description of class Bijele here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bijele
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the numbers of members in the set: ");
        int numMembers;
        int[] fullSet = {1, 1, 2, 2, 2, 8};
        final int limit = 6;
        for(int i = 0; i < limit; i++)
        {
            numMembers = in.nextInt();
            int result = fullSet[i] - numMembers;
            System.out.print(result+" ");
        }
    }
}