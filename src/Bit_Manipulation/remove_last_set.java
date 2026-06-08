//we have to remove the last set bit... easy w
package Bit_Manipulation;
import java.util.*;
public class remove_last_set
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();

        System.out.println(n&(n-1));
    }
}
