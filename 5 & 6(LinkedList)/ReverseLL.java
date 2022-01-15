//Reverse A linked list

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
    Node(){}
}

public class LinkedList{
    Node head;
        
    Node Reverse(Node node){
        Node prev = null;
        Node curr = node;
        Node next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node = prev;
        return node;
    }
    
    void printLL(Node node){
        while(node!=null){
            System.out.println(node.data+" ");
            node = node.next;
        }
    }
    
    public static void main (String[] args) {
        LinkedList ll = new LinkedList();
        ll.head = new Node(85);
        ll.head.next = new Node(15);
        ll.head.next.next = new Node(4);
        ll.head.next.next.next = new Node(20);
        
        ll.printLL(ll.head);
        
        ll.head = ll.Reverse(ll.head);
        ll.printLL(ll.head);
    }
}