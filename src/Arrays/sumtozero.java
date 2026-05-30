package Arrays;
import java.util.*;
public class sumtozero
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLen = 0;

        for(int i = 0; i < n; i++)
        {
            sum += arr[i];

            // if total sum itself becomes 0
            if(sum == 0)
            {
                maxLen = i + 1;
            }

            // if sum seen before
            if(map.containsKey(sum))
            {
                int len = i - map.get(sum);
                maxLen = Math.max(maxLen, len);
            }
            else
            {
                // store first occurrence only
                map.put(sum, i);
            }
        }

        System.out.println(maxLen);
    }
}
