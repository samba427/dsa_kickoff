//rotated array problem as before but we are looking for the minimum element
//idea we use here is that... wrt mid one half sorted other half unsorted and the min will always lie in unsorted half
package BinarySearch;
import java.util.*;
public class rotated_search_min
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

        while(low<=high)
        {
            mid=(low+high)/2;
            if(arr[low]<=arr[high])
            {
                ans=Math.min(ans,arr[low]);
                break;
            }
            if(arr[low]<=arr[mid])
            {
                ans=Math.min(ans,arr[low]);
                low=mid+1;
            }
            else
            {
                ans=Math.min(ans,arr[mid]);
                high=mid-1;
            }
            System.out.println(ans);
        }
    }
}
