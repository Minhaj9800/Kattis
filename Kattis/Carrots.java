import java.util.*;
/**
 * Write a description of class Carrots here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carrots
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of contestants and solved problems: ");
        int contestants = in.nextInt();
        int solution = in.nextInt();

        for(int i = 0; i <= contestants; i++)
        {
            String description = in.nextLine();
        }
        System.out.println(solution);
    }
}
