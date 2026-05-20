package Arrays;
import java.util.*;
public class rotation
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

        System.out.println("No of places to rotate by");
        int k=sc.nextInt();

        System.out.println("For left rotation press 1 for right rotation press 2");
        int choice=sc.nextInt();
        if(choice==1)
            left_rotate(arr,n,k);
        else if (choice==2)
            right_rotate(arr,n,k);

        System.out.println();
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
    static void left_rotate(int arr[], int n, int k)
    {
        int i,temp;
        for(i=0;i<k/2;i++)
        {
            temp=arr[i];
            arr[i]=arr[k-1-i];
            arr[k-1-i]=temp;
        }

        for(i=k;i<(n+k)/2;i++)
        {
            temp=arr[i];
            arr[i]=arr[n+k-i-1];
            arr[n+k-i-1]=temp;
        }

        for(i=0;i<n/2;i++)
        {
            temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }

    }
    static void right_rotate(int arr[], int n, int k)
    {
        int i,temp;
        for(i=0;i<n/2;i++)
        {
            temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        for(i=0;i<k/2;i++)
        {
            temp = arr[i];
            arr[i] = arr[k - 1 - i];
            arr[k - 1 - i] = temp;
        }
        for(i=k;i<(n+k)/2;i++)
        {
            temp=arr[i];
            arr[i]=arr[n+k-i-1];
            arr[n+k-i-1]=temp;
        }
    }
}
