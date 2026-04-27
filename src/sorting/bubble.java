//bubble sort
//worst case avg case O(n^2)... best case O(n)
package sorting;
import java.util.*;
public class bubble
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for(int i=0;i<n;i++)
        {
            int swap=0;
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = 1;
                }
            }
            if(swap==0)
                break;
        }

        for(int i=0;i<n;i++)
            System.out.println(arr[i]+" ");
    }
}
