package Arrays;
import java.util.*;
public class Kadane //algo to find max subarray sum in an arr
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

        int sum=0,max=arr[0];
        for(i=0;i<n;i++)
        {
            sum+=arr[i];
            max=Math.max(max,sum);
            if (sum<0)
                sum=0;
        }

        System.out.println(max);
    }
}
