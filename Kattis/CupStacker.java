import java.util.*;
/**
 * Write a description of class CupStacker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CupStacker
{
    public static void main(String argv[])
    {
        Scanner in =new Scanner(System.in);//to read input
        //System.out.println("Type number: ");
        int n;
        n = Integer.parseInt(in.nextLine());
        String s[] = new String[n];
        String s1[][] = new String[n][2];
        String f[] = new String[n];;
        int a[] = new int[n];
        int i=0;
        while(i<n)
        {
            s[i]= in.nextLine();
            s1[i] =s[i].split(" ");

            if(isInteger(s1[i][0]))
            {
                a[i]=Integer.parseInt(s1[i][0])/2;//if first int then making it half
                f[i]=s1[i][1];
            }
            else
            {
                a[i]=Integer.parseInt(s1[i][1]);
                f[i]=s1[i][0];
            }
            i++;
        }

        //sorting using bubble sort
        int k;
        String temp;
        for(i=0;i<n;i++)
        {

            for(int j=0;j<n;j++)
            {
                if(a[i]<a[j])
                {
                    //swapping
                    k=a[i];
                    a[i]=a[j];
                    a[j]=k;

                    temp=f[i];
                    f[i]=f[j];
                    f[j]=temp;
                }

            }
        }

        //printing result
        for(i=0;i<n;i++)
        {
            System.out.println(f[i]);
        }

    }

    public static boolean isInteger(String s)
    {
        return isInteger(s,10);
    }

    public static boolean isInteger(String s, int index) {
        if(s.isEmpty()) 
        {
            return false;
        }

        for(int i = 0; i < s.length(); i++)
        {

            if(i == 0 && s.charAt(i) == '-')
            {
                if(s.length() == 1) 
                {
                    return false;
                }
                else 
                {
                    continue;
                }
            }

            if(Character.digit(s.charAt(i),index) < 0) 
            {
                return false;
            }

        }
        return true;

    }

}
