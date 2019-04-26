import java.util.*;
/**
 * Write a description of class Trik here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trik
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter the move pattern");
        String pattern = in.nextLine().toUpperCase();
        char ch;
        boolean cup1 = true;
        boolean cup2 = false;
        boolean cup3 = false;
        boolean temp;

        for(int i = 0; i < pattern.length(); i++)
        {
            ch = pattern.charAt(i);
            
            if(ch == 'A')
            {
                temp = cup2;
                cup2 = cup1;
                cup1 = temp;
            }
            else if(ch == 'B')
            {
                temp = cup3;
                cup3 = cup2;
                cup2 = temp;
            }
            else
            {
                temp = cup3;
                cup3 = cup1;
                cup1 = temp;
            }
        }
        
        if(cup1)
        {
            System.out.println("1");
        }
        else if(cup2)
        {
            System.out.println("2");
        }
        else
        {
            System.out.println("3");
        }

    }

}
