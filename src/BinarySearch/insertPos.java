// we have a sorted arr and have to look for the position where the given number can be inserted or return its pos if it exists

package BinarySearch;
import java.util.*;
public class insertPos
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

        if(arr[mid]>item)
            System.out.println("insert at index "+mid);
        else if(arr[mid]<item)
            System.out.println("insert at index "+(mid+1));
        else System.out.println("found at index "+mid);
    }
}
