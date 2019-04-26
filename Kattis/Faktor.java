import java.util.*;
/**
 * Write a description of class Faktor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Faktor
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        //System.out.print("Enter the numbers of article and impact factors: ");
        int articles = in.nextInt();
        int impactFactor = in.nextInt();
        
        int bribe = articles*(impactFactor-1)+1;
        System.out.println(bribe);
        in.close();
    }

}

