//we are counting no of occurences of given number in the array by binary search
//idea is find first occ and last occ subtract those indices and add 1
package BinarySearch;
import java.util.*;
public class count_occ
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

        int key=sc.nextInt();

        int first,last;

        first=occurrence(arr,key,true);
        last=occurrence(arr,key,false);

        if(first==-1)
            System.out.println("not found");
        else System.out.println("count is "+(last-first+1));
    }
    static int occurrence(int[]arr, int key, boolean first)
    {
        int ans=-1;
        int low=0,high= arr.length-1,mid=0;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(key<arr[mid])
                high=mid-1;
            else if(key>arr[mid])
                low=mid+1;
            else
                if(first)
                {
                    ans=mid;
                    high=mid-1;
                }
                else
                {
                    ans=mid;
                    low=mid+1;
                }
        }
        return ans;
    }
}
