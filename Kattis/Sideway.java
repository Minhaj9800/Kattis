import java.util.*;
/**
 * Write a description of class Sideway here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sideway
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the line numbers and characters on each: ");
        int num = in.nextInt();
        int numChar = in.nextInt();
        String ans = in.nextLine();
        for(int i = 0; i < num; i++)
        {
            ans = in.nextLine();
        }

        for(int j = 0; j < numChar; j++)
        {
            sortString(ans);
            checkString(ans);
            if(!checkString(ans))
            {
                ans = sortString(ans);
            }
        }
        System.out.println(ans);
    }

    public static boolean checkString(String input) {
        return input.toLowerCase()
        .replaceAll("[^a-z]", "")
        .replaceAll("(.)(?=.*\\1)", "")
        .length() == 26;
    }

    public static String sortString(String inputString) 
    { 
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray); 
        return new String(tempArray); 
    } 
}