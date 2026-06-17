// we are looking for lower and upper bound in an arr...
// lower bound is lowest index with a value >= given key... if none return n
// upper bound is lowest index with a value > given key... if none return n
package BinarySearch;
import java.util.*;
public class LowerUpperBound
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

        System.out.println("enter key");
        int key=sc.nextInt();

        int low=0,high=n-1,mid=0;

        int lb=n,ub=n;

        while(low<=high)
        {
            mid=(low+high)/2;
            if(arr[mid]>=key) {
                lb = mid;
                high = mid - 1;
            }
            else low=mid+1;
        }

        low=0;
        high=n-1;

        while(low<=high)
        {
            mid=(low+high)/2;
            if(arr[mid]>key) {
                ub = mid;
                high = mid - 1;
            }
            else low=mid+1;
        }

        System.out.println("lower bound index is "+lb+" upper bound index is "+ub);

    }
}
