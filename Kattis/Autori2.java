import java.util.*;
/**
 * Write a description of class Autori here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Autori2
{
    public static void main(String [] args)
    {
        String line = null;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the long version of name: ");
        line = in.nextLine();
        
        Scanner lineScanner = new Scanner(line);//.useDelimiter("-");
        lineScanner.useDelimiter("-");
        while(lineScanner.hasNext())
        {
          char newName = lineScanner.next().charAt(0);
          System.out.print(newName);
        }
        //System.out.print(name);
    }

}
