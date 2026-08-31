package LinkedList;
import java.util.*;
public class revSLL
{
    public static void main(String[] args)
    {
        //Node head=null;
        Node head=new Node(10);
        Node n1=new Node(20);
        head.next=n1;
        head=reverse(head);
        displayList(head);
    }
    public static void displayList(Node head)
    {
        if(head==null)
        {
            System.out.println("empty list");
            return;
        }

        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
    public static Node reverse(Node head)
    {
        Node prev=null,curr=head,next=null;
        while(curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
