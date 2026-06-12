//divide two number and return the integer part of the answer without / or *
//the main idea we are trying to use is that say we have a dvd and dvs
//each time instead of repeated subtraction of the same num we sub that num into highest power of 2 possible
//remember n<<x is n* 2 pow x
package Bit_Manipulation;
import java.util.*;
public class division
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter dividend and divisor");

        int dvd=sc.nextInt();
        int dvs=sc.nextInt();

        if(dvd==dvs)
            System.out.println(1);

        int quo=0,c;

        while(dvd>=dvs)
        {
            c=0;
            while(dvd>=(dvs<<(c+1)));
            {
                c++;
            }
            quo+=1<<c;
            dvd-=(dvs<<c);
        }

        if((dvd<0)^(dvs<0))
            quo=-quo;

        System.out.println(quo);
    }
}
