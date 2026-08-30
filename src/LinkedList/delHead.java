package LinkedList;

public class delHead {
    public static void main(String[] args)
    {
        Node head=null;
        //Node head=new Node(10);
        //Node n1=new Node(20);
        //head.next=n1;
        deleteAtHead(head);
    }
    public static void deleteAtHead(Node head)
    {
        if(head==null)
        {
            System.out.println("Empty list");
            return;
        }
        Node temp=head;
        head=head.next;
        System.out.println(temp.data+"was removed");
        temp=null;
    }
}
