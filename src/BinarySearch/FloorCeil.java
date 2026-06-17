// finding floor and ceiling in a sorted array... floor is largest number <= key and ceil is smallest number >=key
package BinarySearch;
import java.util.*;
public class FloorCeil
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
            else
            {
                System.out.println("floor and ceil are "+arr[mid]);
                return;
            }
        }
        int floor=-1,ceil=-1;

        if (high >= 0)
            floor = arr[high];
        else
            floor = -1;
        if (low < n)
            ceil = arr[low];
        else
            ceil = -1;

        System.out.println("floor is "+floor+" ceiling is "+ceil);
    }
}
