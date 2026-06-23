//to find last occ of an element

package BinarySearch;
import java.util.*;
public class lastocc
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
        int res=-1;

        System.out.println("enter number to be searched for");
        int item=sc.nextInt();

        while(low<=high)
        {
            mid=(low+high)/2;
            if(item>arr[mid])
                low=mid+1;
            else if(item<arr[mid])
                high=mid-1;
            else
            {
                low=mid+1;
                res=mid;
            }
        }

        System.out.println("last occ is at index "+res);
    }
}
