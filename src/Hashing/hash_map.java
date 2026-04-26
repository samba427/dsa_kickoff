package Hashing;
import java.util.*;
public class hash_map
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter length");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        HashMap<Integer, Integer>mp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int key=arr[i];
            int freq=0;
            if(mp.containsKey(key))
                freq=mp.get(key);
            freq++;
            mp.put(key,freq);
        }

        for (Map.Entry<Integer, Integer> it : mp.entrySet()) {
            System.out.println(it.getKey() + "->" + it.getValue()); //for checking sm
        }

        System.out.println("enter number to check for");
        int num=sc.nextInt();
        System.out.println(num+" appears "+mp.get(num)+" times.");

    }
}
