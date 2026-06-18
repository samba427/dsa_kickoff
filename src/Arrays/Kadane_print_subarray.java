//kadane's algo... shortest way to print a req subarray
package Arrays;
import java.util.*;
public class Kadane_print_subarray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of arr");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i;
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();

        int starter=0,start=-1,end=-1,sum=0,max=Integer.MIN_VALUE;

        for(i=0;i<n;i++)
        {
            sum+=arr[i];
            if(sum>max)
            {
                max=sum;
                start=starter;
                end=i;
            }
            if(sum<0)
            {
                sum=0;
                starter=i+1;
            }
        }

        for(i=start;i<=end;i++)
            System.out.print(arr[i]+" ");
    }
}
