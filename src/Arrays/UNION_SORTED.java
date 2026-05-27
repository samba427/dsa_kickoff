package Arrays;

import java.util.Scanner;

public class UNION_SORTED
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array");
        int n1=sc.nextInt();
        int arr1[]=new int[n1];
        System.out.println("Enter array elements");
        for(int i=0;i<n1;i++)
            arr1[i]=sc.nextInt();

        System.out.println("Enter length of array");
        int n2=sc.nextInt();
        int arr2[]=new int[n2];
        System.out.println("Enter array elements");
        for(int i=0;i<n2;i++)
            arr2[i]=sc.nextInt();

        int n=n1+n2;
        int arr[]=new int[n];

        int i=0,j=0,k=0;
        while(i < n1 && j < n2)
        {
            int val;
            if(arr1[i] < arr2[j])
            {
                val = arr1[i];
                i++;
            }
            else if(arr1[i] > arr2[j])
            {
                val = arr2[j];
                j++;
            }
            else
            {
                val = arr1[i];
                i++;
                j++;
            }

            // avoid duplicates
            if(k == 0 || arr[k - 1] != val)
            {
                arr[k] = val;
                k++;
            }
        }

        while(i<n1)
        {
            if(k==0 || arr[k-1]!=arr1[i])
            {
                arr[k]=arr1[i];
                k++;
            }
            i++;
        }
        while(j<n2)
        {
            if(k==0 || arr[k-1]!=arr2[j])
            {
                arr[k]=arr2[j];
                k++;
            }
            j++;
        }

        int x;

        for(x=0;x<k;x++)
        {
            System.out.print(arr[x]+" ");
        }

    }
}
