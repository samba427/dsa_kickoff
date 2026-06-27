//finding square root of a number by binary search
//return lower int if not found

package BinarySearch;
import java.util.*;
public class sqrt
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        if(n<0)
        {
            System.out.println("invalid");
            return;
        }
        if(n<2)
        {
            System.out.println(n);
            return;
        }

        int low=1,high=n/2,mid=0,ans=0;

        while(low<=high)
        {
            mid=(low+high)/2;
            if(mid*mid<=n)
            {
                ans=mid;
                low=mid+1;
            }
            else high=mid-1;
        }
        System.out.println(ans);
    }
}
