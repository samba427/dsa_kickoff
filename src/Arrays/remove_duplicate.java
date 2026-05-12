package Arrays;
import java.util.*;
public class remove_duplicate
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
        int k=remove(arr,n);
        System.out.println("there are "+ k +" unique elements");
        for(i=0;i<k;i++)
        {
            System.out.println(arr[i]+" ");
        }

    }
    public static int remove(int arr[],int n)
    {
        int i=0;
        for(int j=1;j<n;j++)
        {
            if(arr[j]!=arr[i])
            {
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
}
