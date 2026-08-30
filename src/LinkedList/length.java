package LinkedList;
import java.util.*;
public class length {
    public static void main(String[] args)
    {
        //Node head=null;
        Node head=new Node(10);
        Node n1=new Node(20);
        head.next=n1;
        System.out.println(lengthOf(head));
    }
    static int lengthOf(Node head)
    {
        if(head==null)
            return 0;
        Node temp=head;
        int c=0;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        return c;
    }
}
