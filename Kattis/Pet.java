import java.util.*;
/**
 * Write a description of class Pet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pet
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        //System.out.println("Enter the total four points of the members: ");
        int sum = 0;
        int largest = 0;
        //int count = 0;
        int pos = 1;
        int person = 0;
       // int sum [] = new int[4];
        //int i = 0;
        while(pos <= 5)
        {
            //System.out.println("Enter the total four points: ");
            int p1 = in.nextInt();
            int p2 = in.nextInt();
            int p3 = in.nextInt();
            int p4 = in.nextInt();
            sum = (p1+p2+p3+p4);
            if(sum > largest)
            {
                largest = sum;
                person = pos;
            }
            pos++;
        }

        System.out.println(person+" "+ largest);
    }

}

