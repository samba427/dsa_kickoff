package DoublyLinkedList;

public class rev {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            Node n1 = new Node(arr[i]);
            temp.next = n1;
            n1.prev = temp;
            temp = n1;
        }

        //we have a doubly linked list now to work on
        //we will assume the numbering is 1 to n in the dll
        int n = arr.length;

        temp=null;
        Node curr=head;
        while(curr!=null)
        {
            temp=curr.prev;
            curr.prev=curr.next;
            curr.next=temp;

            curr=curr.prev;
        }
        head=temp.prev; //this is key yo

        //display
        Node n1=head;
        while(n1!=null)
        {
            System.out.println(n1.data);
            n1=n1.next;
        }
    }
}
