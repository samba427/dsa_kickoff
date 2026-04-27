//insertion sort
//avg and worst O(n^2) best O(n)
package sorting;
import java.util.*;
public class insertion
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

        //insertion sort

        for(int i=0;i<n;i++)
        {
            for(int j=i;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }

        for(int i=0;i<n;i++)
            System.out.println(arr[i]+" ");
    }
}
