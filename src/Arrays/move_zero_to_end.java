package Arrays;
import java.util.*;
public class move_zero_to_end
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

        int i, j=-1;

        for(i=0;i<n;i++)
            if(arr[i]==0)
            {
                j=i;
                break;
            }
        if(j==-1)
            return;

        for(i=j+1;i<n;i++)
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;

            }

        for(i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
