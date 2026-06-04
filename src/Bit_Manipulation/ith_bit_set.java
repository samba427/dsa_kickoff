//check if ith bit is set or not

package Bit_Manipulation;
import java.util.*;
public class ith_bit_set
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        System.out.println("Enter i");
        int i=sc.nextInt();

        if((n & (1<<i))!=0)
            System.out.println("set");
        else System.out.println("NOT set");
    }
}

