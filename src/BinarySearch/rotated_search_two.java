//same as the last one but we have duplicate elements now
package BinarySearch;
import java.util.Scanner;
public class rotated_search_two
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
            if(arr[low]==arr[mid]&&arr[mid]==arr[high])
            {
                low++;
                high--;
            }
            else if(arr[low]<=arr[mid])
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
        System.out.println("not found");
    }
}
