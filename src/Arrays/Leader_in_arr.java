package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Leader_in_arr {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of arr");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i;
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();

        int max=arr[n-1];
        System.out.println(max);
        for(i=n-2;i>=0;i--)
        {
            if (arr[i] > max)
            {
                max = arr[i];
                System.out.println(max);
            }
        }

    }
}
