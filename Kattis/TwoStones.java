import java.util.*;
/**
 * @author (Minhajur Rahman) 
 */
public class TwoStones
{
    public static void main(String [] args)
    {
        //System.out.print(" ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        if(input%2 == 0)
        {
            System.out.println("Bob");
        }
        else
        {
            System.out.println("Alice");
        }
        
        System.exit(0);
    }
}
