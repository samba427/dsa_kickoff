//set the ith bit

package Bit_Manipulation;
import java.util.*;
public class set_ith_bit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number and i");
        int n=sc.nextInt();
        int i=sc.nextInt();
        n+= (1<<i);

        System.out.println(n);
    }
}
