package Arrays;
import java.util.*;
public class MAjorityELement //basically search for element that has majority in the array alr
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

        int count=0,element=0;
        for(i=0;i<n;i++)
        {
            if (count==0)
                element=arr[i];
            if (element==arr[i])
                count++;
            else count--;
        }
        System.out.println(element);
    }
}
