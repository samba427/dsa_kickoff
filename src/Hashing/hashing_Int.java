//we are assuming max element possible is 20
package Hashing;
import java.util.*;
public class hashing_Int
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        int hash[]=new int[21];
        for(int i=0;i<n;i++)
        {
            hash[arr[i]]++;
        }

        System.out.println("Enter number to search freq of");
        int num=sc.nextInt();
        System.out.println(num+" appears "+hash[num]+" times.");
    }
}
