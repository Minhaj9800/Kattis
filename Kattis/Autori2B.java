import java.util.*;
/**
 * Write a description of class Autori here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Autori2B
{
    public static void main(String [] args)
    {
        String line = null;
        Scanner in = new Scanner(System.in).useDelimiter("[-\n]");
        System.out.println("Enter the long version of name: ");
        
        while(in.hasNext())
        {
          char newName = in.next().charAt(0);
          System.out.print(newName);
        }
        //System.out.print(name);
    }

}