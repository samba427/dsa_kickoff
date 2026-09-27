package DoublyLinkedList;
public class arrToDll {
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4};
        Node head=new Node(arr[0]);
        Node temp=head;
        for(int i=1;i<arr.length;i++)
        {
            Node n1=new Node(arr[i]);
            temp.next=n1;
            n1.prev=temp;
            temp=n1;
        }

        Node n1=head;
        while(n1!=null)
        {
            System.out.println(n1.data);
            n1=n1.next;
        }
    }
}
