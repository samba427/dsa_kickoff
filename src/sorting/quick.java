//quick sort is a lil diff... just the algo is we take a pivot which lets say is the first element... then we keep i at left and j at right keep moving them
//if num at i grter than num at j we swap... when i and j cross we place the pivot there... then we will have an array of nums smaller than
//the pivot to the left and larger to the right... apply the same algo on each
package sorting;
import java.util.*;
public class quick
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
        quick(arr,0,n-1);

        for (int i = 0; i < n; i++)
            System.out.println(arr[i]+" ");
    }
    static void quick(int arr[], int low, int high)
    {
        if(low<high)
        {
            int partition_index=part(arr,low,high);
            quick(arr,low,partition_index-1);
            quick(arr,partition_index+1,high);
        }
    }
    static int part(int arr[],int low,int high)
    {
        int pivot=arr[low];
        int i=low,j=high;
        while(i<j)
        {
            while(arr[i]<=pivot && i<high)
                i++;
            while(arr[j]>pivot && j>low)
                j--;

            if(i<j)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

            int temp=arr[low];
            arr[low]=arr[j];
            arr[j]=temp;

        }
        return j;

    }
}

