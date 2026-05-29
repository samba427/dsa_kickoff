//DNF problem or dutch national flag problem... sort an arr of 0 1 and 2 in the most optimal way
//we use 3 pointers of mid low and high and do sm shifting abt
package Arrays;
import java.util.*;
public class DNFproblem
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of arr");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i;
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();

        int low=0,mid=0,high=n-1;

        while(mid<=high)
        {
            if (arr[mid]==0)
            {
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else
            {
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }

        for(i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
