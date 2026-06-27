//finding nth root of a number
//return -1 if not integer
package BinarySearch;
import java.util.*;
public class nth_root
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int m=sc.nextInt();
        System.out.println("enter power");
        int n=sc.nextInt();

        int low=1,high=m,mid=0;
        long ans=1;

        while(low<=high)
        {
            mid=(low+high)/2;
            ans=1;
            for(int i=1;i<=n;i++)
            {
                ans*=mid;
                if(ans>m)
                    break;
            }
            if(ans==m)
            {
                System.out.println(mid);
                return;
            }
            else if(ans<m)
                low=mid+1;
            else high=mid-1;
        }
        System.out.println(-1);
    }
}
