//array has + and - elements mixed and we need to find longest subarray adding up to 0
//we use hashmaps storing prefix sum n all that
package Arrays;
import java.util.*;
public class SumToZero
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of arr");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i;
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();

        int sum=0,maxlen=0;

        for(i=0;i<n;i++)
        {
            sum+=arr[i];

            if(sum==0)
                maxlen=i+1;

            if(map.containsKey(sum)) //key value pair of sum which is prefix sum and index
            {
                int len=i-map.get(sum);
                maxlen=Math.max(len,maxlen);
            }

            else map.put(sum,i);
        }
        System.out.println(maxlen);

    }
}
