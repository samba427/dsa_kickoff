package LinkedList;
import java.util.*;
public class insertAtHead {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Node head=null;
        int x=0;
        for(int i=1;i<10;i++) {
            x = sc.nextInt();
            head = insertAtHead(head, x);
            displayList(head);
        }
        displayList(head);

    }
    public static Node insertAtHead(Node head, int data)
    {
        if(head==null)
        {
            head=new Node(data);
            return head;
        }
        Node newNode=new Node(data, head);
        return newNode;
    }
    public static void displayList(Node head)
    {
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

}
