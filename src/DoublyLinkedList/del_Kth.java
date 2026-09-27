package DoublyLinkedList;
import java.util.*;
public class del_Kth {
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

        //we have a doubly linked list now to work on
        //we will assume the numbering is 1 to n in the dll
        int n=4;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter k");
        int k=sc.nextInt();
        if(k==1)
        {
            head=head.next;
            head.prev=null;
        }
        else if(k==n)
        {
            Node curr=head;
            while(curr.next!=null)
            {
                curr=curr.next;
            }
            curr.prev.next=null;
        }
        else {
            Node ptr = head;
            int x = 1;
            while (x < k) {
                ptr = ptr.next;
                x++;
            }
            //ptr points to kth element and p to k-1 th
            Node p = ptr.prev;
            p.next = ptr.next;
            ptr.next.prev = p;
        }
        //display
        Node n1=head;
        while(n1!=null)
        {
            System.out.println(n1.data);
            n1=n1.next;
        }
    }
}
