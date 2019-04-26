import java.util.*;
import java.text.*;
/**
 * Write a description of class Datum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Datum
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        //System.out.println("Enter the date and month: ");
        int dd = in.nextInt();
        int mm = in.nextInt()-1;
        Date date = (new GregorianCalendar(2009,mm,dd).getTime());
        SimpleDateFormat fr = new SimpleDateFormat("EEEE");
        String day = fr.format(date);

        System.out.println(day);
    }
}
