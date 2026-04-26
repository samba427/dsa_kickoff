// we will be finding the maximum freq element and minimum freq element
// the plan is to use a hashmap
package Hashing;
import java.util.*;
public class max_min_freq
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int key=arr[i];
            int freq=0;
            if(mp.containsKey(key))
                freq=mp.get(key);
            freq++;
            mp.put(key,freq);
        }


        int maxf=0,minf=n,max=0,min=0;
        for (Map.Entry<Integer, Integer> it : mp.entrySet())
        {
            int ele=it.getKey();
            int count=it.getValue();

            if(count>maxf)
            {
                maxf=count;
                max=ele;
            }
            if(count<minf)
            {
                minf=count;
                min=ele;
            }
        }

        System.out.println("highest occuring element is "+max);
        System.out.println("lowest occuring element is "+min);
    }
}
