package LinkedList;
import java.util.*;
public class search
{
    public static void main(String[] args)
    {
        //Node head=null;
        Node head=new Node(10);
        Node n1=new Node(20);
        head.next=n1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value to be searched ");
        int val=sc.nextInt();
        int ans=searchLL(head,val);
        if(ans!=-1)
            System.out.println("present in LL at position "+ans);
        else System.out.println("not found");
    }
    public static int searchLL(Node head,int val)
    {
        //if(head==null) dont need this cause the loop will take us directly to final return if head is null
            //return -1;
        int c=0;
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==val)
                return c;
            temp=temp.next;
            c++;
        }
        return -1;  // we reach here iff we didnt find the value when searching
    }
}
