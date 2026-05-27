package Arrays;
import java.util.Scanner;
//we have a binary array of 1 and 0 and we find he highest number of consecutive one
public class max_consecutive_ones
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

        int count=0,max=0;
        for(i=0;i<n;i++)
        {
            if(arr[i]==1)
                count+=1;
            if(count>=max)
                max=count;
            if(arr[i]==0)
                count=0;
        }
        System.out.println(max);
    }
}
