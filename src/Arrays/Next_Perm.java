/*Problem Statement: Given an array Arr[] of integers, rearrange the numbers of the given array into the lexicographically next greater permutation of numbers.

If such an arrangement is not possible, it must rearrange to the lowest possible order (i.e., sorted in ascending order).

Examples
Input: Arr[] = {1,3,2}
Output: {2,1,3}
Explanation: All permutations of {1,2,3} are {{1,2,3} , {1,3,2}, {2,13} , {2,3,1} , {3,1,2} , {3,2,1}}. So, the next permutation just after {1,3,2} is {2,1,3}.
Input : Arr[] = {3,2,1}
Output: {1,2,3}
Explanation : As we see all permutations of {1,2,3}, we find {3,2,1} at the last position. So, we have to return the lowest permutation.
*/

package Arrays;

import java.util.*;

public class Next_Perm
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int index = -1;

        // Step 1: Find breakpoint
        for(int i = n - 2; i >= 0; i--)
        {
            if(arr[i] < arr[i + 1])
            {
                index = i;
                break;
            }
        }

        // Step 2: If no breakpoint, reverse entire array
        if(index == -1)
        {
            reverse(arr, 0, n - 1);
        }
        else
        {
            // Step 3: Find element just greater than arr[index]
            for(int i = n - 1; i > index; i--)
            {
                if(arr[i] > arr[index])
                {
                    swap(arr, i, index);
                    break;
                }
            }

            // Step 4: Reverse the suffix
            reverse(arr, index + 1, n - 1);
        }

        System.out.println("Next Permutation:");

        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void swap(int arr[], int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int arr[], int left, int right)
    {
        while(left < right)
        {
            swap(arr, left, right);
            left++;
            right--;
        }
    }
}