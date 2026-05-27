package Arrays;
import java.util.*;
public class singleElement //in an array where all elements appear twice and only one element appears once... use bit manipulation aka xor
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

        int xor=0;
        for(i=0;i<n;i++)
            xor^=arr[i];

        System.out.println(xor);
    }
}
