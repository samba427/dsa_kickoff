//basically we have an array with one or more peak elements... ele grter than both neighbours
//we just have to return the index of any one of the peak elements
//key idea is that technically array left of ele if asc and right is desc

package BinarySearch;
import java.util.*;
public class peak_element
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

        int low=1,high=n-2,mid=-1;

        while(low<=high)
        {
            mid=(low+high)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1])
            {
                System.out.println(arr[mid]+" "+mid);
                return;
            }
            if(arr[mid]<arr[mid+1])
                low=mid+1;
            else high=mid-1;
        }
        System.out.println("no peaks");
    }
}
