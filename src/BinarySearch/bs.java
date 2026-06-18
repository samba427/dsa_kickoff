//classic binary search
//uses right left and mid to find an item in a given array
package BinarySearch;
import java.util.*;
public class bs
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array length");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements of sorted arr");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        int low=0,high=n-1,mid=0;

        System.out.println("enter number to be searched for");
        int item=sc.nextInt();

        while(low<=high)
        {
            mid=(low+high)/2;
            if(item>arr[mid])
                low=mid+1;
            else if(item<arr[mid])
                high=mid-1;
            else break;
        }
        System.out.println(arr[mid]+" found in index number "+mid);
    }
}
