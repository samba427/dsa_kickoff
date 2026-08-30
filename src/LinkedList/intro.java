package LinkedList;
class Node{
    int data;
    Node next;

    Node(int d1,Node n1){ //node for when we have both data and next
        data=d1;
        next=n1;
    }
    Node(int d1){ //node for when we have only data and no next
        data=d1;
        next=null;
    }
}
public class intro {
    public static void main(String[] args) {
        // Create an array
        int[] arr = {2, 5, 8, 7};

        // Create first node
        Node y = new Node(arr[0]); //using constructor 2

        // Print memory reference of node
        System.out.println(y);

        // Print data stored in node
        System.out.println(y.data);
    }
}
