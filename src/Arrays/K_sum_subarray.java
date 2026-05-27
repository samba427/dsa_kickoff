package Arrays;

import java.util.Scanner;
//max length subarray of sum k
public class K_sum_subarray
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
        int k=sc.nextInt();
        int max=0;
        int left=0,right=0;
        int sum=arr[0];
        while(right<n)
        {
            while(left<=right && sum>k)
            {
                sum-=arr[left];
                left++;
            }
            if(sum==k)
            {
                max=Math.max(max,right-left+1);
            }
            right++;
            if(right<n)
            {
                sum+=arr[right];
            }
        }
        System.out.println(max);
    }
}
