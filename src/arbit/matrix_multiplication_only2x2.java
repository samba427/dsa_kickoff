package arbit;
import java.util.*;

public class matrix_multiplication_only2x2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr1[][]=new int[2][2];//1st arr
        int arr2[][]=new int[2][2];//2nd arr
        int arr[][]=new int[2][2];//product arr
        int i,j;

        System.out.println("enter elements of first array");
        for(i=0;i<2;i++)
            for(j=0;j<2;j++)
                arr1[i][j]=sc.nextInt();

        System.out.println("enter elements of second array");
        for(i=0;i<2;i++)
            for(j=0;j<2;j++)
                arr2[i][j]=sc.nextInt();

        for(i=0;i<2;i++)
            for(j=0;j<2;j++)
                arr[i][j]=arr1[i][0]*arr2[0][j] + arr1[i][1]*arr2[1][j];

        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
