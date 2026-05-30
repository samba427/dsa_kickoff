package Arrays;
import java.util.*;
public class TwoSumHashMap
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

        int target=sc.nextInt();

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++)
        {
            int needed=target-arr[i];
            if(map.containsKey(needed))
            {
                System.out.println("Yes");
                System.out.println("{"+map.get(needed)+","+i+"}");
                return;
            }
            else map.put(arr[i],i);
        }
        System.out.println("NO");
        System.out.println("{-1,-1}");
    }

}
