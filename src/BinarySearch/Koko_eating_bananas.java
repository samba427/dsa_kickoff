//Problem Statement: A monkey Koko is given ‘n’ piles of bananas, whereas the 'ith' pile has ‘a[i]’ bananas.
// An integer ‘h’ is also given, which denotes the time (in hours) for all the bananas to be eaten.
//
//Each hour, the monkey chooses a non-empty pile of bananas and eats ‘k’ bananas.
// If the pile contains less than ‘k’ bananas, then the monkey consumes all the bananas and won’t eat any more bananas in that hour.
//
//Find the minimum number of bananas ‘k’ to eat per hour so that the monkey can eat all the bananas within ‘h’ hours.
//remember that we are looking for min speed that is the key here
package BinarySearch;
import java.util.*;
public class Koko_eating_bananas
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of piles");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("enter no of bananas for each pile");

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("enter max time for koko to eat the bananas");
        int h=sc.nextInt();
        int k=0;//speed

        int max=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }

        int low=1,high=max,mid=0;

        while(low<=high)
        {
            mid=(low+high)/2;
            if(possible(mid,h,arr,n))
            {
                k=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        System.out.println(k);
    }
    static boolean possible(int mid, int h, int arr[], int n)
    {
        int hours=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%mid==0)
                hours+=arr[i]/mid;
            else hours+=(arr[i]/mid)+1;
        }
        return(hours<=h);
    }
}
