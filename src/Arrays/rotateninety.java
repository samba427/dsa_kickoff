//rotate a matrix 90 degrees clockwise... sq mat defo
//what we do is first transpose across left diagonal then rotate each row
package Arrays;
import java.util.*;
public class rotateninety
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lengths");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];

        int i,j;

        for(i=0;i<m;i++)
            for(j=0;j<n;j++)
                arr[i][j]=sc.nextInt();

        for(i=0;i<n;i++)
            for(j=i+1;j<n;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }

        for(i=0;i<n;i++)
        {
            int left=0,right=n-1;
            while(left<right)
            {
                int temp=arr[i][left];
                arr[i][left]=arr[i][right];
                arr[i][right]=temp;
                left++;
                right--;
            }
        }

        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
                System.out.print(arr[i][j]);
            System.out.println();
        }

    }
}
