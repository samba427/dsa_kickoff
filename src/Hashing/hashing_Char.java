package Hashing;
import java.util.*;
public class hashing_Char
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();

        int hash[]=new int[256];
        for(int i=0;i<str.length();i++)
            hash[str.charAt(i)]++;

        System.out.println("enter character to fetch");
        char ch=sc.nextLine().charAt(0);
        System.out.println(ch+" appears "+hash[ch]+" times.");
    }
}
