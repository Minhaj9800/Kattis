import java.util.*;
/**
 * Write a description of class Autori here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Autori
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        //System.out.println("Enter the name in long version: ");
        String lngName = in.nextLine().toUpperCase();

        String[] names = lngName.split("-");
        /*for(String shtName: names)
        {
            char ch = shtName.charAt(0);
            System.out.print(ch);
        }//*/
        //System.out.println(ch);
        

        for(int i = 0; i < names.length; i++)
        {
            String shtName = names[i];
            char ch = shtName.charAt(0);
            System.out.print(ch);
        }
    }
}
