//to find the only single num in a sorted array of double nums

package BinarySearch;
import java.util.*;
public class single
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

        if(n==1)
        {
            System.out.println(arr[0]);
            return;
        }
        else if(arr[0]!=arr[1])
        {
            System.out.println(arr[0]);
            return;
        }
        else if(arr[n-1]!=arr[n-2])
        {
            System.out.println(arr[n-1]);
            return;
        }

        while(low<=high)
        {
            mid=(low+high)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1])
            {
                System.out.println(arr[mid]);
                return;
            }
            else if((mid%2==0 && arr[mid-1]==arr[mid])||(mid%2!=0 && arr[mid]==arr[mid+1]))
                high=mid-1;
            else low=mid+1;
        }
        System.out.println(arr[mid]);

        if(arr[mid]==arr[mid+1]||arr[mid]==arr[mid-1])
            System.out.println("-1");
        else System.out.println(arr[mid]);

    }
}
