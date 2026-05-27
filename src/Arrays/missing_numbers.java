package Arrays;
import java.util.Scanner;
public class missing_numbers
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println(n);
        sc.nextLine();
        System.out.println("Enter a message");
        String s=sc.nextLine();
        System.out.println(s);
        for(int i=0;i<s.length();i++)
        {
            System.out.print(s.charAt(i));
        }
    }
}
