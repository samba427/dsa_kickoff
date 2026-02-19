package arbit;
import java.util.*;

public class matrix_multiplication
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the dimensions of both arrays that are being multiplied");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        //first array is m1 x n1 second array is m2 x n2

        if (n1 != m2)
        {
            System.out.println("multiplication not possible");
            return;
        }

        int com=m2;
        int i,j,k;

        int arr1[][]=new int[m1][n1];//1st arr
        int arr2[][]=new int[m2][n2];//2nd arr
        int arr[][]=new int[m1][n2];//product arr

        System.out.println("enter elements of first array");
        for(i=0;i<m1;i++)
            for(j=0;j<n1;j++)
                arr1[i][j]=sc.nextInt();

        System.out.println("enter elements of second array");
        for(i=0;i<m2;i++)
            for(j=0;j<n2;j++)
                arr2[i][j]=sc.nextInt();

        //now we will be multiplying arr1 and arr2
        //do note we are multiplying each row of arr1 with each col of arr2

        for(i=0;i<m1;i++)
            for(j=0;j<n2;j++)
                for(k=0;k<com;k++)
                    arr[i][j]+=arr1[i][k]*arr2[k][j];

        //displaying product matrix
        int m=m1;
        int n=n2;
        System.out.println();
        System.out.println("The product matrix is:");
        System.out.println();
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
