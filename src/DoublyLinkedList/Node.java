package DoublyLinkedList;
public class Node
{
    int data;
    Node next;
    Node prev;

    Node(int d1,Node n1,Node p1)
    {
        data=d1;
        next=n1;
        prev=p1;
    }
    Node(int d1)
    {
        data=d1;
        next=null;
        prev=null;
    }
}
