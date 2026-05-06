package Arrays;
import java.util.*;
public class second_largest
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

        System.out.println("second smallest is "+sec_small(arr,n)+" second largest is "+sec_large(arr,n));

    }
    public static int sec_small(int arr[],int n)
    {
        if(n<2)
            return -1;

        int c=0;
        for(int i=0;i<n;i++)
            if(arr[i]==arr[0])
                c++;

        if(c==n)
            return -1;

        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;

        for(int i=0;i<n;i++)
        {
            if(arr[i]<small)
            {
                second_small=small;
                small=arr[i];
            }
            else if(arr[i]>small && arr[i]<second_small)
                second_small=arr[i];
        }
        return second_small;
    }
    public static int sec_large(int arr[],int n)
    {
        if(n<2)
            return -1;

        int c=0;
        for(int i=0;i<n;i++)
            if(arr[i]==arr[0])
                c++;

        if(c==n)
            return -1;

        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            if(arr[i]>large)
            {
                second_large=large;
                large=arr[i];
            }
            else if(arr[i]<large && arr[i]>second_large)
                second_large=arr[i];
        }
        return second_large;
    }

}
