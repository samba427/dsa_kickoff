//single number 3... here we have two single numbers in an arr with other nums appearing more than once
//the trick we use is buckets with bit manipulation... we find a num with only one set bit by xor of two unique nums then the result and with itself - 1 and that is and with original result
//this num is now used to check all nums in arr which put them in two buckets... xor over nums of each bucket gives us the two unique elements

package Bit_Manipulation;
import javax.crypto.spec.PSource;
import java.util.*;
public class single_III
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array length");
        int n=sc.nextInt();
        System.out.println("Enter arr elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int xor=0,b1=0,b2=0;

        for(int i=0;i<n;i++)
        {
            xor^=arr[i];
        }
        int rightmost=(xor & xor-1) ^ xor; //rightmost basically give us rightmost differing bit of the two nums

        for(int i=0;i<n;i++)
        {
                if((arr[i]&rightmost)!=0)
                    b1^=arr[i];
                else b2^=arr[i];
        }
        System.out.println(b1+" "+b2);
    }

}
