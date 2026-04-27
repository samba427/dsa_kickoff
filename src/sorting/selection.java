//selection sort just takes the smallest element then swaps it with the current element, and this keeps going on till the array is sorted
//selection sort time complexity is O(n^2) best worst avg
package sorting;
import java.util.*;
public class selection
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        //selection sort

        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i;j<n;j++)
            {
                if(arr[j]<arr[min])
                    min=j;
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }

        for(int i=0;i<n;i++)
            System.out.println(arr[i]+" ");
    }
}
