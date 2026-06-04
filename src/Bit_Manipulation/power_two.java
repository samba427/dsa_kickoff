// we are checking if a number is a power of 2 or not
// using bit man the way to do is do and of num and num-1... all powers of two are 1 followed by 0s adn the num just before is only 1
// so and will give 0 thus proving its power of 2
package Bit_Manipulation;
import java.util.*;
public class power_two
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();

        if((n & (n-1))==0)
            System.out.println("power of 2");
        else System.out.println("not");
    }
}
