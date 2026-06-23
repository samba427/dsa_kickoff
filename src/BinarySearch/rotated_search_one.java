//arr is rotated abt a pivot which is unknown and we have to find the location of a needed key as usual
//since its rotated so just binary search isnt enough in a sense... but remember for every mid either of left or right will be sorted
//we use at least one half sorted to remove the other half

package BinarySearch;
import java.util.*;
public class rotated_search_one
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array length");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements of rotated arr");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        int key=sc.nextInt();

        int low=0,high=n-1,mid=-1;

        while(low<=high)
        {
            mid=(low+high)/2;
            if(arr[mid]==key)
            {
                System.out.println("found at index "+mid);
                return;
            }
            if(arr[low]<=arr[mid])
            {
                if(arr[low]<=key && key<=arr[mid])
                    high=mid-1;
                else low=mid+1;
            }
            else
            {
                if(arr[mid]<=key && key<=arr[high])
                    low=mid+1;
                else high=mid-1;
            }
        }

        if(arr[mid]==key)
            System.out.println("found at index "+mid);
        else System.out.println("not found");
    }
}
