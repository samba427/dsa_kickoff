package Bit_Manipulation;
import java.util.*;
public class swap
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two nums");
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println(a+" "+b);

        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println(a+" "+b);
    }
}
