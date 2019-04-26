import java.util.*;
/**
 * Write a description of class Autori3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Autori3
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name in long version : ");
        String lngName = in.nextLine();
        char ch = lngName.charAt(0);
        System.out.print(ch);
        while(lngName.indexOf("-") > 0)
        {
            lngName = lngName.substring(lngName.indexOf("-")+1);
            ch = lngName.charAt(0);
            //char chf = ch1 + ch;
            System.out.print(ch);
        }
    }
}
