//we have to find the min number of bit flips required to convert a number from start which is the og number to the goal
//which is the given number. an easy way to this is get the xor of the two numbers we have and the answer will have one only
//in the spots where we need to change the bit... then we simply apply count bits to that

package Bit_Manipulation;
import java.util.*;
public class MinBitFlip
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers");
        int start=sc.nextInt();
        int goal=sc.nextInt();

        int ans=start^goal;

        int c=0;

        while(ans>0)
        {
            if(ans%2==1)
                c++;
            ans/=2;
        }

        System.out.println(c);
    }
}
