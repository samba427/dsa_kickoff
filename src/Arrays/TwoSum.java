package Arrays;
import java.util.*;
public class TwoSum
//two sum is find two elements that add up to a given target... we are trying to use a greedy algo where we will keep two pointers one at left one at right of the sorted array versio and traverse...
//if sum exceeds then we need smaller numbers so decrease from right if num is less than needed then increment from left
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for(int i=0;i<n;i++)
        {
            int swap=0;
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = 1;
                }
            }
            if(swap==0)
                break;
        }
        int left=0,right=n-1,sum=0;
        int target=sc.nextInt();
        while(left<right)
        {
            sum=arr[left]+arr[right];
            if(sum>target)
                right--;
            else if(sum<target)
                left++;
            else
            {
                System.out.println("YES");
                System.out.println("{"+left+","+right+"}"); //these return pos from sorted arr and we need pos of og arr for which we will use the hashmap approac
                return;
            }
        }
        System.out.println("NO");
        System.out.println("{-1,-1}");
    }
}
