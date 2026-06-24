//we have to count no of times a sorted array was rotated...
//just look at the search for minimum... the index of min ele is no of rotations

package BinarySearch;
import java.util.*;
public class no_of_rotations
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

        int low=0,high=n-1,mid=-1;
        int ans=Integer.MAX_VALUE;
        int index=0;

        while(low<=high)
        {
            mid=(low+high)/2;
            if(arr[low]<=arr[high])
            {
                if(arr[low]<=ans)
                {
                    ans=arr[low];
                    index=low;
                }
                break;
            }
            if(arr[low]<=arr[mid])
            {
                if(arr[low]<=ans)
                {
                    ans=arr[low];
                    index=low;
                }
                low=mid+1;
            }
            else
            {
                if(arr[mid]<=ans)
                {
                    ans=arr[mid];
                    index=mid;
                }
                high=mid-1;
            }
        }
        System.out.println("no of times rotated is "+index+" min element is "+ans);
    }
}
