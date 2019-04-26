import java.util.*;
/**
 * Write a description of class SevenWonders here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SevenCards
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the cards: ");
        String cards = in.nextLine();
        int t = 0, c = 0, g = 0;
        for(int i = 0; i < cards.length(); i++)
        {
            if(cards.charAt(i) == 'T' || cards.charAt(i) == 't')
            {
                t++;
            }
            else if(cards.charAt(i) == 'C' || cards.charAt(i) == 'c')
            {
                c++;
            }
            else if( cards.charAt(i) == 'G' || cards.charAt(i) == 'g')
            {
                g++;
            }
        }
        int result = t*t+c*c+g*g+ countSeries(t,c,g)*7;
        System.out.println(result);
    }

    public static int countSeries(int a,int b, int c)
    {
        if(a<=b && a<=c)

            return a;

        else if(b<=a && b<=c)

            return b;

        else

            return c;
    }
}

