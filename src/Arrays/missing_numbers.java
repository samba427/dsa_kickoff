package Arrays;
import java.util.Scanner;
public class missing_numbers //an array of size 5 with one number missing from 1 to 6
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
        int flag=0;
        int i;
        for(i=1;i<=n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[j]==i)
                    flag++;
            }
            if(flag!=1)
            {
                System.out.println("the missing number is "+i);
                return;
            }
            flag=0;
        }
    }
}
