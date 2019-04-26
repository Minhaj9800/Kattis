import java.util.*;
/**
 * Write a description of class Flip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Filip
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        //System.out.println("Enter the two numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        
        int newNum1 = reverser(num1);
        int newNum2 = reverser(num2);
        int largest = Integer.MIN_VALUE;
        if(newNum1 > newNum2)
        {
            largest = newNum1;
        }
        else
        {
            largest = newNum2;
        }
        System.out.println(largest);

    }

    public static int reverser (int num)
    {
        int reverse = 0;
        while(num != 0)
        {
            //reverse = num *10;
            reverse = reverse*10 + num % 10;
            //reverse *= 100;
            num /= 10;
        }
        return reverse;
    }

    /*String [] array = nums.split("\\s+");
    int largest = Integer.MIN_VALUE;
    for(String newString : array)
    {
    int integerNum = Integer.parseInt(newString);

    if(integerNum > largest)
    {
    largest =  integerNum)
    }
    }**/
}
