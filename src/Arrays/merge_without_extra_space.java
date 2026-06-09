// we are given two arrays sorted in ascending order... and we sort them without using any extra space...
// arr1 has m+n ele and arr 2 has... the remaining n ele in arr1 are 0 so dw
// brute force way that i thought was to copy arr 2 into 0s of arr 1 and sort the arr again
// i did ofc see a better approach which we will be applying now,
package Arrays;
import java.util.*;
public class merge_without_extra_space
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter m and n");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr1[]=new int[m+n];
        int arr2[]=new int[n];

        int i,j,k;
        for(i=0;i<m;i++)
            arr1[i]=sc.nextInt();
        for(i=0;i<n;i++)
            arr2[i]=sc.nextInt();

        i=m-1;
        j=n-1;
        k=m+n-1;

        while(i>=0 && j>=0)
        {
            if(arr1[i]>arr2[j])
            {
                arr1[k]=arr1[i];
                i--;
            }
            else
            {
                arr1[k]=arr2[j];
                j--;
            }
            k--;
        }

        while(j >= 0)
        {
            arr1[k] = arr2[j];
            j--;
            k--;
        }

        for(i=0;i<m+n;i++)
            System.out.print(arr1[i]+" ");
    }
}
