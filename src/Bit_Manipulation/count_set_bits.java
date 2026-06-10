package Bit_Manipulation;
import java.util.*;
public class count_set_bits
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();

        int c=0;

        while(n>0)
        {
            if(n%2==1)
                c++;
            n/=2;
        }

        System.out.println(c);
    }
}
