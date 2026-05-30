/*Problem Statement: There’s an array ‘A’ of size ‘N’ with an equal number of positive and negative elements.
Without altering the relative order of positive and negative elements, you must return an array of alternately positive and negative values.
Examples
Example 1:
Input:
arr[] = {1,2,-4,-5}, N = 4
Output:
1 -4 2 -5
Explanation:
Positive elements = 1,2
Negative elements = -4,-5
To maintain relative ordering, 1 must occur before 2, and -4 must occur before -5. */

package Arrays;
import java.util.*;
public class alt_pos_neg
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

        int ans[]=new int[n];
        int sign=arr[0]/Math.abs(arr[0]);
        int pos = (sign == 1) ? 0 : 1;
        int neg = (sign == 1) ? 1 : 0;

        for(i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
                ans[pos]=arr[i];
                pos+=2;
            }
            else
            {
                ans[neg]=arr[i];
                neg+=2;
            }
        }

        for(i=0;i<n;i++)
            System.out.print(ans[i]+" ");

    }
}
