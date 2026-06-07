//clear the ith bit... aka make it 0 if its 1

package Bit_Manipulation;
import java.util.*;
public class clear_ith
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n and i");
        int n=sc.nextInt();
        int i=sc.nextInt();

        n=n & ~(1<<i);

        System.out.println(n);
    }
}
