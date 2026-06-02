/*Problem Statement: Given an array nums of n integers.

Return the length of the longest sequence of consecutive integers. The integers in this sequence can appear in any order.

first time using hashset btw
 */

package Arrays;
import java.util.*;
public class LongestConsecutive
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

        HashSet<Integer> set = new HashSet<>();

        // Insert all elements into the set
        for(int num : arr)
            set.add(num);

        int longest = 0;

        for(int num : set)
        {
            // Check if num is the start of a sequence
            if(!set.contains(num - 1))
            {
                int current = num;
                int count = 1;

                while(set.contains(current + 1))
                {
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        System.out.println(longest);
    }
}
