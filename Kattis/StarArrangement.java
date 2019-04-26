import java.util.*;
/**
 * Write a description of class StarArrangement here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StarArrangement
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of stars you want to make pattern: ");
        int num = in.nextInt();
        boolean flag = false;
        int stars = 0;
        System.out.println(num+":");

        for(int i = 2; i < num; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                flag = false;
                stars = 0;

                if(i == (j+1) || i == j)
                {
                    do
                    {
                        stars += i;
                        if(stars == num)
                        {
                            flag = true;
                            //break;
                        }
                        else
                        {
                            stars = stars+j;
                            if(stars == num)
                            {
                                flag = true;//1;
                                //break;
                            }
                        }
                    }
                    while(stars <= num);

                    if (flag == true)// that is different there than (= true);
                    {
                        System.out.println(i+","+j);
                    }
                }
            }
        }
    }
}

