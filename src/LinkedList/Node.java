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